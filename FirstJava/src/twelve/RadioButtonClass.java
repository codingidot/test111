package twelve;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RadioButtonClass extends Frame{
	public RadioButtonClass() {
	}//Sixth

	public static void main(String[] args) {

		RadioButtonClass rb1=new RadioButtonClass();
		rb1.setTitle("라디오버틑");
		
		CheckboxGroup ck1=new CheckboxGroup();//라디오버튼 만들 때 사용
		Checkbox cb1=new Checkbox("사과", ck1, false);//중간에 ck1있음
		Checkbox cb2=new Checkbox("배", ck1, false);
		Checkbox cb3=new Checkbox("감", ck1, false);
		rb1.setLayout(new FlowLayout());//가로정렬
		
		rb1.add(cb1);// 라디오버튼 프레임 추가
		rb1.add(cb2);
		rb1.add(cb3);
		
		rb1.setSize(500,500);
		rb1.setVisible(true);
	}

}
