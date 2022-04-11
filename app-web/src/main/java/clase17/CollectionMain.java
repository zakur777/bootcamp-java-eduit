package clase17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CollectionMain {

	public static void main(String[] args) {
		
		
		//crear una Collection
		Collection<String> nombres = new ArrayList<>();
		
		//agrego elementos
		nombres.add("brenda");
		nombres.add("walter");
		nombres.add("nicolas");
		
		//tamanio
		//int tamanio = nombres.size();
		
		//eliminar todos
		//nombres.clear();
		
		//eliminar de manera segura
		//Nos tenemos que conectar al iterador de la coleccion
		Iterator<String> itNombres = nombres.iterator();
		
		while (itNombres.hasNext()) {
			String nombreActual = itNombres.next();
			System.out.println("Eliminando: " + nombreActual);
			itNombres.remove();
		}
		
		//determina si esta vacia la coleccion
		boolean vacio = nombres.isEmpty();
	}

}
