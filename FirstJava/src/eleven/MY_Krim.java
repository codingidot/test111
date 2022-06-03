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

                                                  //swing에서 상속
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
        
        public MY_Krim()//생성자
        {
                addMouseListener(this); //(2)마우스 이벤트 등록
                addMouseMotionListener(this);//마우스 이벤트 등록
        }//생성자-end

        
        public void mouseDragged(MouseEvent e) {
                
                Graphics g = getGraphics();
                g.setColor(Color.red);
                //stroke:도형 외곽선
                  // 상수는 대문자가 규칙적이므로 RED 대문자가
                //나중에 만들어졌으며 RED와 red는 같다
                
                // ----- public final static Color red
                //                                        = new Color(255, 0, 0);
                  // R G B
                // ----- public final static Color RED = red;
                
                // red, green, blue ==> 빛의 삼원색
                // 0-255 0-255 0-255
                // 0-ff  0-ff  0-ff
                // 255 + 255 + 255  ==> white
                // ffffff, flutter에서 0xffFFFFFF,  FF0000(red)
                
                // R + G ==> yellow
                // 0 + 0 + 255 ==> blue
                // 100 + 0 + 0 ==> 연한 빨강
                
                
                //2D
                Graphics2D g2d = (Graphics2D)g;
                g2d.setStroke(new BasicStroke(5));
                
                
                int badaX=e.getX();
                int badaY=e.getY();
                
                g.drawLine(witchX,witchY,badaX,badaY);
                witchX = badaX;
                witchY = badaY;
        }

        
        //마우스 누르는 이벤트 //(3)이벤트 handler 
        public void mousePressed(MouseEvent e) {
                witchX=e.getX();//현재 누른 위치 기억을 위해
                witchY=e.getY();
        }
        
        //사용 안 되지만 써야하는 함수
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
                kr1.setTitle("그려보자");
                kr1.setVisible(true);
                
                
        }
        
}

