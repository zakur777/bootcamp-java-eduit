package clase19;

public class MainMap {

	public static void main(String[] args) {
		Integer opcion = 1;
		
		IAccion accion = AccionMap.getAccion(opcion);
		
		accion.exec();
		
		

	}

}
