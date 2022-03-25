package clase10;

import clase7.Articulo;

public class Libro extends Articulo {
	
	//atributos propios
	private String isbn;

	public Libro(Long id, String nombre, String autor, Double precio, String urlImagen, String isbn) {
		super(id, nombre, autor, precio, urlImagen);
		this.isbn = isbn;
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public void detalle() {
		super.detalle();
		System.out.println("ISBN: " + this.getIsbn());
	}

}
