package setter;

public class Setter {

	private Insa insa;
	
	
	public Insa getInsa() {
		return insa
	}
	
	public void setInsa(Insa insa) {
		this.insa=insa;
	}
	
	public String kajaHello(String str1) {
		return insa.helloName(str1);
	}
}
