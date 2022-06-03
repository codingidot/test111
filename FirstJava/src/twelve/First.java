package twelve;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField textField3;
	private JTextField textField1;
	private JTextField textField5;
	private JTextField textField4;
	private JTextField textField2;
	private JTextField textField6;

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
		setBounds(100, 100, 422, 300);
		contentPane = new JPanel();
		contentPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 395, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(5, 3, 65, 20);
		panel.add(label);
		
		textField2 = new JTextField();
		textField2.setText("\uC2DC");
		textField2.setBounds(70, 23, 65, 65);
		panel.add(textField2);
		textField2.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(135, 3, 65, 20);
		panel.add(label_1);
		
		textField4 = new JTextField();
		textField4.setText("\uBD84");
		textField4.setBounds(200, 23, 65, 65);
		panel.add(textField4);
		textField4.setColumns(10);
		
		textField5 = new JTextField();
		textField5.setBounds(265, 23, 65, 65);
		panel.add(textField5);
		textField5.setColumns(10);
		
		textField6 = new JTextField();
		textField6.setText("\uCD08");
		textField6.setBounds(330, 23, 65, 65);
		panel.add(textField6);
		textField6.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(5, 23, 65, 65);
		panel.add(textField1);
		textField1.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(70, 23, 65, 20);
		panel.add(label_2);
		
		textField3 = new JTextField();
		textField3.setBounds(135, 23, 65, 65);
		panel.add(textField3);
		textField3.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(200, 23, 65, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(265, 23, 65, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(330, 23, 65, 20);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(5, 43, 65, 20);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(70, 43, 65, 20);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(135, 43, 65, 20);
		panel.add(label_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(108, 146, 190, 94);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uBD10");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					btnNewButton.setEnabled(false);
					Timer t1=new Timer();
					t1.scheduleAtFixedRate(new TimerTask() {
						public void run() {
							Date d1=new Date(); //util·Î import
							textField1.setText(String.valueOf(d1.getHours()));
							textField3.setText(String.valueOf(d1.getMinutes()));
							textField5.setText(String.valueOf(d1.getSeconds()));
						}
					}, 1000, 1000);
					
				}
					
			}
		});
		btnNewButton.setBounds(12, 10, 166, 53);
		panel_1.add(btnNewButton);
	}
}
