package ten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class BMIGUI2 extends JFrame implements ActionListener{

	private JButton b1=new JButton("BMI계산");
	private JLabel la1=new JLabel("당신의 키는 ");
	private JLabel la2=new JLabel("몸무게는");
	private JTextField tf1=new JTextField();
	private JTextField tf2=new JTextField();
	private JTextField tf3=new JTextField();
	
	public BMIGUI2() {
		 

        this.setLayout(null);
        b1.setSize(100,70);//버튼 크기
        b1.setLocation(200,300);//버튼 내부위치
        this.add(b1);//버튼 추가
        b1.addActionListener(this); //버튼을 이벤트로
        
        la1.setSize(90,30);
        la1.setLocation(20,70);//라벨 내부위치
        this.add(la1);//라벨 추가
        
        tf1.setSize(70,30);
        tf1.setLocation(120,70);//텍스트 내부위치
        this.add(tf1);//라벨 추가
        
        la2.setSize(90,30);
        la2.setLocation(20,100);//라벨 내부위치
        this.add(la2);//라벨 추가
        
        tf2.setSize(70,30);
        tf2.setLocation(120,100);//텍스트 내부위치
        this.add(tf2);
        
        tf3.setSize(400,50);
        tf3.setLocation(20,400);//텍스트 내부위치
        this.add(tf3);
        
        this.setSize(500,500);//프레임 크기
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //swing 특징, 창을 완벽히 닫음
			
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
						result="비만";
				else if(bmi>=25.0) 
					result="과체중";
				else if(bmi>=20.0) 
					result="보통";
				else 
					result="저체중";
				tf3.setText("당신의 bmi지수는"+bmi+"이며"+result+"이군요");
				
			} catch(NumberFormatException e) {
				tf3.setText("키와 몸무게에 숫자를 넣어주세요");
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
