package seven;
abstract class Dohyung{
	public abstract void krim();
}

class WonClass extends Dohyung{

	@Override
	public void krim() {
		System.out.println("���� �߽���ǥ�� �ƹ����� �׸���");
		
	}
	
	
}

class SakakClass extends Dohyung{

	@Override
	public void krim() {
		System.out.println("�簢���� �׳� �簢��������� �׸���");
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
// @override => @�� at sign==>annotation
//web, spring������ ������ ������ �߻�