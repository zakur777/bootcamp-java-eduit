package clase3;

public class IfMain {

	public static void main(String[] args) {

		boolean esViernes = true;
		int edad = 17;

		if (edad >= 18) {
			if (edad > 20 && edad <= 30) {
				System.out.println("Es mayor y está entre 20 y 30 años");
			} else {
				System.out.println("Es mayor pero no está entre 20 y 30 años");
			}

		} else {
			System.out.println("Es menor de edad");

		}

	}

}
