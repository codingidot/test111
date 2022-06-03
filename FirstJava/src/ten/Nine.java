package ten;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Nine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnStrart ;

	/**
	 * Launch the application.
	 */
	
	//---------------------------------------------
	//초기치
	static int sw=0;
	static int sw11=0;
	static String s2="                     홧팅~~~~";
	static String s1="                  I LOVE YOU";
		//System.println() // 클래스.스태틱메소드()
	Timer t1=new Timer();
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btn11;
	
	//----------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nine frame = new Nine();
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
	public Nine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 23));
		textField.setBounds(63, 21, 305, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnStrart = new JButton("\uC2DC\uC791");
		btnStrart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStrart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	t1.scheduleAtFixedRate(task, 0, 250);
				if(e.getSource()==btnStrart&& sw==0) {
					btnStrart.setEnabled(false); //아이콘을 반투명으로
													//b1.setVisible(false);와 혼동 금지
					t1.scheduleAtFixedRate(new TimerTask(){
						public void run() {
							s1=s1.substring(1, s1.length())+s1.substring(0,1);
							textField.setText(s1);
						}
					}, 0, 250);
						}
					sw=1;
				}
		});
		btnStrart.setBackground(Color.GREEN);
		btnStrart.setBounds(167, 138, 97, 23);
		contentPane.add(btnStrart);
		
		JButton btnStop = new JButton("\uB044~\uC755");
		btnStop.setForeground(Color.BLUE);
		btnStop.setBackground(Color.MAGENTA);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//---------------------------------------------------------		
				if(e.getSource()==btnStop) { // 끝 버튼이 눌러졌으면(이벤트)
					t1.cancel(); ////타이머 끄~~~읕
				}
		//----------------------------------------------------		
			}
		});
		btnStop.setBounds(167, 169, 97, 23);
		contentPane.add(btnStop);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 71, 305, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("\uC2DC\uC790\uC545");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnNewButton&& sw11==0) {
					btnNewButton.setEnabled(false); //아이콘을 반투명으로
													//b1.setVisible(false);와 혼동 금지
					t1.scheduleAtFixedRate(new TimerTask(){
						public void run() {
							s2=s2.substring(1, s2.length())+s2.substring(0,1);
							textField_1.setText(s2);
						}
					}, 0, 250);
						}
					sw11=1;
				}
		
			}
		);
		btnNewButton.setBounds(271, 136, 97, 23);
		contentPane.add(btnNewButton);
		
		btn11 = new JButton("\uBA48\uCDB0");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11)
				t1.cancel();
			}
		});
		btn11.setBounds(276, 169, 97, 23);
		contentPane.add(btn11);
	}

}
