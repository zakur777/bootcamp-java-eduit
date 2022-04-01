package practica4;

public class TorreMain {

	public static void main(String[] args) {
		
		Volador[] voladores = CreadorDeVoladores.crearVoladores();
		Pista pista1 = new Pista("Santiago 1");
		int contador = 0;
		
		for (int i = 0; i < voladores.length; i++) {
			
			if(voladores[i] instanceof Aterrizable) {
				
				Aterrizable a = (Aterrizable)voladores[i];
				
				Estado estado = a.aterrizar();
				
				if(estado.isError()) {
					System.out.println(voladores[i].getNombre() + ":" + estado.getMsj() + " enviando ayuda...");
				} else {
					pista1.asignarVoladores(voladores[i], contador++);
				}
			}else {
				System.out.println("No puede aterrizar aca...");
			}
		}
		
		voladoresEnLaPista(pista1);

		
	}
	
	public static void voladoresEnLaPista(Pista pista) {
		System.out.println("En la pista " + pista.getNombre() + " los siguientes voladores han aterrizado:");
		for (int i = 0; i < pista.getVoladores().length; i++) {
			if (!pista.getVoladores()[i].equals(null)) {
				System.out.println(pista.getVoladores()[i].getNombre() + " Aterrisaje correcto");
			}
			
		}
		System.out.println("-------------------------------------------------------------------------------");
	}

}
