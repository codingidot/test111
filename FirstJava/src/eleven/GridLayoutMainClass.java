package eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutMainClass extends Frame {// Third
	
	GridLayoutMainClass(){// 생성자
		//Grid: 격자
		
		this.setLayout(new GridLayout(2,3));//2행 3열
		//GridLayout(2,3,10,10) 2행3일 이면서 좌우의 margin, 뒤에는 상하 margin
		
		
		this.add(new Button("눌러봐"));
		this.add(new Button("골라봐"));
		this.add(new Button("웬열?"));
		this.add(new Button("뭥미?"));
		this.add(new Button("뭘 눌러?"));
		this.add(new Button("아무거나"));
		this.setSize(300, 300);
		this.setVisible(true);
		//------------------------------------------------
		//이부분이 없으면 창을 못닫음
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
