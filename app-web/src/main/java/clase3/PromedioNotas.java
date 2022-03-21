package clase3;

import java.util.Scanner;

public class PromedioNotas {
	public static void main(String[] args) {
		/**
		 * Calcular el promedio de notas de un alumno se debe ingresar las tres notas
		 * del año si el promedio supera 7 entonces esta aprobado si el promedio es
		 * menor a 7 debemos informar que debemos recuperar
		 */

		float primerNota;
		float segundaNota;
		float tercerNota;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese primer nota");
		primerNota = scanner.nextFloat();
		
		System.out.println("Ingrese segunda nota");
		segundaNota = scanner.nextFloat();
		
		System.out.println("Ingrese tercera nota");
		tercerNota = scanner.nextFloat();
		
		float promedio = (primerNota + segundaNota + tercerNota) / 3;
		
		if (promedio >= 7) {
			System.out.println("Ud está aprobado " + promedio);
		} else {
			System.out.println("Ud no está aprobado " + promedio);
		}
		
		scanner.close();
	}

}
