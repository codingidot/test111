package twelve;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class FileGUI2 extends Frame implements ActionListener{//Third
	private Button b2=new Button("����read");
	private Button b3=new Button("����save");
	private TextArea ta1=new TextArea(); 
	
	public FileGUI2(){ //������ 
        this.setLayout(null);///////////////////
        
    b2.setSize(100,70);//��ư ũ��
    b2.setForeground(new Color(255,255,255));
    b2.setBackground(new Color(0,0,255));
    b2.setFont(new Font("����",Font.BOLD,20));
    b2.setLocation(350,200); //��ư ������ġ 
        this.add(b2);//��ư �߰� 
    b2.addActionListener(this); ////////////////// 

    b3.setSize(100,70);//��ư ũ��
    b3.setForeground(new Color(255,255,255));
    b3.setBackground(new Color(0,0,255));
    b3.setFont(new Font("����",Font.BOLD,20));
    b3.setLocation(350,300); //��ư ������ġ 
        this.add(b3);//��ư �߰� 
    b3.addActionListener(this); ////////////////// 
    
    ta1.setSize(300,340);// ũ��
    ta1.setForeground(new Color(0,0,255));
    ta1.setBackground(new Color(255,255,0));
    ta1.setFont(new Font("����",Font.BOLD,20));
    ta1.setLocation(20,40); // ������ġ 
        this.add(ta1);// �߰� 
    
        this.setBackground(new Color(0,200,0)); 
        this.setTitle("���� ���ִ� �޸���~~~~~~~ !!!!!!");
        this.setSize(460, 400); //������ ũ�� 
        this.setVisible(true);
        addWindowListener(new WindowAdapter(){ //////////////////
                 public void windowClosing(WindowEvent e1){
                         dispose();
                         System.exit(0);
                 }
        });
}//������ -end
	
	@Override
	public void actionPerformed(ActionEvent e1) {

		if(e1.getSource()==b2) {
			String fileData="";
			FileDialog fd1= new FileDialog(this, "����read", FileDialog.LOAD); //awt 
			fd1.setVisible(true);
			
			String dirfile1=fd1.getDirectory()+fd1.getFile();
			
			try {
				FileReader fr;
				fr=new FileReader(dirfile1);
				BufferedReader br=new BufferedReader(fr);
				String s;
				while((s=br.readLine())!=null) {
					fileData+=s+"\n";
					
				}
				ta1.setText(fileData);
				br.close(); fr.close();
			}catch(Exception e) {
				System.out.println("error");
			}
		} else if(e1.getSource()==b3) {
			FileDialog fd2= new FileDialog(this, "����save",FileDialog.SAVE);
			fd2.setVisible(true);
			String dirfile2=fd2.getDirectory()+fd2.getFile();
			
			String fileData2=ta1.getText().replace("\n", "\r\n");
			//ä�� ������ c -> ������ c ^M ������ (����: \r�� ǥ���Ȱ�)
			// s������� change ���־�� �� (subtitute)
			//������ c ->������ c �� �ٹٲ� �ȵ�
			
			//������ \r\n�� ���� (���־� ������: chr(10)+chr(13))
			//Ÿ�ڱ⿡�� ����(carriage return+lineskip)
			//������ \n���� ����
			
			try {
				FileWriter fw=new FileWriter(dirfile2);
				PrintWriter pw=new PrintWriter(fw);
				pw.println(fileData2);
				pw.close(); fw.close();
			} catch(Exception e) {
				System.out.println("error");
			}
			
		}
	}
	
	
}
public class FileGUI {// Third

	public static void main(String[] args) {

		new FileGUI2();
	}

}
