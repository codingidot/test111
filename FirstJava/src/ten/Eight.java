package ten;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.Font;

public class Eight extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eight frame = new Eight();
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
	public Eight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource()==comboBox) {
					System.out.println(comboBox.getSelectedIndex());
					System.out.println(comboBox.getSelectedItem());
				
					if(comboBox.getSelectedItem().equals("사과"))
						textField.setText("잘골랐구만~~~");
						
				    if(comboBox.getSelectedIndex()==1)
						textField.setText("노란과일이구만~~~");
					if(comboBox.getSelectedItem().equals("감"))
						textField.setText("꼭지떼고먹자~");
					
				}	
				
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC0AC\uACFC", "\uBC30", "\uAC10"}));
		comboBox.setBounds(90, 45, 117, 23);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984\uC740");
		lblNewLabel.setBounds(21, 49, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(90, 14, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl1 = new JLabel("\uACF5\uBD80\uD574\uC57C\uC9C0..");
		lbl1.setFont(new Font("궁서체", Font.PLAIN, 35));
		lbl1.setForeground(Color.PINK);
		lbl1.setBounds(21, 116, 309, 77);
		contentPane.add(lbl1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource()==comboBox_1) {
					System.out.println(comboBox_1.getSelectedIndex());
					System.out.println(comboBox_1.getSelectedItem());
					
					if(comboBox_1.getSelectedIndex()==0) {
						lbl1.setText("실기만 합격하면 끝");
					} else if(comboBox_1.getSelectedItem()=="sqld") {
						lbl1.setText("이것도 공부해야지..");
					}else if(comboBox_1.getSelectedIndex()==2) {
							lbl1.setText("기초중에 기초");
				    }else if(comboBox_1.getSelectedIndex()==3) {
						lbl1.setText("금방하지");
					}else if(comboBox_1.getSelectedIndex()==4) {
							lbl1.setText("해야지해야지");
				    }
					
				}
					
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC815\uCC98\uAE30", "sqld", "\uC790\uBC14", "html", "css "}));
		comboBox_1.setBounds(21, 203, 206, 23);
		contentPane.add(comboBox_1);
	}
}
