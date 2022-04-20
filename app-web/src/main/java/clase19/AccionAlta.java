package clase19;

import clase7.Articulo;

public class AccionAlta implements IAccion{

	@Override
	public void exec(Articulo ctx) {
		InMemoryDb.save(ctx.getId(), ctx);
		
	}

}
