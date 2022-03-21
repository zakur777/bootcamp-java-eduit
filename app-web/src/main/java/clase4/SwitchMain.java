package clase4;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		/*
		 * Realizar una mini calculadora operaciones: +, -, /, *
		 * 
		 * El usuario ingresa la operacion
		 */

		int opcion;
		double res;
		double a;
		double b;
		int continuar;

		Scanner teclado = new Scanner(System.in);
		
		do {
			
			do {
				mostrarMenu();
				opcion = teclado.nextInt();
			} while (opcion <0 || opcion > 4);
			
			if (opcion == 0) {
				System.out.println("Saliendo...");
				System.exit(0);
			}
			
			
			a = leerData("Ingrese a", teclado);
			b = leerData("Ingrese b", teclado);
			
			switch (opcion) {
			case 1:
				res = a + b;
				mostrarResultado(res, "+");
				break;
			case 2:
				res = a - b;
				mostrarResultado(res, "-");// f5
				break;
			case 3:
				res = a * b;
				mostrarResultado(res, "*");
				break;
			case 4:
				if (b != 0) {
					res = a / b;
					mostrarResultado(res, "/");
				} else {
					System.out.println("No se puede divir por 0");
				}
				break;
				
			default:
				System.out.println("Opcion invalida");
				break;
			}
			System.out.println("Continuar (1=si, 2=no)");
			continuar = teclado.nextInt();
			
		} while (continuar == 1);
		
		
		
		teclado.close();

		System.out.println("Salida exitos");

	}

	static double leerData(String mensaje, Scanner scanner) {
		System.out.println(mensaje);
		return scanner.nextDouble();
	}

	private static void mostrarMenu() {
		System.out.println("Ingrese operacion: ");
		System.out.println("0=salir, 1=suma, 2=resta; 3=multi, 4=div");
	}

	static void mostrarResultado(double res, String operacion) {
		System.out.println(" La operacion " + operacion + " = " + res);
	}
}
