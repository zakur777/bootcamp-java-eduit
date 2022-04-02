package practica4;

public class Avion extends Volador implements Aterrizable{
	
	private Float velocidadMaxima;
	private int estado;
	
	public Avion(String nombre) {
		super(nombre);
		this.estado = Volador.cont;
	}

	@Override
	public Estado aterrizar() {
		System.out.println("Avion:" + this.getNombre() + " bajando....");
		
		EstadoAterrisaje estadoAterrisaje = new EstadoAterrisaje();
		
		return estadoAterrisaje.identificarEstado(this.estado);
	}

}
