package clase3;

import java.util.Scanner;

public class WhileMain {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		
		numero = scanner.nextInt();
		
		while (numero != 0 && contador < 6) {
			contador++;
			System.out.println("Ingrese un numero");
			
			numero = scanner.nextInt();
			
		}
		scanner.close();
		
		System.out.println("fin");
		
	}

}
