package eight;

import java.util.LinkedList;
import java.util.Queue;

public class Nine {

	public static void main(String[] args) {
		//Queue(fifo: first in first out)
		//lilo: last in last out
	//collection �������̽�
		//--> Queue(ť) �������̽�--> ��ӹ޾Ƹ��� LinkedList Ŭ����
		//LinkedList<String> q2=new LinkedList<String>; //(o)
		
		Queue <String> q1=new LinkedList<String>();//(o)
		q1.offer("�ٺ�");
		q1.offer("�´�");
		q1.offer("�򰭰���");
		
		System.out.println(q1.size());
		
		System.out.println(q1);
	}

}
