package pack6;

public class NewFile4 {

	public static void main(String[] args) {
		
	//	System.out.println(30+80);
	//	Scanner 2�� ���ڸ� �޾Ƽ� �ϰ�ʹ�
	//	But Scanner ���� �ؾ���
		
	//	ddan.exe (����� ����)
		
	//	ddan.exe 20 80
	//	ddan.exe 30 70
	//			  ������� ����(commandline argument)
				  
	//	  args
	//	  +-------------------------------+
	//	  |     "20"       |  "80"        |  
	//    +-------------------------------+
	//	     args[0]          args[1]
	      
	
		
	//Q) hap.exe�� �����ϴµ� �ڿ� 30 80�� �־ ���� 110�� ���;� �Ѵ�	
	//������ bc (basic calculator)
		//30+80
		//110
		
	// args[0]  + args[1]  "30" "80"
	if(args.length!=2) 
		System.out.println("���Ŷȹٷ�");
		System.out.println("������ ��ɾ� ���� ����");
     System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	   return ;
     	// c: exit(1);
     	// java: System.exit(1);
     	// c# : Enviroment.Exit(1);
     
	//run -run as x
	//run- run ...configuration
	}

}
