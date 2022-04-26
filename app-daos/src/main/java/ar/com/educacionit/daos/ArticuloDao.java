package ar.com.educacionit.daos;

import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Orden;

public interface ArticuloDao {
	public Articulo create(Articulo orden);
	
	public Articulo read(Long id);
	
	public Articulo update (Articulo ordenToUpdate);
	
	public Articulo delete(Long id);
}
