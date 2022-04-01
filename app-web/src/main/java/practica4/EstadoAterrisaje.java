package practica4;

public class EstadoAterrisaje {
	private Estado estado;
	
	public EstadoAterrisaje() {

	}


	public Estado identificarEstado(int valor) {
		
		//si es par aterrizo bien si es impar viene con problemas
		if(valor % 2 != 0) {
			this.estado = new Estado(false,"");
		}else {
			this.estado = new Estado(true,"Valor impar : error " + Volador.cont);
		}
		return this.estado;
	}

}
