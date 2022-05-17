package ar.com.educacionit.daos;

import ar.com.educacionit.daos.db.exceptions.DuplicatedException;
import ar.com.educacionit.daos.db.exceptions.GenericException;
import ar.com.educacionit.daos.impl.ArticuloDaoMysqlImpl;
import ar.com.educacionit.daos.impl.CategoriasDaoMysqlImpl;
import ar.com.educacionit.daos.impl.MarcasDaoMysqlImpl;

public class AddBatchTestCase {

	public static void main(String[] args) throws GenericException, DuplicatedException {
		//MarcasDao marcasDao = new MarcasDaoMysqlImpl();
		CategoriasDao categoriasDao = new CategoriasDaoMysqlImpl();
		ArticuloDao articuloDao = new ArticuloDaoMysqlImpl();
		((ArticuloDaoMysqlImpl) articuloDao).saveBatch();
		//((MarcasDaoMysqlImpl) marcasDao).saveBatch();
		//((CategoriasDaoMysqlImpl) categoriasDao).saveBatch();
	}

}
