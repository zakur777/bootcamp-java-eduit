package clase15.generic;

public class ServiceTablaX extends Service<TablaX> {
	

	public ServiceTablaX() {
		super(new TablaXImpl());
	}
	
	public TablaX consultarPorID(Long id) {
		return this.iTabla.buscarPorId(id);
	}

}
