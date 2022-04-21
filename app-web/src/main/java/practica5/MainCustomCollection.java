package practica5;

public class MainCustomCollection {

	public static void main(String[] args) {
		CollectionCustom<String> lista = new CollectionCustom<>();
		
		lista.add("Pedro");
		lista.add("Juan");
		lista.add("Diego");
		lista.add("Juan");
		
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		lista.remove("Juan");
		
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		lista.addFirst("Walter");
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		lista.addLast("Zakur");
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		
		lista.add("Persona6");
		lista.add("Persona7");
		lista.add("Persona8");
		lista.add("PersonaRemove");
		lista.add("Persona10");
		lista.add("Persona11");
		lista.add("Persona12");
		lista.add("Persona13");
		lista.add("PersonaRemove");
		lista.add("Persona15");
		lista.add("Persona16");
		lista.add("PersonaRemove");
		
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		
		
		lista.removeAll("PersonaRemove");
		
		System.out.println(lista);
		System.out.println("Tamaño " + lista.size());
		
		CollectionCustom<Integer> listaNumeros = new CollectionCustom<>();
		
		listaNumeros.add(1);
		listaNumeros.add(115);
		listaNumeros.add(18);
		listaNumeros.add(301);
		listaNumeros.add(2);
		listaNumeros.add(405);
		
		System.out.println(listaNumeros);
		System.out.println("Tamaño " + listaNumeros.size());
		

	}

}
