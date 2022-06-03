package d16webSocket;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


//javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/kaja") // Ŭ���̾�Ʈ�� �� �ּҷ� ������ �����Ѵ�.  // ������ �����ϴ� ��ġ�� /kaja ��� ��. 
public class KajaSocket { // KajaSocket.java 
	// KajaSocket.java �� ������ ó���� �� ����
	
	// MVC ���� �� Controller ������ �ϴ� �Ͱ� ����. 
	// ä���� �޾Ƽ� ��ü���� send �ϴ� ���� �ֿ� �۾�. 
	
	// session :  1 ������ (client)  = 1 session (��ٱ���..)  
	// �� session import��  org.apache... 
	
	// Session interface : ������(client)�� websocket�� ������ �� ���������, �÷������� �����Ѵ�. 
		// ( ��, �ڹ��� socket ����.. ȫ�浿 ����, �̵��� ����...)
		// ���⼭ Sessiont ��  c/s ��(Ŭ���̾�Ʈ-���� ��) chatting �� socket �� ����. 
		// 10���� Ŭ���̾�Ʈ�� �־Ƹ� 10���� ��� session�� ���� ������ ����.
	
	// Session import �Ҷ� org.apache... �� �ƴ϶�  javax.websocket.Session �� 
	

	private static List<Session> listclient  = Collections.synchronizedList(new ArrayList<>());
	
	// ����ȭ ó�� // �ϳ� ó���ϰ� lock, unlock �ݺ� 
	
	// thread-safe �÷���
	// Vector, Hashtable�� synchronized method �� multi-thread ���� ���� ����. 
	// -> ������ ���ٴ� ���� �⺻ ���°� synchronized �� �Ǿ� �ִ� ��. 
	   //  ArrayList, HashMap, HashSet ���� multi-thread ���� not safe
				// -> �̰͵��� synchronized ���°� ������ ���� �ʱ� ������ ��Ƽ �����忡�� ������ �߻��� �� �ִٴ� ��. 
	
	//����) Vector �� ArrayList ���� ���� ���� synchronized ������ �õ��� ����̴�... 
	
	// �׷��Ƿ� Collections.synchronizedList() �� ����Ͽ� safe ��
	// ����� ó���� ��ü lock �� �ɾ��ش�. 
	
	//  ��) hong: �ȳ�
	//		 lee : �氡�氡 
	//	��� ) 	  �ȹ�簡�氡      -> ���ڰ� ���������� ��. �̷��� �Ǹ� �ȵ�. 
	
	//   �ȳ� �ԷµǸ� lock �ϰ� ������, �� ���۵Ǹ� unlock �ؼ� �氡�氡 �ԷµȰ� �����ϰ� lock �ؼ� ���ε��� �������� �Ǵ� ��. 
	// ������ ������ ���ѹ� ���ѹ� �̷��� ����ǰ� �ϴ°�.. �����带 ���� �����弼������ ���� ������ ������ ���� �� ����. 
	
	// �̿� ���� concurrent �� ó���Ǵ� �ش� ��Ҹ� lock �� �Ǵ�. 
	// �׷��Ƿ� SynchronizedMap ���ٴ� ConcurrentHashMap Ŭ���� ���� �ӵ��� ��������� ������.. 
	
	// �÷��ǿ� .synchronizedList() �� �ᵵ ������ ConcurrentHashMap �� �ᵵ �ȴ�.. �̰� ���� ���� �Ұ�. 
	
	// session �� �����̹Ƿ� ��Ƽä���� ���� �� ArrayList�� ����ؼ� threadList �� �����ؼ� ������ ��Ҿ���
	 
	// ���ڰ� ���̴°� ���� ���� collection���ٰ� .synchronizedList() �� �ϸ� �ȴ�~ �� �˰� ������ ��. 
	
	@OnOpen //  client�� �����ϸ�  
	public void onOpen(Session ses1) {
		listclient.add(ses1); //  Ŭ���̾�Ʈ �����ڸ� ���� ����Ʈ�� �߰� 
	} // ȫ�浿 ������ ���Ǹ�Ͽ� �ִ´�. 
	
	// ������̼��� ���� -> �ڵ带 ª�� ���鼭�� ���� �� ������ ��� ������ �����ϰ� �Ѵ�. 
	
	@OnMessage  // client ���� chat �� ���� ���⼭ ó��  -> ä�� ���ο��� chat �� �Ѹ��ڴ� 
	public void onMessage(Session ses1, String chat2) throws IOException {
		
		// ���⼭ ��� ���ǿ��� �޽����� �����Ѵ�. 
		// synchronized : thread-safe �� �������� �ش� thread �� ó���� 
		synchronized (listclient) {  // ��) ���̼� �ȳ� �氡�氡 ä�ý� �ȹ氡��氡  
			for(Session imsi : listclient) {
				
				// �̰� ���� ������ ���� ���� ������ �ι� ��� �ȴ�.  �⺻���� �ؽ��� �ְ�, ��ü �ѷ��ְ� ) 
				if( !imsi.equals(ses1) ) { // ���⼭ chat ���� ����� ���� �������ڴ� ��. 
					imsi.getBasicRemote().sendText(chat2);
					// ó������ ȫ�浿 ���� ������ �ű�ٰ� chat�� send
					// �� �������� �̵��� socket..
					// ä�ù濡 �ִ� ����鿡��  '�氡�氡' �� ���޵Ǵ°�. (������� ����)
				}
			}
		}
	}
	
	@OnError // data ���۽� ���� �߻��ϸ� 
	public void onError(Throwable e1) {
		e1.printStackTrace();
	}
	
	@OnClose  // Ŭ���̾�Ʈ ������ �������� 
	public void onClose(Session ses1) {
		listclient.remove(ses1); // �÷��ǿ��� �ش� Ŭ���̾�Ʈ ����(����) �� ���� 
	}
}
	
