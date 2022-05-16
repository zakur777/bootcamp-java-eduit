package practica6.impl;

import practica6.IAccion;
import practica6.db.InMemoryDB;
import practica6.exceptions.AccionModificacionException;
import practica6.model.Articulo;

public class AccionModificacion implements IAccion {

	@Override
	public void exec(Articulo ctx) throws AccionModificacionException {

		Articulo art = InMemoryDB.getById(ctx.getId());
		if (art.getId().equals(null)) {
			throw new AccionModificacionException(
					"El articulo con id " + ctx.getId() + "  no existe en el repositorio");
		} else {

			if (art != null) {
				InMemoryDB.update(ctx.getId(), ctx);
			}
		}

		// System.out.println("Ingrese titulo nuevo");

	}

}
