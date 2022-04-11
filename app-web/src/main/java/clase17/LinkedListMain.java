package clase17;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedList<String> nombres = new LinkedList<>();

		nombres.add("carlos");
		nombres.add("juan");
		nombres.add("jose");
		nombres.add("maria");
		
		nombres.addFirst("antes de carlos");
		nombres.addLast("despues de maria");
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

	}

}
