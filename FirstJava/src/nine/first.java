package nine;

import java.util.LinkedList;
import java.util.Queue;

public class first {

	public static void main(String[] args) {
		
		Queue <String> q1=new LinkedList<String>();//(o)
		q1.offer("�ٺ�");
		q1.offer("�´�");
		q1.offer("�򰭰���");
		
		System.out.println(q1.size());
		
		System.out.println(q1);
		
		
		//�����÷ο�� ���� �ִ� �ͺ��� ������ �־� ��ġ�°� ����÷���� ���µ� �� �����°�
		if(!q1.isEmpty()) //����÷ο츦 �����ϱ� ���� ����� 
			q1.poll(); //���°�
		if(!q1.isEmpty())
			q1.poll();
		q1.offer("ȫ�浿");
		
		System.out.println(q1);
		
		//stack
			//lifo filo (push pop)
		//Last in First Out
		//First in Last out
		//������ �ڷ� ��ư
		
		
		
		
	}

}
