package twelve;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC0AC\uACFC");
		rdbtnNewRadioButton.setBounds(8, 42, 81, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uBC30");
		rdbtnNewRadioButton_1.setBounds(114, 42, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\uAC10");
		rdbtnNewRadioButton_2.setBounds(290, 42, 121, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(46, 121, 115, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(194, 121, 115, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(8, 28, 414, 56);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(355, 205, -320, -85);
		contentPane.add(textPane_1);
	}
}
