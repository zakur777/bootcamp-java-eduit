package practica6;

import practica6.exceptions.GenericException;
import practica6.model.Articulo;

public interface IAccion {

	public void exec(Articulo ctx) throws GenericException;
}
