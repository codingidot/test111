package nine;


import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ButtonClass2 class�� Frame class�� ���� gui�� ����
class ButtonClass2 extends Frame implements ActionListener {

        private Button b1 = new Button("������");//�Ӽ� //new�� main����
        private Label la1 = new Label("���⿡ ���´�");//�Ӽ� //�۾� ��� ����, �Է�X
        
        public ButtonClass2() {//������ (����Ʈ ������)
                
                this.setLayout(null);
                
                b1.setSize(100,70);//��ư ũ�� //pixel = picture element
                b1.setLocation(250,250);//��ư ������ġ
                this.add(b1);//��ư �߰�
                b1.addActionListener(this);//(2) �̺�Ʈ ���
                   //��ư�� �̺�Ʈ �߻� �� �̺�Ʈ �ڵ鷯�� �����Ű�� �޼ҵ�
                
                la1.setSize(100,70);
                la1.setLocation(200,150);//�� ������ġ
                this.add(la1);//�� �߰�
                
                this.setSize(500, 500);//������ ũ��
                this.setVisible(true);
        }//������-end
        //ctrl+shift+esc�� ����
        //�̺�Ʈ
        @Override
        public void actionPerformed(ActionEvent e) {//(3)�̺�Ʈ ó�� �޼ҵ�
                if(e.getSource() == b1) {//��ư�� ���������Ƿ� ó��(�̺�Ʈ �ڵ鷯)
                        la1.setText("�ȳ� �ڹ�");//��ü.�޼ҵ�()
                }
        }
        
}



public class ButtonClass {

        public static void main(String[] args) {

                ButtonClass2 bee1 = new ButtonClass2();
                
                
                
        }
}