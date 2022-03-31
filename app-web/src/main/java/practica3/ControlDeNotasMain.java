package practica3;

import java.util.Scanner;

public class ControlDeNotasMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cantidadAlumnos;
		String cantidadExamenes;
		Double promedioMinimo = 0.0;
		Double promedioMaximo = 0.0;
		int cantidadMinimos = 0;
		int cantidadMaximos = 0;
		int aux = 0;
		
		do {
			
			do {
				System.out.println("Ingrese la cantidad de alumnos (entre 1-40, solo numeros!!)");
				cantidadAlumnos = scanner.next();
				if (Validadores.esEntero(cantidadAlumnos)) {
					aux = Integer.parseInt(cantidadAlumnos);
				}
			} while ( !Validadores.esEntero(cantidadAlumnos) );
			
		} while (!(aux >= 1 && aux <= 40  ));

		
		do {
			aux = 0;
			do {
				System.out.println("Ingrese la cantidad de examenes (entre 1-5, solo numeros!!)");
				cantidadExamenes = scanner.next();
				if (Validadores.esEntero(cantidadExamenes)) {
					aux = Integer.parseInt(cantidadExamenes);
				}
			} while (!Validadores.esEntero(cantidadExamenes));
			
		} while (!(aux <= 1 && aux <= 5));


		Alumno[] alumnos = new Alumno[Integer.parseInt(cantidadAlumnos)];
		Examen[] examenes = new Examen[Integer.parseInt(cantidadExamenes)];

		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno(Ingreso.ingresarAlumno(scanner, examenes));
			Ingreso.ingresarExamenes(scanner, alumnos[i]);
			Informe.calcularPromedio(alumnos[i]);

		}

		Informe.mostrarDatos(alumnos);

		promedioMinimo = Informe.calcularPromedioMinimo(alumnos);
		cantidadMinimos = Informe.contarPromedios(promedioMinimo, alumnos);
		Informe.calificacionMasAltaOmasBaja(alumnos, cantidadMinimos, promedioMinimo, "baja");

		promedioMaximo = Informe.calcularPromedioMaximo(alumnos);
		cantidadMaximos = Informe.contarPromedios(promedioMaximo, alumnos);
		Informe.calificacionMasAltaOmasBaja(alumnos, cantidadMaximos, promedioMaximo, "alta");

		Informe.recursar(alumnos);
		Informe.promocionar(alumnos);

		scanner.close();
		System.out.println("");

	}

}
