package nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Fourth {

	public static void main(String[] args) throws IOException {

		// Ű���� �Է� ===> ���Ͽ� �ִ�
		// Ű���忡 �Է��Ѱ� �޸𸮷� ���ٰ� ���Ͽ� �ִ°�
		//file�� ó���ϴ� ���� (text writer �� ���)
		//open -��Ʈ�� ��������
		//(Ű���� �Է�)
		//write -- ��Ʈ�� ����
		// close
		
		//Scanner, ����, gui�� �Է��ϴ� ������ ����� �ִ�.
		//----------Ű���� �Է��� ���� Scanner ��� file ���� ����غ���----------
		
		
		//Ű���� �Է��� ����, �̰� Scanner�� ������
		//InputStreamReader isl= new InputStreamReader(System.in); //���� ��Ʈ��
		//BufferedReader br =new BufferedReader(isl);
		
		//==>�̰��� �⿩ ����
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//���� ������ ����
		//PrintWriter pw=new PrintWriter //�ٹٲ��� �ߵǰ� ��
		//			(new BufferedWriter(new FileWriter("d:plus.txt", false)));
																	//true�� ���� append- ������ �ִ� ���� �ڿ� �ִ°�
																		
		/*����Ʈ ����: readInt() writeInt() */
		
		//String s=null;
		//while((s=br.readLine())!=null) { //Ű���� ������ �о
		//	pw.println(s); //���Ͽ� ���
		//}
		//���� ���� ���ڸ� �Է��ϰ� ���� .. �� �ݺ�
		//br.close(); pw.close();
		
		//Q) aa.txt������ �����Ͽ� ff.txt������ �����ϴ� �ڹ� ���α׷��� �ۼ��Ͻÿ�
		
		//open        //copy�� �޸��� ���� ~~~�׸������ �ȵ�
		BufferedReader br1= new BufferedReader(new FileReader("d:/aa.txt"));
		
		
		//open
	    PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("d:/bb.txt", false)));
		
		
		String s1=null;
		while((s1=br1.readLine())!=null) {
		System.out.println("�� ������~~");
		pw1.println(s1.substring(0,3));
		}
		br1.close(); pw1.close();
		
						
		
		}	
	}

