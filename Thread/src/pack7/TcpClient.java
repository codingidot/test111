package pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {

		Socket s1=new Socket(args[0],Integer.parseInt(args[1]));
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(s1.getInputStream()));
		
		
		System.out.println(br1.readLine()+"��� �ߴ°�~~���� ~~�� ������~~~");
	
	
		br1.close();
		s1.close();
		System.out.println("��ȭ������");
		
	}

}
