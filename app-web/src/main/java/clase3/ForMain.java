package clase3;

import java.util.Scanner;

public class ForMain {
	public static void main(String[] args) {
		/**
		 * Ingresar 4 valores numericos
		 * sumar los pares
		 * restar los impares
		 */
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		int cantidadDeLecturas = 4;
		
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < cantidadDeLecturas; i++) {
			System.out.println("Ingrese valor");
			numero = scanner.nextInt();
			
			if (numero % 2 == 0) { //alt+shift+i   (antes debes seleccionar la expresion)
				sumaPares += numero;
			} else {
				sumaImpares += numero;
			}
			
		}
		
		
		
		scanner.close();
		System.out.println("Suma Pares= " + sumaPares);
		System.out.println("Suma Impares= " + sumaImpares);
	}

}
