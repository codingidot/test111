package eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutMainClass extends Frame{ //Fourth
	
	BorderLayoutMainClass(){
		this.setLayout(new BorderLayout()); //��, ��, ��, �� �߾����� ��ġ
		
		this.add(BorderLayout.EAST,new Button("������1"));
		this.add(BorderLayout.WEST,new Button("������2"));
		this.add(BorderLayout.SOUTH,new Button("������3"));
		this.add(BorderLayout.NORTH,new Button("������4"));
		this.add(BorderLayout.CENTER,new Button("������5"));
		this.setSize(700, 700);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new BorderLayoutMainClass();
		
	}

}
