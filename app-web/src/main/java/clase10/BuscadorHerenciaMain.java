package clase10;

import clase7.Articulo;
import clase7.Buscador;

public class BuscadorHerenciaMain {

	public static void main(String[] args) {
		
		Buscador miBuscador = new Buscador("ironman");

		miBuscador.buscar();// F3

		miBuscador.mostrarCantidadResultados();


		Articulo[] resultadosArticulos = miBuscador.getResultados();
		
		for (Articulo aux : resultadosArticulos) {
			aux.detalle();
			if(aux instanceof Libro) {
				Libro l = (Libro)aux;
				l.getIsbn();
			}else if (aux instanceof Musica) {
				Musica m = (Musica)aux;
				m.getListaTemas();
			} else {
				Pasatiempo p = (Pasatiempo)aux;
				p.getMarca();
			}
		}

	}

}
