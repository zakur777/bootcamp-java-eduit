package practica4;

public class CreadorDeVoladores {

	public static Volador[] crearVoladores() {
		Avion avion = new Avion("Avion1");
		Helicoptero helicoptero = new Helicoptero("Apache1");
		Superman superman = new Superman();
		Ovni ovni = new Ovni();
		
		return new Volador[]{avion,helicoptero,superman,ovni};
	}

}
