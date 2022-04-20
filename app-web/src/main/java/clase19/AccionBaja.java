package clase19;

import clase7.Articulo;

public class AccionBaja implements IAccion {
	


	@Override
	public void exec(Articulo ctx) {
		//dar de baja por id
		InMemoryDb.delete(ctx.getId());
		System.out.println("Se ha eliminado el articulo de id: " + ctx.getId());
		
	}

	

}
