package com.hello.my;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//spring-Dynamic web 으로 작성
		//스프링 자바니까 Hello.java-마오-ㄱrun application
		
		
		System.out.println("<<<<<<안녕>>>>>>>>>");
		String str1="Hello Spring";
		GenericXmlApplicationContext gxac1=
				new GenericXmlApplicationContext("applicationContext1.xml");
		
		Insa insa1=gxac1.getBean("insaBean",Insa.class);
		System.out.println(insa1.helloName(str1));
	
	}
	

}
