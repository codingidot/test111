package ten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class BMIGUI2 extends JFrame implements ActionListener{

	private JButton b1=new JButton("BMI���");
	private JLabel la1=new JLabel("����� Ű�� ");
	private JLabel la2=new JLabel("�����Դ�");
	private JTextField tf1=new JTextField();
	private JTextField tf2=new JTextField();
	private JTextField tf3=new JTextField();
	
	public BMIGUI2() {
		 

        this.setLayout(null);
        b1.setSize(100,70);//��ư ũ��
        b1.setLocation(200,300);//��ư ������ġ
        this.add(b1);//��ư �߰�
        b1.addActionListener(this); //��ư�� �̺�Ʈ��
        
        la1.setSize(90,30);
        la1.setLocation(20,70);//�� ������ġ
        this.add(la1);//�� �߰�
        
        tf1.setSize(70,30);
        tf1.setLocation(120,70);//�ؽ�Ʈ ������ġ
        this.add(tf1);//�� �߰�
        
        la2.setSize(90,30);
        la2.setLocation(20,100);//�� ������ġ
        this.add(la2);//�� �߰�
        
        tf2.setSize(70,30);
        tf2.setLocation(120,100);//�ؽ�Ʈ ������ġ
        this.add(tf2);
        
        tf3.setSize(400,50);
        tf3.setLocation(20,400);//�ؽ�Ʈ ������ġ
        this.add(tf3);
        
        this.setSize(500,500);//������ ũ��
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //swing Ư¡, â�� �Ϻ��� ����
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e1) {

		if(e1.getSource()==b1) {
			try {
				int ki=Integer.parseInt(tf1.getText());
				int mom=Integer.parseInt(tf2.getText());
				
				double mki=ki/100.0;
				double bmi=mom /Math.pow(mki, 2);
				
				String result;
				if(bmi>=30.0)
						result="��";
				else if(bmi>=25.0) 
					result="��ü��";
				else if(bmi>=20.0) 
					result="����";
				else 
					result="��ü��";
				tf3.setText("����� bmi������"+bmi+"�̸�"+result+"�̱���");
				
			} catch(NumberFormatException e) {
				tf3.setText("Ű�� �����Կ� ���ڸ� �־��ּ���");
			} catch(Exception e) {
				tf3.setText(e.getMessage());
			}
		}
	}
	
}

public class _100_JBMIGUI {

	public static void main(String[] args) {
		
		
			new BMIGUI2();
	}

}
