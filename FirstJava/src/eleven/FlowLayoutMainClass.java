package eleven;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutMainClass extends Frame { //Second
	public FlowLayoutMainClass() {
		//setLayout(null) �� ������ ���Ǵ��
		this.setLayout(new FlowLayout());
		//���� �߾�����, ��ȣ�¿� 5�ȼ� ����
		//��, �¿��� ��� ��ġ, �ٽ� ������ ��� ����, ���� �ٿ����� ��� ����
		// ������ �����츦 ũ�⸦ ���̰ų� �þ����� �ڵ�����
		this.add(new Button("������"));
		this.add(new Button("����"));
		this.add(new Button("����?"));
		this.add(new Button("�o��?"));
		this.add(new Button("�� ����?"));
		this.add(new Button("�ƹ��ų�"));
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		
		FlowLayoutMainClass flc1=new FlowLayoutMainClass();
		
		
	}

}
