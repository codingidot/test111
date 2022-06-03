package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br1= new BufferedReader(new FileReader("d:/aa.txt"));
	    PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("d:/bb.txt", false)));
		
		
		String s1=null;
		while((s1=br1.readLine())!=null) {
		System.out.println("나 복사중~~");
		pw1.println(s1.substring(0,3));
		}
		br1.close(); pw1.close();
		
	}

}
