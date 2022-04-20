package clase19;

import java.util.HashMap;
import java.util.Map;

import clase7.Articulo;

public class InMemoryDb {
	
	static private Map<Long, Articulo> db = new HashMap<>();
	
	public static void save(Long key, Articulo valor) {
		InMemoryDb.db.put(key, valor);
	}
	
	public static void update(Long Key, Articulo newValue) {
		InMemoryDb.db.replace(Key, newValue);
	}
	
	public static void delete(Long key) {
		InMemoryDb.db.remove(key);
	}
	
	public static Articulo getById(Long key) {
		Articulo value = null;
		if (InMemoryDb.db.containsKey(key)) {
			value = InMemoryDb.db.get(key);
		}
		return value;
	}

	public static void listAll() {
		System.out.println(InMemoryDb.db.values());
		
	}
	

}
