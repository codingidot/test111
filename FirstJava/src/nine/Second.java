package nine;

import java.util.Stack;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> st1=new Stack<String>();
		
		st1.push("Ä«·¹");
		st1.push("ººÀ½¹ä");
		st1.push("¶ÒºÒ°í±â");
		System.out.println(st1.size());
		
		System.out.println(st1);
		
		System.out.println("===============popÀ¸·Î Ãâ·Â");
		while(!st1.isEmpty())
				System.out.println(st1.pop());
		
		System.out.println(st1);
		
		
	}

}
