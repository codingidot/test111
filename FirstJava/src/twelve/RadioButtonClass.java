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
		rb1.setTitle("�������z");
		
		CheckboxGroup ck1=new CheckboxGroup();//������ư ���� �� ���
		Checkbox cb1=new Checkbox("���", ck1, false);//�߰��� ck1����
		Checkbox cb2=new Checkbox("��", ck1, false);
		Checkbox cb3=new Checkbox("��", ck1, false);
		rb1.setLayout(new FlowLayout());//��������
		
		rb1.add(cb1);// ������ư ������ �߰�
		rb1.add(cb2);
		rb1.add(cb3);
		
		rb1.setSize(500,500);
		rb1.setVisible(true);
	}

}
