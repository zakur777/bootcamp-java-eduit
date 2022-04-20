package clase19;

import clase7.Articulo;

public class AccionModificar implements IAccion {

	@Override
	public void exec(Articulo ctx) {
		Articulo articulo = InMemoryDb.getById(ctx.getId());
		
		if (articulo != null) {
			InMemoryDb.update(ctx.getId(), ctx);
		}
		
	}

}
