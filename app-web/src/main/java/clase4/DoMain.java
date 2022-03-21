package clase4;

import java.util.Scanner;

public class DoMain {

	public static void main(String[] args) {
		int opcion;
		Scanner scanner = new Scanner(System.in);
		do {
			mostrarMenu();
			opcion = scanner.nextInt();
		} while (opcion < 0 || opcion > 4);
		
		scanner.close();
		System.out.println("Fin");

	}

	private static void mostrarMenu() {
		System.out.println("Ingrese dato (0 para salir, 1=suma, 2=restar, 3=multi, 4=div)");
	}

}
