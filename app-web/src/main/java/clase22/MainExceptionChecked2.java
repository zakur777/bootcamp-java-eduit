package clase22;

import java.util.Scanner;

public class MainExceptionChecked2 {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		boolean error = true;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				b = teclado.nextInt();
			}catch (Exception e) {
				teclado.next();
				continue;
				
			}
		}while(error);
		
		try {
			int div = Calculadora.dividir(a, b);
			System.out.println(div);
		} catch (DivisionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			teclado.close();
		}
	}
}
