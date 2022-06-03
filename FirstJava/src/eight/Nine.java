package eight;

import java.util.LinkedList;
import java.util.Queue;

public class Nine {

	public static void main(String[] args) {
		//Queue(fifo: first in first out)
		//lilo: last in last out
	//collection 인터페이스
		//--> Queue(큐) 인터페이스--> 상속받아만든 LinkedList 클래스
		//LinkedList<String> q2=new LinkedList<String>; //(o)
		
		Queue <String> q1=new LinkedList<String>();//(o)
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		
		System.out.println(q1.size());
		
		System.out.println(q1);
	}

}
