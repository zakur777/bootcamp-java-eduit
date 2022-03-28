package clase10;

import clase7.Articulo;

public class Pelicula extends Articulo {
	
	private String productora;

	public Pelicula(Long id, String nombre, String autor, Double precio, String urlImagen) {
		super(id, nombre, autor, precio, urlImagen);
		// TODO Auto-generated constructor stub
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	@Override
	public void detalleHijo() {
		// TODO Auto-generated method stub
		System.out.println("Productora: " + this.productora);
	}
	
	

}
