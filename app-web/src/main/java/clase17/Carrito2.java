package clase17;

import java.util.ArrayList;
import java.util.List;

public class Carrito2 {

	private List<String> items;

	public Carrito2() {
		items = new ArrayList<String>();
	}

	public void agregar(String item) {
		items.add(item);
	}

}
