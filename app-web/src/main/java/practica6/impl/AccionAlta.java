package practica6.impl;

import practica6.IAccion;
import practica6.db.InMemoryDB;
import practica6.exceptions.AccionAltaException;
import practica6.model.Articulo;

public class AccionAlta implements IAccion {

	@Override
	public void exec(Articulo ctx) throws AccionAltaException {

		if (ctx.getId().equals(null) || ctx.getId() <= 0) {
			throw new AccionAltaException("Id inválido debe ser > 0");
		} else {

			InMemoryDB.save(ctx.getId(), ctx);
		}
	}

}
