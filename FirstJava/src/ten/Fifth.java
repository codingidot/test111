package ten;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fifth extends JFrame {

	private JPanel contentPane;
	private JTextField txtILoveYou;
	JLabel lblNewLabel;
	JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifth frame = new Fifth();
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
	public Fifth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(29, 23, 357, 101);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    // 첫번째 버튼을 클릭하면 color를 red
				txtILoveYou.setForeground(Color.red);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-paint-bucket-10-72.png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			txtILoveYou.setForeground(Color.green);
			lblNewLabel.setForeground(Color.blue);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-paint-bucket-4-48.png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 //font 크기 50
				txtILoveYou.setFont(new Font("굴림", Font.BOLD,50));
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-text-1-32.png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtILoveYou.setFont(new Font("굴림",Font.BOLD, 5));
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-text-3-32.png")));
		toolBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//실행종료-윈도우 닫기
				//return; ==>강제종료
				// c언어 :exit(1) ,  자바: System.exit(1),  c#: Enviroment.Exit(1)
			System.exit(1);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Fifth.class.getResource("/krim/bb.png")));
		toolBar.add(btnNewButton_4);
		
		//JLabel => 한줄라벨 (출력만가능)
		//textField => 한줄 글상자 (입력, 출력 둘다 가능)
		txtILoveYou = new JTextField();
		txtILoveYou.setBounds(33, 148, 116, 21);
		txtILoveYou.setText("I love you");
		contentPane.add(txtILoveYou);
		txtILoveYou.setColumns(10);
		
		lblNewLabel = new JLabel("i love youl");
		lblNewLabel.setBounds(29, 196, 92, 21);
		contentPane.add(lblNewLabel);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setBounds(111, 179, 283, 54);
		contentPane.add(toolBar_1);
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-paint-bucket-4-48.png")));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setForeground(Color.CYAN);
			}
		});
		toolBar_1.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					lbl1.setBackground(Color.red);
					lbl1.setForeground(Color.yellow);
			}
		});
		btn2.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-paint-bucket-10-72.png")));
		toolBar_1.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl1.setFont(new Font("맑음",Font.BOLD, 50));
			}
		});
		btn3.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-text-1-32.png")));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar_1.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setFont(new Font("고딕",Font.ITALIC, 60));
			}
		});
		btn4.setIcon(new ImageIcon(Fifth.class.getResource("/krim/iconmonstr-text-3-32.png")));
		toolBar_1.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btn5.setIcon(new ImageIcon(Fifth.class.getResource("/krim/cc.png")));
		toolBar_1.add(btn5);
		
		 lbl1 = new JLabel("New label");
		lbl1.setBounds(196, 137, 133, 32);
		contentPane.add(lbl1);
	}
}
