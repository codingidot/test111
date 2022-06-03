package six;
class Sangpoom{
	String poomname;
	int soo;
	int dan;
	
	public String getPoomname() {
		return poomname;
	}
	public void setPoomname(String poomname) {
		this.poomname = poomname;
	}
	public int getSoo() {
		return soo;
	}
	public void setSoo(int soo) {
		this.soo = soo;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
}





public class SooDanClass {
	public static void main(String[] args) {
		Sangpoom s1=new Sangpoom();
		s1.setPoomname("¿ìÀ¯");
		s1.setSoo(20);
		s1.setDan(1000);
		System.out.println(s1.getPoomname()+"\t"+s1.getSoo()+"\t"+s1.getDan());
		
		Sangpoom s2=new Sangpoom();
		s2.setPoomname("»§");
		s2.setSoo(100);
		s2.setDan(500);
		System.out.println(s2.getPoomname()+"\t"+s2.getSoo()+"\t"+s2.getDan());
	}
}
