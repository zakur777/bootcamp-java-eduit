package clase2;

public class LoBasico3 {

	public static void main(String[] args) {
		
		//mas tipos de datos
		
		//true o false --> boolean
		
		boolean isFriday = true;
		boolean yourBodyKnow = false;
		
		//operadsores logicos
		//and --> &&
		//or --> ||
		//nor --> ! --> si es true lo pone false y si es false lo pone true
		//xor
		
		boolean after = isFriday && yourBodyKnow;
		//boolean after = isFriday || yourBodyKnow;
		System.out.println("Sale after: " + after);

	}
	
	

}
