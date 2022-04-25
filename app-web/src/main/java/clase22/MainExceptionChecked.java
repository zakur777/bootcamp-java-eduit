package clase22;

public class MainExceptionChecked {

	public static void main(String[] args) {
		
		try {
			
			saludar(null);
		} catch (Exception e) {
			//e.getStackTrace();
			String errorMsj = e.getMessage();
			System.out.println(errorMsj);
		}
		
	}

	static void saludar(String saludo) throws Exception{
		if(saludo == null) {
			throw new Exception("No informa saludo");
		}
		System.out.println("Mostrando Saludo=" + saludo);
	}
}
