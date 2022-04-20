package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ventas {

	private Collection<String> ventas;

	public Ventas() {

		ventas = new HashSet<String>();

		// primera linea del archivo
		ventas.add("id_vendedor|fecha_venta|monto_venta");

		ventas.add("1|01/04/2022|1500");
		ventas.add("1|15/04/2022|1500");
		ventas.add("2|10/03/2022|14000");
		ventas.add("1|16/04/2022|3500");
	}

	public Collection<Venta> getVentas() {

		Collection<Venta> ventas = new ArrayList<>();

		Iterator<String> itVentas = this.ventas.iterator();

		if (itVentas.hasNext()) {
			itVentas.next();//id|nombre|sucursal
			while (itVentas.hasNext()) {
				// ahora vendedor es un value object

				ventas.add(new Venta(itVentas.next()));

			}
		}

		return ventas;
	}

}
