package ar.com.educacionit.services.exceptions;

import java.io.IOException;

public class ParseException extends Exception {

	public ParseException(String message) {
		super(message);

	}

	public ParseException(String string, IOException e) {
		super(string, e);
	}
	
}
