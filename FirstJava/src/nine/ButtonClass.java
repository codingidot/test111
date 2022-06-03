package nine;


import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ButtonClass2 class을 Frame class을 통해 gui로 변경
class ButtonClass2 extends Frame implements ActionListener {

        private Button b1 = new Button("눌러봐");//속성 //new는 main에서
        private Label la1 = new Label("여기에 나온다");//속성 //글씨 출력 가능, 입력X
        
        public ButtonClass2() {//생성자 (디폴트 생성자)
                
                this.setLayout(null);
                
                b1.setSize(100,70);//버튼 크기 //pixel = picture element
                b1.setLocation(250,250);//버튼 내부위치
                this.add(b1);//버튼 추가
                b1.addActionListener(this);//(2) 이벤트 등록
                   //버튼에 이벤트 발생 시 이벤트 핸들러와 연결시키는 메소드
                
                la1.setSize(100,70);
                la1.setLocation(200,150);//라벨 내부위치
                this.add(la1);//라벨 추가
                
                this.setSize(500, 500);//프레임 크기
                this.setVisible(true);
        }//생성자-end
        //ctrl+shift+esc로 종료
        //이벤트
        @Override
        public void actionPerformed(ActionEvent e) {//(3)이벤트 처리 메소드
                if(e.getSource() == b1) {//버튼이 눌러졌으므로 처리(이벤트 핸들러)
                        la1.setText("안녕 자바");//객체.메소드()
                }
        }
        
}



public class ButtonClass {

        public static void main(String[] args) {

                ButtonClass2 bee1 = new ButtonClass2();
                
                
                
        }
}