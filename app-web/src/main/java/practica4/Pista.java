package practica4;

public class Pista {
	private String nombre;
	private Volador[] voladores;
	
	
	public Pista(String nombre) {
		super();
		this.nombre = nombre;
		this.voladores = new Volador[10];
	}

	public String getNombre() {
		return nombre;
	}

	public Volador[] getVoladores() {
		return voladores;
	}
	

	public void asignarVoladores(Volador volador, int index) {
		if (index >= 0 && index <= 9) {
			this.voladores[index] = volador;			
		} else {
			System.out.println("Capacidad maxima excedida, solo se aceptan 10 voladores en esta pista");
		}

	}
	
	

}
