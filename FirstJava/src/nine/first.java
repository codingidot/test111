package nine;

import java.util.LinkedList;
import java.util.Queue;

public class first {

	public static void main(String[] args) {
		
		Queue <String> q1=new LinkedList<String>();//(o)
		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		
		System.out.println(q1.size());
		
		System.out.println(q1);
		
		
		//오버플로우는 원래 있는 것보다 더많이 넣어 넘치는것 언더플러우는 없는데 또 빼내는것
		if(!q1.isEmpty()) //언더플로우를 방지하기 위해 물어본다 
			q1.poll(); //빼는것
		if(!q1.isEmpty())
			q1.poll();
		q1.offer("홍길동");
		
		System.out.println(q1);
		
		//stack
			//lifo filo (push pop)
		//Last in First Out
		//First in Last out
		//브라우저 뒤로 버튼
		
		
		
		
	}

}
