package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Vendedores {

	private Collection<String> vendedores;

	public Vendedores() {

		vendedores = new HashSet<String>();

		// primera linea del archivo
		vendedores.add("id|nombre|sucursal");

		vendedores.add("1|juan|1");
		vendedores.add("2|pedro|1");
		vendedores.add("3|nico|2");
		vendedores.add("4|santiago|3");
	}

	public Collection<Vendedor> getVendedores() {

		Collection<Vendedor> vendedores = new ArrayList<Vendedor>();

		Iterator<String> itVendedores = this.vendedores.iterator();

		if (itVendedores.hasNext()) {
			itVendedores.next();//id|nombre|sucursal
			while (itVendedores.hasNext()) {
				// ahora vendedor es un value object

				vendedores.add(new Vendedor(itVendedores.next()));

			}
		}

		return vendedores;
	}

}
