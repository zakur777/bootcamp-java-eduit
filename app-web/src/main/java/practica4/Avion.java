package practica4;

public class Avion extends Volador implements Aterrizable{
	
	private Float velocidadMaxima;
	
	public Avion(String nombre) {
		super(nombre);
	}

	@Override
	public Estado aterrizar() {
		System.out.println("Avion:" + this.getNombre() + " bajando....");
		
		EstadoAterrisaje estadoAterrisaje = new EstadoAterrisaje();
		
		return estadoAterrisaje.identificarEstado(Volador.cont);
	}

}
