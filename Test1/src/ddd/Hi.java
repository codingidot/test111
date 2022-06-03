package ddd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Hi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hi frame = new Hi();
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
	public Hi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(99, 29, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 89, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 155, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(30, 32, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC778\uC6D0\uC218");
		lblNewLabel_1.setBounds(12, 92, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uBC29\uC774\uB984");
		lblNewLabel_2.setBounds(12, 158, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\uBC29\uB9CC\uB4E4\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new TcpMulClient(textField.getText(),Integer.parseInt(textField_3.getText()) );
				
				
				
			}
		});
		btnNewButton.setBounds(264, 209, 97, 23);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 210, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uD3EC\uD2B8\uBC88\uD638");
		lblNewLabel_3.setBounds(12, 213, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("\uC11C\uBC84\uC2E4\uD589");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				new ServerClass(Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_1.getText())
						, textField.getText());
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			}
		});
		btnNewButton_1.setBounds(264, 154, 97, 23);
		contentPane.add(btnNewButton_1);
	}
}
