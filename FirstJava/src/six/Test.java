package six;
	class Animal{
		public void move() {
			System.out.println("������~");
		}
	}
	class Fish extends Animal{
		
		public void swim() {
			System.out.println("����~");
		}
	}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1= new Animal();
		a1.move();
		
		Fish f1= new Fish();
		f1.move();
		f1.swim();
		
	}

}
