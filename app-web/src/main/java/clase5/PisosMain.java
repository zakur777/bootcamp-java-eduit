package clase5;

import java.util.Scanner;

public class PisosMain {

	public static void main(String[] args) {
		/*
		 * Construir un edificio del tamaño que indique el usuario
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el tamaño");
		int tamanio = scanner.nextInt();
		
		//Construyo el edificio
		String[] edificio = new String[tamanio];
		
		/*
		 * Mostrar el tamaño del edificio
		 */
		
		/*
		 * Cargamos las personas
		 */
		
		for (int i = 0; i < edificio.length; i++) {
			edificio[i] = "persona-" + i; 
		}
		
		
		System.out.println("Tamaño del edificio " + edificio.length);
		
		/*
		 * Como recorrer un array
		 */
		
		for (int i = 0; i < edificio.length; i++) {
			String fulano = edificio[i];
			
			System.out.println(fulano + " vive en el piso " + i);
		}
		
		

	}

}
