package telinfoPrintMain;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import telinfoDAO.TelInfoDAO;
import javax.swing.JLabel;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(107, 83, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 112, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC911\uBCF5\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelInfoDAO tidao=new TelInfoDAO();
					tidao.search_id(textField.getText());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(252, 82, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC778");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelInfoDAO tidao=new TelInfoDAO();
					tidao.login_go(textField.getText(), textField_1.getText());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(252, 189, 97, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(12, 86, 57, 15);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 115, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uB85C\uADF8\uC778");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(12, 10, 137, 48);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("\uB2EB\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnNewButton_2.setBounds(361, 189, 97, 23);
		contentPane.add(btnNewButton_2);
	}

}
