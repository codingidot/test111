package nine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Third {

	public static void main(String[] args) throws IOException {

		//텍뷰 (텍스트뷰어-viewer) -글을 입력 x

		//Database: oracle, mssql, mysql, mariadb, .....
		//file의 스트림
		//(file==>메모리, 메모리==> 파일) 이렇게 가는걸 스트림이라고 한다.
					//그림파일복사, 전송
					//01110110000111    이런형태로 이동 byte stream    
					//babo  강 바다  이런형태는 문자stream
		//stream: byte stream(input/output) 1바이트로 전송 음악이나 영상파일은 이행태로 보낸다/     문자 stream(reader, writer) 2바이트 단위로 전송
			
		//파일 작성방법- 텍스트뷰어
		
		// open
		// read ==> 메모리 ==> 출력
		// close
		// 예를들어 메모장 파일의 내용을 거내서 메모리에 보냈다가 출력
		
		//-----------------------------------
		//현재 액박떠서 ctrl+shift+o
		//아직도 남아 있으면 거기마우스 대보자는~~~
		//try-catch ===>throws
		//------------------------------------
		
		
		//open
		//FileReader fr=new FileReader("d:/aa.txt"); //이건 구체적인 경로를 지정한것
		FileReader fr=new FileReader("aa.txt"); //aa.txt파일을 프로젝트 바로 바로아래에 저장하면 사용 가능
		// 참고적으로 input, output, stream이 보이면 바이트 stream
		//reader, writer 가 보이면 문자 stream
		
		BufferedReader br=new BufferedReader(fr); //open을 도움
		//임시방에 버퍼링 한후 한줄처리 해보자는~~~~~
		
		//read는 파일에서 읽어서 to 기억창고(변수)
		// write는 키보드등으로 입력하여 to 파일에
		String s=null;
		//file read- 화면 출력(write) // byte 경우는 readInd...
		//fr을 바로 사용시에는 .read 사용으로 한글자씩 처리
		while((s=br.readLine()) != null) { //한줄의 끝은 null
			//한글자씩의 끝 : eof(end of file), -1
			System.out.println(s); //화면출력
		}
		
		br.close();
		fr.close();
		//닫을때는 열은 순서의 역순으로 닫아준다. 
		
		
		//stand alone 혼자 사용
		//multi user system 자료 하나가지고 회사에서 여러명이 사용
		//open은 소유권을 말함 한명이 열고 있을때 나머지 사람들은 열지 못한다.
	}

}
