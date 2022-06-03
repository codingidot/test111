package eleven; 
import java.awt.*;
import java.awt.event.*; 

public class KajaCalc extends Frame
                       implements ActionListener
{  
  private final String _PLUS = "+";
  private final String _MIN = "-";
  private final String _MUL = "*";
  private final String _DIV = "/";

  private Panel pan1, pan2;
  
  private Button  b0 = new Button("0");
  private Button b1 = new Button("1");
  private Button  b2 = new Button("2");
  private Button  b3 = new Button("3");
  private Button b4 = new Button("4");
  private Button b5 = new Button("5");
  private Button b6 = new Button("6");
  private Button b7 = new Button("7");
  private Button b8 = new Button("8");
  private Button b9 = new Button("9"); 
  private Button btnPlus = new Button("+");
  private Button btnMin = new Button("-");
  private Button btnMul= new Button("*");
  private Button btnDiv= new Button("/");
  private Button btnEq = new Button("=");
  private Button btnCan = new Button("CE");
  private TextField tf1; 

  private long soo1=0;
  private long soo2=0;
  private String sw="";         

     
  public KajaCalc(){//생성자 
    pan1 = new Panel();
    pan2 = new Panel();
    tf1 = new TextField(20);
          
    pan1.setLayout(new BorderLayout()); //3+5 
    pan1.add(tf1,"Center");                           
   //------------------------------

    pan2.setLayout(new GridLayout(4,4,2,2));//16개 버튼 배치 
    pan2.add(b0);
    pan2.add(b1);
    pan2.add(b2);
    pan2.add(b3);
    pan2.add(b4);
    pan2.add(b5);
    pan2.add(b6);
    pan2.add(b7);
    pan2.add(b8);
    pan2.add(b9);                           

    pan2.add(btnPlus);
    pan2.add(btnMin);
    pan2.add(btnMul);
    pan2.add(btnDiv);
    pan2.add(btnEq);
    pan2.add(btnCan); 
  
    b0.addActionListener(this); 
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);                           
    btnPlus.addActionListener(this);
    btnMin.addActionListener(this);
    btnMul.addActionListener(this);
    btnDiv.addActionListener(this);
    btnEq.addActionListener(this);
    btnCan.addActionListener(this);                           
    this.add(pan1, "North");
    this.add(pan2, "Center");

	this.addWindowListener(new WindowAdapter(){
	  public void windowClosing(WindowEvent we){
		setVisible(false);
		dispose();
	  }	
	});
  }
  
  public void actionPerformed(ActionEvent e){
    
    if(e.getSource()==b0){
		tf1.setText( tf1.getText() + "0");
	}   
    else if(e.getSource()==b1){
		tf1.setText( tf1.getText() + "1");
	}
    else if(e.getSource()==b2){
		tf1.setText( tf1.getText() + "2");
	} 
    else if(e.getSource()==b3){
		tf1.setText( tf1.getText() + "3");
	}                 
    else if(e.getSource()==b4){
		tf1.setText( tf1.getText() + "4");
	}                  
    else if(e.getSource()==b5){
		tf1.setText( tf1.getText() + "5");
	}                  
    else if(e.getSource()==b6){
		tf1.setText( tf1.getText() + "6");
	}                  
    else if(e.getSource()==b7){
		tf1.setText( tf1.getText() + "7");
	}                  
    else if(e.getSource()==b8){
		tf1.setText( tf1.getText() + "8");
	}                  
    else if(e.getSource()==b9)
	  {tf1.setText( tf1.getText() + "9");
	} 
	
	
	else if(e.getSource()==btnPlus){ 
      sw = _PLUS; 
      soo1 = Long.parseLong(tf1.getText());
      tf1.setText("");
    }
	else if(e.getSource()==btnMin){ 
	      sw = _MIN; 
	      soo1 = Long.parseLong(tf1.getText());
	      tf1.setText("");
    }
	else if(e.getSource()==btnMul){ 
	      sw = _MUL; 
	      soo1 = Long.parseLong(tf1.getText());
	      tf1.setText("");
    }
	else if(e.getSource()==btnDiv){ 
	      sw = _DIV; 
	      soo1 = Long.parseLong(tf1.getText());
	      tf1.setText("");
    }
	
	else if(e.getSource()==btnEq){ 
      soo2 = Long.parseLong(tf1.getText());
        if(sw==_PLUS){
          Long soo=new Long(soo1+soo2);	
          tf1.setText(soo.toString());
        }else  if(sw==_MIN){
            Long soo=new Long(soo1-soo2);	
            tf1.setText(soo.toString());
        }else  if(sw==_MUL){
            Long soo=new Long(soo1*soo2);	
            tf1.setText(soo.toString()); 
        }else if(sw==_DIV){
        	if(soo2!=0) {
            Long soo=new Long(soo1/soo2);	
            tf1.setText(soo.toString()); 
        	}
        	else
        		tf1.setText("0으로 나눌수 없습니다");
        }                                 
     }else if(e.getSource()==btnCan){ 
    	soo1=0;
        soo2 =0;
        sw="";
        tf1.setText("");
      }
    }

    public static void main(String [] args){
    	//KajaCalc.java
    	KajaCalc mc1 = new KajaCalc();
      mc1.setSize(300,300);
      mc1.setVisible(true);
    }
}









