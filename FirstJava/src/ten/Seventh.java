package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Seventh extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seventh frame = new Seventh();
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
	public Seventh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 10, 193, 166);
		contentPane.add(scrollPane);
		
		JTextArea txtrFfffffffffffffffffffffffffffffffffff = new JTextArea();
		txtrFfffffffffffffffffffffffffffffffffff.setText("ffffffffffffffffffffffffffffffffffffd\r\nd\r\nd\r\nd\r\nd\r\n\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\nd\r\n");
		scrollPane.setViewportView(txtrFfffffffffffffffffffffffffffffffffff);
	}
}
