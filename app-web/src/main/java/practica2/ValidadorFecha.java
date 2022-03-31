package practica2;

import java.util.Scanner;

public class ValidadorFecha {

	public static void main(String[] args) {
		int dia;
		int mes;
		int anio;
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese un dia entre 1-31");
		dia = scanner.nextInt();
		
		System.out.println("Ingrese un mes entre 1-12");
		mes = scanner.nextInt();
		
		System.out.println("Ingrese un anio entre 1900-2099");
		anio = scanner.nextInt();
		
		if (validarDia(dia) && validarMes(mes) && validarAnio(anio)) {
			
			if ( esBisiesto(anio)) {
				
				if (mes == 2 && dia <= 29) {
					System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta");
					
				}  else {
					System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es incorrecta!!");
				}
			} else {
				System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta");
			}
			
		} else {
			System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es incorrecta!!");
		}
		
		scanner.close();
		

	}
	
	static boolean esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		} else {
			return false;
		}
		
	}
	
	static int calcularFebrero(int mes, int anio) {
		if ( mes == 2 && esBisiesto(anio)) {
			return 29;
		} else {
			return 28;
		}
	}
	
	static boolean validarDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean validarMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean validarAnio(int anio) {
		if (anio >= 1900 && anio <= 2099) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
