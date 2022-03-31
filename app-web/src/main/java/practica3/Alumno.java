package practica3;


public class Alumno {
	private String nombre;
	private String apellido;
	private Examen[] examen;
	private Double promedio;
	
	public Alumno(String nombre, String apellido, Examen[] examen, Double promedio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.examen = examen;
		this.promedio = promedio;
	}
	
	public Alumno(Alumno alumno) {
		this(alumno.nombre, alumno.apellido, alumno.examen, alumno.promedio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Examen[] getExamen() {
		return examen;
	}

	public void setExamen(Examen[] examen) {
		this.examen = examen;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}	

}
