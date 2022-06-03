package pack6;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPMainClass {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress 클래스는 자바클래스로 IP주소표현을 위해 사용
		InetAddress inet1=InetAddress.getLocalHost();
							//클래스명.static메소드()
		//==>자신이 사용중인 localhost의 InetAddress 객체리턴
	 

		//ip주소
		System.out.println(inet1.getHostAddress());//String
		//즉, getHostAddress는 IP주소를 문자열로 return
		//dotted decimal address  예)192.168.192.1
		//Window + R 키를 눌러서 cmd 누르고 ipconfig눌러서 확인
		
		System.out.println(inet1.getHostName());
						//호스트이름을 문자열로 return
		InetAddress inet2=InetAddress.getByName("www.naver.com");
		
		System.out.println(inet2);//www.naver.com/223.130.195.95
		//223.130.195.95를 입력하면 네이버로 간다
		
		
		InetAddress[] inet3=InetAddress.getAllByName("www.naver.com");
		
		for(int i=0; i<inet3.length; i++) {
			System.out.println(inet3[i]);
		}
		
		
		//IP Address(getAddress) to byte배열, byte배열 새 십진주소
		//getAddress(): byte[] 배열로 return
		//IP address를 바이트배열로 변환해줌
		//즉, 1110011011000101100
		byte[] byte4=inet1.getAddress();
		
		for(int i=0;i<byte4.length;i++) {
			System.out.print((int)byte4[i]+""+"\t");
		}
		System.out.println();
		// byte는 -128~ 127까지 범위
		//127을 넘는순간 마이너스가 된다.
		//192.168.192.1 가  -64	-88	-64	1로 나옴
		//-64+256 =192
		//-88+256=168
		
		
		//======음수를 스무스하게 해결하자는==============
		//음수로 나오는 것만 256에서 -처리
		//-64+256 =192
		//-88+256=168
		
		System.out.println("(음수 주소 해결하기)");
		String change1=""; //빈문자열
		for(int i=0; i<byte4.length;i++) {
			if(byte4[i]<0)
				change1=change1+(""+(byte4[i]+256));
			else
				change1=change1+(""+byte4[i]);
			if(i!=3)// 주소 맨뒤에 점이 출력되지 않도록
				change1=change1+".";
		}
		System.out.println(change1);
	
	}
	}
	
	



