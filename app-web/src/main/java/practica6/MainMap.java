package practica6;

import java.util.Scanner;

import practica6.db.InMemoryDB;
import practica6.exceptions.AccionAltaException;
import practica6.exceptions.GenericException;
import practica6.model.Articulo;
import practica6.model.Libro;

public class MainMap {

	/**
	 * El usuario ingresa una opcion 1- alta 2- baja 3- modificar 4- listar
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Integer opcionIngresadaPorUsuario = 1;

			// Interface i = new ClaseQueImplementaLaInterface();
			IAccion accion = AccionMap.getAccion(opcionIngresadaPorUsuario);// AltaAccion|BajaAccion|AccionDefault

			Articulo articulo = contruirArticulo();

			// ejecuto
			InMemoryDB.listAll();

			accion.exec(articulo);

			InMemoryDB.listAll();

			InMemoryDB.delete(articulo.getId());

			InMemoryDB.listAll();
		} catch (GenericException e) {
			e.getStackTrace();
		}

		
	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo art = new Libro();
		System.out.println("Ingrese titulo ");
		art.setAutor(teclado.next());
		System.out.println("Ingrese id ");
		art.setId(teclado.nextLong());

		// downcating
		System.out.println("Ingrese isbn");
		((Libro) art).setIsbn(teclado.next());
		// completar los demas datos
		teclado.close();
		return art;
	}
}
