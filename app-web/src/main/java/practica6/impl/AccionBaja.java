package practica6.impl;

import practica6.IAccion;
import practica6.db.InMemoryDB;
import practica6.exceptions.AccionBajaException;
import practica6.model.Articulo;

public class AccionBaja implements IAccion {

	@Override
	public void exec(Articulo ctx) throws AccionBajaException {

		Articulo articulo = InMemoryDB.getById(ctx.getId());
		if (articulo.equals(null)) {
			throw new AccionBajaException("El id ingresado no existe en el repositorio");
		} else {

			InMemoryDB.delete(ctx.getId());// TODO: handle exception

			System.out.println("Se ha elminado el articulo de id:" + ctx.getId());
		}
	}

}
