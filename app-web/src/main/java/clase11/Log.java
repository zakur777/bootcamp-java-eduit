package clase11;

public abstract class Log {

	private String msj;
	public final Long idLong = 1l;
	protected static int cont = 0; // no le pertenece a ninguna instancia si no a la clase log

	public Log() {
		
	}

	public Log(String msj) {
		this.msj = msj;
	}
	
	public abstract void loguear();

	public String getMsj() {
		String msj;
		if(this.msj == null) {
			msj = "";
		}else {
			msj = this.msj;
		}
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}
	
}
