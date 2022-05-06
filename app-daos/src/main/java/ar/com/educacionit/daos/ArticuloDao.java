package ar.com.educacionit.daos;

import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.domain.Orden;

public interface ArticuloDao {
	public Articulo save(Articulo orden);
	
	public Articulo getByPk(Long id) throws GenericException;
	
	public Articulo update (Articulo ordenToUpdate);
	
	public Articulo delete(Long id);
}
