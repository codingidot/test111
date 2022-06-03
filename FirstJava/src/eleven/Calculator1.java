package eleven;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String soo1="";
	String soo2="";
	String calc="";
	double dap=0;
	long soo_1=0;
	double soo_2=0;
	int sw=0;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
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
	public Calculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(29, 28, 287, 151);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="1";
					textField.setText(soo1+soo2);
				}else {
					soo1+="1";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="2";
					textField.setText(soo1+soo2);
				}else {
					soo1+="2";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="3";
					textField.setText(soo1+soo2);
				}else {
					soo1+="3";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(Color.BLUE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soo_1=Long.parseLong(soo1);
				soo1+="+";
				textField.setText(soo1);
				calc="+";
				sw=1;
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		panel_1.add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="4";
					textField.setText(soo1+soo2);
				}else {
					soo1+="4";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="5";
					textField.setText(soo1+soo2);
				}else {
					soo1+="5";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="6";
					textField.setText(soo1+soo2);
				}else {
					soo1+="6";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(Color.BLUE);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soo_1=Long.parseLong(soo1);
				soo1+="-";
				textField.setText(soo1);
				calc="-";
				sw=1;
				
			}
		});
		btnMinus.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		panel_1.add(btnMinus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="7";
					textField.setText(soo1+soo2);
				}else {
					soo1+="7";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="8";
					textField.setText(soo1+soo2);
				}else {
					soo1+="8";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="9";
					textField.setText(soo1+soo2);
				}else {
					soo1+="9";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn9);
		
		JButton btnGop = new JButton("*");
		btnGop.setBackground(Color.BLUE);
		btnGop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soo_1=Long.parseLong(soo1);
				soo1+="*";
				textField.setText(soo1);
				calc="*";
				sw=1;
			}
		});
		btnGop.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		panel_1.add(btnGop);
		
		JButton btnEC = new JButton("EC");
		btnEC.setBackground(Color.RED);
		btnEC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sw=0;
				soo1="";
				soo2="";
				soo_1=0;
				soo_2=0;
				textField.setText(soo1);
			}
		});
		panel_1.add(btnEC);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sw==1) {
					soo2+="0";
					textField.setText(soo1+soo2);
				}else {
					soo1+="0";
				textField.setText(soo1);
				}
			}
		});
		panel_1.add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.YELLOW);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soo_2=Double.parseDouble(soo2);
				if(calc=="+") {
					dap=soo_1+soo_2;
					textField.setText(String.valueOf(dap));
				} else if(calc=="-") {
					dap=soo_1-soo_2;
					textField.setText(String.valueOf(dap));
				} else if(calc=="*") {
					dap=soo_1*soo_2;
					textField.setText(String.valueOf(dap));
				} else if(calc=="/") {
					dap=soo_1/soo_2;
					textField.setText(String.valueOf(dap));
				} 
				sw=0;
				soo1="";
				soo2="";
				soo_1=0;
				soo_2=0;
			}
		});
		btnEqual.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		panel_1.add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(Color.BLUE);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soo_1=Long.parseLong(soo1);
				soo1+="/";
				textField.setText(soo1);
				calc="/";
				sw=1;
			}
		});
		btnDivide.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		panel_1.add(btnDivide);
	}
}
