package ar.com.educacionit.daos.impl;

import ar.com.educacionit.daos.OrdenDao;
import ar.com.educacionit.daos.db.ConexionDB;
import ar.com.educacionit.daos.db.exceptions.ConnectionException;
import ar.com.educacionit.domain.Orden;

public class OrdenDaoImpl implements OrdenDao {
	
	private ConexionDB con;
	
	public OrdenDaoImpl() {
		this.con = new ConexionDB("root", "1234");
	}

	@Override
	public Orden create(Orden orden) {
		
		try(ConexionDB con = this.con.open()) {
			
			orden.setId(1L);
			
		} catch (ConnectionException e) {
			// TODO: handle exception
		}
		
		return orden;
	}

	@Override
	public Orden read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orden update(Orden ordenToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orden delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
