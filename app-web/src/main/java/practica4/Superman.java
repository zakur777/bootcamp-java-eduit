package practica4;

public class Superman extends Volador implements Aterrizable {
	
	private int estado;

	public Superman() {
		super("Clar Kent");
		this.estado = Volador.cont;
	}

	@Override
	public Estado aterrizar() {
		System.out.println("Superman; bajando....");
		
		EstadoAterrisaje estadoAterrisaje = new EstadoAterrisaje();
		
		return estadoAterrisaje.identificarEstado(this.estado);
	}
	
}
