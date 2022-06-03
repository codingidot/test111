package seven;
abstract class Dohyung{
	public abstract void krim();
}

class WonClass extends Dohyung{

	@Override
	public void krim() {
		System.out.println("원을 중심좌표를 아무데나 그리자");
		
	}
	
	
}

class SakakClass extends Dohyung{

	@Override
	public void krim() {
		System.out.println("사각형도 그냥 사각형모양으로 그리자");
	}
}

public class Fourth   {
	public static void main(String[] args) {
		Dohyung won=new WonClass();
		won.krim();
		Dohyung sa=new SakakClass();
		sa.krim();
	}
}
// @override => @는 at sign==>annotation
//web, spring에서는 생략시 문제가 발생