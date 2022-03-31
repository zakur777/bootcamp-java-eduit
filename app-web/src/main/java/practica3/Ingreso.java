package practica3;

import java.util.Scanner;

public class Ingreso {

	static Alumno ingresarAlumno(Scanner scanner, Examen[] examenes) {
		String nombre;
		String apellido;
		do {
			
			System.out.println("Ingrese el nombre (solo letras)");
			nombre = scanner.next();
		} while (!Validadores.esString(nombre));
		
		do {
			
			System.out.println("Ingrese apellido (solo letras)");
			apellido = scanner.next();
		} while (!Validadores.esString(apellido));
		
		
		return new Alumno(nombre, apellido, examenes, 0.0);
	}

	static void ingresarExamenes(Scanner scanner, Alumno alumno) {
		int numeroExamen;
		String nota;
		Examen[] auxExamenes = new Examen[alumno.getExamen().length];
		int aux = 0;
		
		for (int i = 0; i < alumno.getExamen().length; i++) {
			numeroExamen = i + 1;
			do {
				do {
					System.out.println("Ingrese la nota del examen numero: " + numeroExamen + " (entre 0-10, solo numeros!!)");
					nota = scanner.next();
					if (Validadores.esEntero(nota)) {
						aux = Integer.parseInt(nota);
					}
				} while (!Validadores.esEntero(nota));
				
			} while (!(aux >= 0 && aux <= 10));
			auxExamenes[i] = new Examen(numeroExamen, Integer.parseInt(nota));
		}
		
		alumno.setExamen(auxExamenes);
		
	}

}
