package clase19;

import java.util.Scanner;

import clase10.Libro;
import clase7.Articulo;

public class MainMap {

	public static void main(String[] args) {
		Integer opcion = 1;
		
		IAccion accion = AccionMap.getAccion(opcion);
		
		Articulo articulo = contruirArticulo();
		
		InMemoryDb.listAll();
		
		accion.exec(articulo);
		
		InMemoryDb.listAll();
		
		

	}

	private static Articulo contruirArticulo() {
		Scanner teclado = new Scanner(System.in);
		Articulo articulo = new Libro();
		System.out.println("Ingrese titulo");
		articulo.setAutor(teclado.next());
		System.out.println("Ingrese id");
		articulo.setId(teclado.nextLong());
		//completar los demas datos
		teclado.close();
		return articulo;
		
	}

}
