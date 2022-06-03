package ddd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public String title;
	public int limit;
	private String id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
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
	public Game() {};
	public Game(String id, int limit, String title) {
		id=this.id;
		limit=this.limit;
		title=this.title;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 230, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 147, 167, 84);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(152, 229, 97, 23);
		contentPane.add(btnNewButton);
		this.setVisible(true);
	}
}
