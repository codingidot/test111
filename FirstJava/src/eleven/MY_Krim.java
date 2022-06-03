package eleven;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

                                                  //swing���� ���
public class MY_Krim extends JFrame implements
                                        MouseListener, MouseMotionListener{//(1)interface
        // <MouseListener
        // mouseClicked()..Entered()..Exited()
        //                                        Pressed()..Released()
        
        // <MouseMotionListener>
        //mouseDragged(), mouseMoved()
        
        private JPanel contentPane;

        /**
         * Launch the application.
         */
        
        
        /**
         * Create the frame.
         */
        private int witchX=0, witchY=0;
        
        public MY_Krim()//������
        {
                addMouseListener(this); //(2)���콺 �̺�Ʈ ���
                addMouseMotionListener(this);//���콺 �̺�Ʈ ���
        }//������-end

        
        public void mouseDragged(MouseEvent e) {
                
                Graphics g = getGraphics();
                g.setColor(Color.red);
                //stroke:���� �ܰ���
                  // ����� �빮�ڰ� ��Ģ���̹Ƿ� RED �빮�ڰ�
                //���߿� ����������� RED�� red�� ����
                
                // ----- public final static Color red
                //                                        = new Color(255, 0, 0);
                  // R G B
                // ----- public final static Color RED = red;
                
                // red, green, blue ==> ���� �����
                // 0-255 0-255 0-255
                // 0-ff  0-ff  0-ff
                // 255 + 255 + 255  ==> white
                // ffffff, flutter���� 0xffFFFFFF,  FF0000(red)
                
                // R + G ==> yellow
                // 0 + 0 + 255 ==> blue
                // 100 + 0 + 0 ==> ���� ����
                
                
                //2D
                Graphics2D g2d = (Graphics2D)g;
                g2d.setStroke(new BasicStroke(5));
                
                
                int badaX=e.getX();
                int badaY=e.getY();
                
                g.drawLine(witchX,witchY,badaX,badaY);
                witchX = badaX;
                witchY = badaY;
        }

        
        //���콺 ������ �̺�Ʈ //(3)�̺�Ʈ handler 
        public void mousePressed(MouseEvent e) {
                witchX=e.getX();//���� ���� ��ġ ����� ����
                witchY=e.getY();
        }
        
        //��� �� ������ ����ϴ� �Լ�
        //-----------Mouse-----------------------------
        public void mouseClicked(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        //-----------MouseMotion------------------------
        public void mouseMoved(MouseEvent e) {} 
        
        
        public static void main(String[] args) { //MyKrim.java
                
                MY_Krim kr1 = new MY_Krim();
                kr1.setSize(700,700);
                kr1.setTitle("�׷�����");
                kr1.setVisible(true);
                
                
        }
        
}

