package nine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Third {

	public static void main(String[] args) throws IOException {

		//�غ� (�ؽ�Ʈ���-viewer) -���� �Է� x

		//Database: oracle, mssql, mysql, mariadb, .....
		//file�� ��Ʈ��
		//(file==>�޸�, �޸�==> ����) �̷��� ���°� ��Ʈ���̶�� �Ѵ�.
					//�׸����Ϻ���, ����
					//01110110000111    �̷����·� �̵� byte stream    
					//babo  �� �ٴ�  �̷����´� ����stream
		//stream: byte stream(input/output) 1����Ʈ�� ���� �����̳� ���������� �����·� ������/     ���� stream(reader, writer) 2����Ʈ ������ ����
			
		//���� �ۼ����- �ؽ�Ʈ���
		
		// open
		// read ==> �޸� ==> ���
		// close
		// ������� �޸��� ������ ������ �ų��� �޸𸮿� ���´ٰ� ���
		
		//-----------------------------------
		//���� �׹ڶ��� ctrl+shift+o
		//������ ���� ������ �ű⸶�콺 �뺸�ڴ�~~~
		//try-catch ===>throws
		//------------------------------------
		
		
		//open
		//FileReader fr=new FileReader("d:/aa.txt"); //�̰� ��ü���� ��θ� �����Ѱ�
		FileReader fr=new FileReader("aa.txt"); //aa.txt������ ������Ʈ �ٷ� �ٷξƷ��� �����ϸ� ��� ����
		// ���������� input, output, stream�� ���̸� ����Ʈ stream
		//reader, writer �� ���̸� ���� stream
		
		BufferedReader br=new BufferedReader(fr); //open�� ����
		//�ӽù濡 ���۸� ���� ����ó�� �غ��ڴ�~~~~~
		
		//read�� ���Ͽ��� �о to ���â��(����)
		// write�� Ű��������� �Է��Ͽ� to ���Ͽ�
		String s=null;
		//file read- ȭ�� ���(write) // byte ���� readInd...
		//fr�� �ٷ� ���ÿ��� .read ������� �ѱ��ھ� ó��
		while((s=br.readLine()) != null) { //������ ���� null
			//�ѱ��ھ��� �� : eof(end of file), -1
			System.out.println(s); //ȭ�����
		}
		
		br.close();
		fr.close();
		//�������� ���� ������ �������� �ݾ��ش�. 
		
		
		//stand alone ȥ�� ���
		//multi user system �ڷ� �ϳ������� ȸ�翡�� �������� ���
		//open�� �������� ���� �Ѹ��� ���� ������ ������ ������� ���� ���Ѵ�.
	}

}
