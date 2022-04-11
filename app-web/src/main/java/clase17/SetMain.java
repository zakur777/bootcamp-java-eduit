package clase17;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		Set<Carrito2> carritoSet = new HashSet<>();
		
		Carrito2 carrito = new Carrito2();
		carritoSet.add(carrito);
		
		Carrito2 carrito2 = new Carrito2();
		carritoSet.add(carrito2);
		
		System.out.println(carrito.equals(carrito2));
		
		System.out.println(carritoSet.contains(carrito));
		System.out.println(carritoSet.contains(carrito2));

	}

}
