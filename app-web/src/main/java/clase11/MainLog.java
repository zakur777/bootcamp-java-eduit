package clase11;

import java.util.Scanner;

public class MainLog {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String op = "1";//fs 2; email
		String msj = "mensaje a enviar";
		
		System.out.println("Ingrese cantidad de log");
		
		int cantidad = teclado.nextInt();
		
		Log[] log = new Log[cantidad];
		

		for(int i=0; i<log.length; i++) {
			System.out.println("1- FS, 2 - Email");
			op = teclado.next();
			
			Log aux = getLog(op);
			//aux.idLong = 100l;
			
			aux.setMsj(msj);
			log[i] = aux;
			
			/*
			if(op.equals("1")) {
				log[i] = new FSLog(msj);
			}else if(op.equals("2")) {
				log[i] = new EmailLog(msj);
			} else {
				log[i] = new DefaultLog(msj);
			}
			*/
		}
		
		for (Log _log : log) {
			
			_log.loguear();
			
			if (_log instanceof IEjecutable) {
				IEjecutable iinterface = (IEjecutable)_log;
				iinterface.ejecutar();
			}
			
			if (_log instanceof ISaludable) {
				ISaludable iinterface = (ISaludable)_log;
				iinterface.saludar();
			}
		}
		
		teclado.close();
		
	}
	
	public static Log getLog(String op) {
		Log log;
		
		switch (op) {
		case "1":
			log = new FSLog();
			break;
		case "2":
			log = new EmailLog();
			break;
		default:
			log = new DefaultLog();
			break;
		}
		
		return log;
	}

}
