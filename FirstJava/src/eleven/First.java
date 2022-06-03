package eleven;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class First extends JFrame {

	private JPanel contentPane;
    
	int price=0;
    String str="";
	String msg2="";
	JList list2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("**\uAD7F\uBC84\uAC70 \uD584\uBC84\uAC70 \uC785\uB2C8\uB2E4 **");
		lbl1.setBounds(35, 21, 188, 29);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("\uB4DC\uC2E4 \uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		lbl2.setBounds(246, 21, 188, 29);
		contentPane.add(lbl2);
		
		JButton btn1 = new JButton("\uB9E4\uC6B4 \uC18C\uC2A4 \uD584\uBC84\uAC70:4500\uC6D0 ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1)
				price+=4500;
				str+="매운 소수 햄버거(4500) \n";
			}
		});
		btn1.setBounds(12, 72, 188, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("\uC57C\uCC44 \uC0C8\uC6B0 \uD584\uBC84\uAC70: 4500\uC6D0");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2)
				price+=4500;
				str+="야채 새우 햄버거(4500) \n";
			}
		});
		btn2.setBounds(12, 130, 188, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("\uB354\uBE14 \uBE44\uD504\uBC84\uAC70:  7000\uC6D0");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn3)
					price+=7000;
					str+="더블 비프 햄버거(7000) \n";
			}
		});
		btn3.setBounds(223, 72, 188, 29);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("\uC138\uACB9 \uD1A0\uB9C8\uD1A0 \uD584\uBC84\uAC70:5500\uC6D0");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn4)
					price+=5500;
					str+="세겹 토마토 햄버거(5500) \n";
			}
		});
		btn4.setBounds(223, 130, 188, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("\uCDE8\uC18C\uD569\uB2C8\uB2E4");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn5)
					price=0;
					str="";
					msg2="";
					JOptionPane.showMessageDialog(btn5, "취소했습니다");
					list2.setEnabled(true);
			}
		});
		btn5.setBackground(Color.ORANGE);
		btn5.setBounds(223, 187, 188, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("\uC8FC\uBB38\uD569\uB2C8\uB2E4");
		btn6.setBackground(Color.GREEN);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arr= {"확인", "취소"};
				msg2=str+"합계금액: "+String.valueOf(price)+"원";
							      //숫자를 문자열로 바꾸는 함수
				if(e.getSource()==btn6)
					JOptionPane.showConfirmDialog(btn6, msg2, "확인하세요", JOptionPane.YES_NO_OPTION);
												 //버튼위치에서 창이 떴다
				 str="";
				 msg2="";
				 price=0;
				 
			}
		});
		btn6.setBounds(12, 190, 188, 29);
		contentPane.add(btn6);
		
		list2 = new JList();
		list2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {//twice이벤트 버그 방지
				if(!list2.getValueIsAdjusting()) {
							//if(e.getSource()==list2)
					int index1=list2.getSelectedIndex();
					String indexElement1=(String)list2.getModel().getElementAt(index1);
					if(indexElement1.equals("노량진")) {
						price=price-1000;
					}
					list2.setEnabled(false); //반투명// 비활성화// 한번누루면 한번만 디스카운트되도록
				}
			}
		});
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list2.setModel(new AbstractListModel() {
			String[] values = new String[] {"\uB178\uB7C9\uC9C4", "\uB178\uB7C9\uC9C4 \uC678"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list2.setBounds(12, 239, 188, 48);
		contentPane.add(list2);
	}
}
