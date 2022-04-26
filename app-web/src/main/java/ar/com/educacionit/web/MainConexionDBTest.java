package ar.com.educacionit.web;

import ar.com.educacionit.daos.OrdenDao;
import ar.com.educacionit.daos.impl.OrdenDaoImpl;
import ar.com.educacionit.domain.Orden;

public class MainConexionDBTest {

	public static void main(String[] args) {
		OrdenDao dao = new OrdenDaoImpl();
		
		Orden orden = new Orden(1L, "test", 150f);
		
		dao.create(orden);

	}

}
