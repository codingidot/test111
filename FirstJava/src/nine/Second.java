package nine;

import java.util.Stack;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> st1=new Stack<String>();
		
		st1.push("ī��");
		st1.push("������");
		st1.push("�ҺҰ��");
		System.out.println(st1.size());
		
		System.out.println(st1);
		
		System.out.println("===============pop���� ���");
		while(!st1.isEmpty())
				System.out.println(st1.pop());
		
		System.out.println(st1);
		
		
	}

}
