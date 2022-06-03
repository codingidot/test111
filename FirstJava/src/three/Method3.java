package three;

import java.util.Scanner;

public class Method3 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub

        //키, 몸무게는 여기서 입력받고  키, 몸무게값을 메소드정의문으로 보내서
        // bmi 는 메소드정의문에서 출력하고  비만, 저체중 계산도 정의문에서 하고 
        //비만, 저체중 등의  결과처리는 메인으로 리턴하여 출력 할수 있도록 자바 프로그램을 작성하시오(3형식) 
        Scanner sc2=new Scanner(System.in);

      System.out.println("키를 입력하세요");
      int ki=sc2.nextInt(); //178
      
                
      System.out.println("몸무게를 입력하세요");
      int mom=sc2.nextInt();//78
              
     String str1=kajaBMI2(ki,mom); 
      //////메소드호출문 -3형식으로 값을 받아서 "과체중" 같은 결과가 출력되도록  함           
     System.out.println(str1); //////////////

//위 두줄 대신에 한줄로 만든다면 ==========================
    System.out.println(kajaBMI2(ki,mom)); ///////////
    //=============================================
}// main-end 
          //반환형 
private static String kajaBMI2(int ki, int mom) {//메소드정의문-2형식 
          double mKi=ki/100.0;
  double  bmi=mom/ Math.pow(mKi,2);//mKi의 2승 
      System.out.printf("%.2f\n", bmi); //23.6743523 ==> 23.67
      
  String result=null; 
      if(bmi>=30.0)
                 result="비만";
      else if(bmi>=25.0) 
                result="과체중";
      else  if(bmi>=20.0)
                result="보통";
      else 
                 result="저체중";
      return  result; ///////////////////////
        
}//kajaBMI2-end
}//class-end 



