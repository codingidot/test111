package eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutMainClass extends Frame {// Third
	
	GridLayoutMainClass(){// ������
		//Grid: ����
		
		this.setLayout(new GridLayout(2,3));//2�� 3��
		//GridLayout(2,3,10,10) 2��3�� �̸鼭 �¿��� margin, �ڿ��� ���� margin
		
		
		this.add(new Button("������"));
		this.add(new Button("����"));
		this.add(new Button("����?"));
		this.add(new Button("�o��?"));
		this.add(new Button("�� ����?"));
		this.add(new Button("�ƹ��ų�"));
		this.setSize(300, 300);
		this.setVisible(true);
		//------------------------------------------------
		//�̺κ��� ������ â�� ������
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {

		GridLayoutMainClass glc1=new GridLayoutMainClass();
		
		
		
		
	}

}
