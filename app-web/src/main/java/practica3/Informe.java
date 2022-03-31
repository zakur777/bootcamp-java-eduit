package practica3;

public class Informe {

	static void mostrarDatos(Alumno[] alumnos) {
		System.out.println("---------Alumnos con sus examenes y promedio----------");
		System.out.println("");
		for (Alumno alumno : alumnos) {
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellido: " + alumno.getApellido());
			System.out.println("----------Examenes:----------");
			for (int i = 0; i < alumno.getExamen().length; i++) {
				System.out.println("Numero de examen: " + alumno.getExamen()[i].getNumeroExamen());
				System.out.println("Nota: " + alumno.getExamen()[i].getNota());
			}
			System.out.println("-----------------------------");
			System.out.println("Promedio: " + alumno.getPromedio());
		}
		System.out.println("-----------------------------------------------------");
		System.out.println();
	}

	static void calcularPromedio(Alumno alumno) {
		Double promedio = 0.0;
		for (int i = 0; i < alumno.getExamen().length; i++) {
			promedio = promedio + alumno.getExamen()[i].getNota();	
		}
		promedio = promedio / alumno.getExamen().length;
		alumno.setPromedio(promedio);
	}

	static void calificacionMasAltaOmasBaja(Alumno[] alumnos, int cantidadPromediosMinimos, Double promedioMaximo, String palabra) {
		Alumno[] auxAlumnos = new Alumno[cantidadPromediosMinimos];
		int j = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getPromedio().equals(promedioMaximo)) {
				auxAlumnos[j] = alumnos[i];
				j++;
			}
		}
		
		System.out.println("---Alumno/s con calificacion mas " + palabra + "---");
		System.out.println("");
		for (Alumno alumno : auxAlumnos) {
			System.out.println("El Alumno : " + alumno.getNombre() + " " + alumno.getApellido() + " Con un promedio = " + alumno.getPromedio());
		}
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println();
	}

	static void promocionar(Alumno[] alumnos) {
		double promedio = 0.0;
		
		System.out.println("---Los alumnos que promocionan son:---");
		for (int i = 0; i < alumnos.length; i++) {
			promedio = alumnos[i].getPromedio();
			if (promedio >= 7.0) {
				System.out.println("El Alumno : " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " Con un promedio = " + alumnos[i].getPromedio());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println();
		
	}

	static void recursar(Alumno[] alumnos) {
		double promedio = 0.0;
		
		System.out.println("---Los alumnos que recursan son:---");
		for (int i = 0; i < alumnos.length; i++) {
			promedio = alumnos[i].getPromedio();
			if (promedio < 7.0) {
				System.out.println("El Alumno : " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() + " Con un promedio = " + alumnos[i].getPromedio());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println();
		
	}

	static Double calcularPromedioMinimo(Alumno[] alumnos) {
		Double minimo = alumnos[0].getPromedio();
		for (int i = 1; i < alumnos.length; i++) {
			if (alumnos[i].getPromedio() < minimo) {
				minimo = alumnos[i].getPromedio();
			}			
		}
		return minimo;
	}

	static Double calcularPromedioMaximo(Alumno[] alumnos) {
		Double maximo = alumnos[0].getPromedio();
		for (int i = 1; i < alumnos.length; i++) {
			if (alumnos[i].getPromedio() > maximo) {
				maximo = alumnos[i].getPromedio();
			}			
		}
		return maximo;
	}

	static int contarPromedios(Double promedio, Alumno[] alumnos) {
		int cantidad = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getPromedio().equals(promedio)) {
				 cantidad++;
			}	
		}
		return cantidad;
	}

}
