package pack6;

public class NewFile4 {

	public static void main(String[] args) {
		
	//	System.out.println(30+80);
	//	Scanner 2개 숫자를 받아서 하고싶다
	//	But Scanner 없이 해야함
		
	//	ddan.exe (재료의 강도)
		
	//	ddan.exe 20 80
	//	ddan.exe 30 70
	//			  ㄴ명령형 인자(commandline argument)
				  
	//	  args
	//	  +-------------------------------+
	//	  |     "20"       |  "80"        |  
	//    +-------------------------------+
	//	     args[0]          args[1]
	      
	
		
	//Q) hap.exe를 수행하는데 뒤에 30 80을 넣어서 답이 110이 나와야 한다	
	//리눅스 bc (basic calculator)
		//30+80
		//110
		
	// args[0]  + args[1]  "30" "80"
	if(args.length!=2) 
		System.out.println("정신똑바로");
		System.out.println("사용법은 명령어 숫자 숫자");
     System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	   return ;
     	// c: exit(1);
     	// java: System.exit(1);
     	// c# : Enviroment.Exit(1);
     
	//run -run as x
	//run- run ...configuration
	}

}
