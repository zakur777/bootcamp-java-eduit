package clase10;

import clase7.Articulo;

public class Musica extends Articulo {
	
	private String []listaTemas;	
	
	public Musica(Long id, String nombre, String autor, Double precio, String urlImagen, String[] temas) {
		super(id, nombre, autor, precio, urlImagen);
		// TODO Auto-generated constructor stub
		this.listaTemas = temas;
	}

	
	public String[] getListaTemas() {
		return this.listaTemas != null ? this.listaTemas : new String[0];
	}



	public void setListaTemas(String[] listaTemas) {
		this.listaTemas = listaTemas;
	}



	public void agregarTema(String tema) {
		
	}
	/*
	@Override
	public void detalle() {
		super.detalle();
		System.out.println("Temas:");
		for (String tema : this.getListaTemas()) {
			System.out.println(tema);
		}
	}
	*/


	@Override
	public void detalleHijo() {
		System.out.println("Temas:");
		for (String tema : this.getListaTemas()) {
			System.out.println(tema);
		}
		
	}
  
}
