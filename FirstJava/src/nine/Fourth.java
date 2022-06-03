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

		// 키보드 입력 ===> 파일에 넣는
		// 키보드에 입력한걸 메모리로 갔다가 파일에 넣는것
		//file을 처리하는 로직 (text writer 의 경우)
		//open -노트에 적기위해
		//(키보드 입력)
		//write -- 노트에 수록
		// close
		
		//Scanner, 파일, gui로 입력하는 세가지 방법이 있다.
		//----------키보드 입력을 위해 Scanner 대신 file 형식 사용해보자----------
		
		
		//키보드 입력을 위해, 이건 Scanner와 같은것
		//InputStreamReader isl= new InputStreamReader(System.in); //문자 스트림
		//BufferedReader br =new BufferedReader(isl);
		
		//==>이것을 출여 쓰면
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//파일 수록을 위해
		//PrintWriter pw=new PrintWriter //줄바꿈이 잘되게 함
		//			(new BufferedWriter(new FileWriter("d:plus.txt", false)));
																	//true일 때는 append- 기존에 있는 내용 뒤에 넣는것
																		
		/*바이트 단위: readInt() writeInt() */
		
		//String s=null;
		//while((s=br.readLine())!=null) { //키보드 한줄을 읽어서
		//	pw.println(s); //파일에 출력
		//}
		//실행 한후 글자를 입력하고 엔터 .. 또 반복
		//br.close(); pw.close();
		
		//Q) aa.txt파일을 복사하여 ff.txt파일을 생성하는 자바 프로그램을 작성하시오
		
		//open        //copy는 메모장 복사 ~~~그림복사는 안됨
		BufferedReader br1= new BufferedReader(new FileReader("d:/aa.txt"));
		
		
		//open
	    PrintWriter pw1=new PrintWriter(new BufferedWriter(new FileWriter("d:/bb.txt", false)));
		
		
		String s1=null;
		while((s1=br1.readLine())!=null) {
		System.out.println("나 복사중~~");
		pw1.println(s1.substring(0,3));
		}
		br1.close(); pw1.close();
		
						
		
		}	
	}

