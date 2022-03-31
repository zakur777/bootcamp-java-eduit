package practica3;

public class Validadores {

	static Boolean esString(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				return false;
		}
		return true;
	}

	static Boolean esEntero(String cadena) {
		
		if (cadena.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			
			if (!(caracter >= '0' && caracter <= '9')) {
				return false;
			}
		}
		return true;
	}

}
