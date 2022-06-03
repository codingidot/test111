package six;

public class Question {

	public static void main(String[] args) {
		// "µà¿§±×·ì, duetMiso, ¾ó±¼Ãµ»ç" ¸¦ ¹®ÀÚ¿­ º¯¼ö¿¡ ³Ö°í 
		//Ãâ·Â½Ã ÇÑ´Ü¾î¸¦ ÇÑÁÙ¾¿ Ãâ·ÂÇÏ½Ã¿À
		
		String s1="µà¿§±×·ì, duetMiso, ¾ó±¼Ãµ»ç";
		
		String[] bae=s1.split(",");
		//µà¿§±×·ì --> bae[0]
		//duetMiso [1]
		//¾ó±¼Ãµ»ç [2]
		for (int i = 0; i < bae.length; i++) {
			System.out.println(bae[i]);
		}
		
		//===============================================
		
	}

}
