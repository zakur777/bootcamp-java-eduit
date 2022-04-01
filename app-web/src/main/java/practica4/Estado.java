package practica4;

public class Estado {

	private boolean error;
	private String mensaje;
	
	public Estado(boolean error, String msj) {
		this.error = error;
		this.mensaje = msj;
	}

	public boolean isError() {
		return error;
	}

	public String getMsj() {
		return mensaje;
	}
	
}
