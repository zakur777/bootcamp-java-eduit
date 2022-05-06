package ar.com.educacionit.services.impl;

import ar.com.educacionit.daos.ArticuloDao;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoImpl;
import ar.com.educacionit.domain.Articulo;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ArticuloServiceImpl implements ArticulosService {

	// puede tener una instancia de algun dao
	// necesitamos el de articulo

	private ArticuloDao dao;

	public ArticuloServiceImpl() {
		this.dao = new ArticuloDaoImpl();
	}

	@Override
	public Articulo getById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			return dao.getByPk(id);
		} catch (GenericException e) {
			
			throw new ServiceException("Error al consultar articulo", e);
		}
	}

}
