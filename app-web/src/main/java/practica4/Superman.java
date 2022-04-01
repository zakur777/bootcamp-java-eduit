package practica4;

public class Superman extends Volador implements Aterrizable {

	public Superman() {
		super("Clar Kent");
	}

	@Override
	public Estado aterrizar() {
		System.out.println("Superman; bajando....");
		
		EstadoAterrisaje estadoAterrisaje = new EstadoAterrisaje();
		
		return estadoAterrisaje.identificarEstado(Volador.cont);
	}
	
}
