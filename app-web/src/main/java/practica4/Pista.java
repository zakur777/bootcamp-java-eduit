package practica4;

public class Pista {
	private String nombre;
	private Volador[] voladores;
	
	
	public Pista(String nombre) {
		super();
		this.nombre = nombre;
		this.voladores = new Volador[]{};
	}

	public String getNombre() {
		return nombre;
	}

	public Volador[] getVoladores() {
		return voladores;
	}
	

	public void agregarVoladores(Volador volador) {
		Volador[] auxVoladores = new Volador[this.voladores.length + 1];
		
		for (int i = 0; i < this.voladores.length; i++) {
			auxVoladores[i] = this.voladores[i];
		}
		auxVoladores[this.voladores.length] = volador;
		this.voladores = auxVoladores;
	}
	
	

}
