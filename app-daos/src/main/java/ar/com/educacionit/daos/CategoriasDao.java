package ar.com.educacionit.daos;

import java.util.List;

import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.domain.Categorias;

public interface CategoriasDao extends GenericDao<Categorias> {
	//definir los metodos CRUD
	/*
		public List<Categorias> findAll() throws GenericException;
		public void save(Categorias orden) throws GenericException, DuplicatedException;
		public Categorias getByPK(Long pk) throws GenericException;
		public void update(Categorias ordenToUpdate) throws GenericException;
		public void delete(Long pk) throws GenericException;
		*/
		//no forma parte del crud
		//public Categorias getByCode(String codigo) throws GenericException;
	
	//si necesito mas metodos los agrego
}
