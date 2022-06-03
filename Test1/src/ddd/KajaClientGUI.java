package ddd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KajaClientGUI extends JFrame implements Runnable, ActionListener {
    
    DataOutputStream outputStream;
    DataInputStream inputStream;
    String nickname;
    
    JLabel jlabel1 = new JLabel("우리반 채팅~~~");
    JTextArea jtarea1 = new JTextArea();
    JTextField jtfield1 = new JTextField();
    JScrollPane jScrollPane = new JScrollPane(jtarea1);





public KajaClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
    
    this.outputStream = outputStream;
    this.inputStream = inputStream;
    this.nickname = nickname;
    setLayout(new BorderLayout());
    
    jlabel1.setFont(new Font("굴림", Font.BOLD, 22));
    add("North", jlabel1);
    
    jtarea1.setBackground(Color.yellow);
    jtarea1.setForeground(Color.blue);
    jtarea1.setFont(new Font("굴림", Font.BOLD, 22));
    
    jtarea1.setEditable(false);
    add("Center",jScrollPane);
    
    
    jtfield1.setBackground(Color.white);
    jtfield1.setForeground(Color.BLACK);
    jtfield1.setFont(new Font("굴림", Font.BOLD, 25));
    add("South", jtfield1);
    jtfield1.addActionListener(this);

    setSize(800, 800);
    setVisible(true);
    
    addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    dispose();
                    System.exit(0);
                    
                    setVisible(false);
            }
    });
    
    Thread th1 = new Thread(this);
    th1.start();
} // 생성자-end



@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == jtfield1) {
            try {
                    outputStream.writeUTF(nickname+" --> " + jtfield1.getText());
                    
            } catch (IOException ee) {
                    // TODO Auto-generated catch block
                    
            }
            jtfield1.setText(""); // 서버로 보내고 해당 칸을 빈문자열로 클리어
    }
} // actionPerformed-end



    Toolkit tk1 = Toolkit.getDefaultToolkit();
    
@Override
public void run() {
    // TODO Auto-generated method stub
try {
    while (true) {
            String strServer1 = inputStream.readUTF();
            if (strServer1 == null) {
                    jtarea1.append("\n" + "종료");
                    return;
            }
    jtarea1.append("\n" + strServer1); // 서버에서 온것 textarea에 추가
    
            int kkeut = jtarea1.getText().length();
            jtarea1.setCaretPosition(kkeut); // 커서를 맨 뒤로
            
            tk1.beep();  // chat일 울릴때 마다 beep음 (띠링~)
    }
} catch (Exception eee) {
            jtarea1.append("\n" + eee);                }
} // run-end
    
} // class-end



/*
 * ######실습 문제 ######## 
 * <선택하여 작성 하시오> 
 * -.클라이언트 ip, port 입력란을 UI로 구성하시오 
 * -.귓속말을
 * 작성하시오 <hint> 
 * if(msg.startWith("/"){ 
 * if(msg.charAt(1)=='w') 
 * split 작업 
 * w1[0]  w1[1] w1[2]- 컬렉션에서 w1[1]을 찾아 해당 사람에게만 전송
 * 
 * -.그림파일도 전송하시오 
 * -. DB에 접속한 사람을 저장하시오(일별로 저장)
 */






