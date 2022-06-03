package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWB extends JFrame {

	private JPanel contentPane;
	JLabel lblTitle;  //파란색 글씨는 전역 밤색은 지역
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondWB frame = new SecondWB();
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
	public SecondWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uBD10"); //ubicode (눌러봐)
		btnNewButton.addActionListener(new ActionListener() {
				     // 이벤트 등록			//이벤트 인터페이스
			public void actionPerformed(ActionEvent e) {//이벤트핸들러(이벤트처리함수)
				//여기에 내용 수록 : 지금 이벤트 버튼이냐? 그러면 라벨에 "안녕 wb"
			
				lblTitle.setText("안녕 wb");   //이부분이 공부할 내용
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(152, 105, 165, 54); //위치와 크기를 설정 가로로 152 세로로 105 떨어진곳에 가로길이 165 세로길이 54인 버튼  그림
		contentPane.add(btnNewButton);
		
	    lblTitle = new JLabel("");
		lblTitle.setBounds(104, 31, 253, 54);
		contentPane.add(lblTitle);
		
		btnNewButton_1 = new JButton("\uB20C\uB7EC!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					lblNewLabel.setText("짜잔~~");
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBounds(120, 183, 165, 44);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 183, 96, 44);
		contentPane.add(lblNewLabel);
	}
}
