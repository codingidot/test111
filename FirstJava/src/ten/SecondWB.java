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
	JLabel lblTitle;  //�Ķ��� �۾��� ���� ����� ����
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
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uBD10"); //ubicode (������)
		btnNewButton.addActionListener(new ActionListener() {
				     // �̺�Ʈ ���			//�̺�Ʈ �������̽�
			public void actionPerformed(ActionEvent e) {//�̺�Ʈ�ڵ鷯(�̺�Ʈó���Լ�)
				//���⿡ ���� ���� : ���� �̺�Ʈ ��ư�̳�? �׷��� �󺧿� "�ȳ� wb"
			
				lblTitle.setText("�ȳ� wb");   //�̺κ��� ������ ����
			}
		});
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton.setBounds(152, 105, 165, 54); //��ġ�� ũ�⸦ ���� ���η� 152 ���η� 105 ���������� ���α��� 165 ���α��� 54�� ��ư  �׸�
		contentPane.add(btnNewButton);
		
	    lblTitle = new JLabel("");
		lblTitle.setBounds(104, 31, 253, 54);
		contentPane.add(lblTitle);
		
		btnNewButton_1 = new JButton("\uB20C\uB7EC!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					lblNewLabel.setText("¥��~~");
				
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 17));
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setBounds(120, 183, 165, 44);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 183, 96, 44);
		contentPane.add(lblNewLabel);
	}
}
