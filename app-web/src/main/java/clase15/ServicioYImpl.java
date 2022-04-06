package clase15;

public class ServicioYImpl implements IGeneric<TipoY> {

	@Override
	public TipoY parse() {
		// json
		// xml
		//csv
		//binario
		
		String dato = "{}";
		
		TipoY tipoY = new TipoY(dato);
		return tipoY;
	}

}
