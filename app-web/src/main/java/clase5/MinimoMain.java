package clase5;

public class MinimoMain {

	public static void main(String[] args) {
		
		/*
		 * Buscar el minimo dentro del array
		 * y el maximo
		 */
		
		int[] edades = {36, 31, 38, 34, 29, 35, 17};
		
		/*
		 * if
		 * variable
		 * for
		 */
		
		if (edades.length > 0) {
			
			int minimo = edades[0];
			int posMinimo = 0;
			int cantidadMinimos = 0;
			
			
			int maximo = edades[0];
			int posMaximo = 0;
			int cantidadMaximos = 0;
			
			for (int i = 1; i < edades.length; i++) {
			
				if (edades[i] < minimo) {
					minimo = edades[i];
					posMinimo = i;
					cantidadMinimos++;
				}
				
				if (edades[i] > maximo) {
					maximo = edades[i];
					posMaximo = i;
					cantidadMaximos++;
				}
			}
			
			System.out.println("El minimo es: " + minimo + " y esta en " + posMinimo + " y hay " + cantidadMinimos);
			System.out.println("El maximo es: " + maximo + " y esta en " + posMaximo + " y hay " + cantidadMaximos);
			
		} else {
			System.out.println("No hay a quien preguntar la edad");
		}
		
		//QUEDA de ejercicio para que lo modifiquen

	}

}
