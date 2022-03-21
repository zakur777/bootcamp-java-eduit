package clase4;


public class Repaso {
	
	public static void main(String[] args) {
		
	}
	
	static float funcionXMas2(float x) {
		float y = x + 2;
		return y;
	}
	
	static float dividir(float a, float b) {
		float res;
		if(b != 0) {
			res = a / b;
		} else {
			System.out.println("No se puede dividir por cero");
			res = -1;
		}
		return res;
	}
	
	static void mostrarParidad(float numero) {
		boolean esPar = (numero % 2 == 0) ? true : false;
		System.out.println(esPar ? "es par" : "impar");
	}

}
