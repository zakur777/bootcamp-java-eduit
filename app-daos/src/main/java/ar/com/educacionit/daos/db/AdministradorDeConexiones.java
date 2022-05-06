package ar.com.educacionit.daos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ar.com.educacionit.daos.db.exceptions.GenericException;

public class AdministradorDeConexiones {
	
	public static Connection obtenerConexion() throws GenericException {
		
		String host = "localhost";
		String user = "root";
		String password ="34Admin12";
		//String port = ""; //tomamos el puerto por defecto
		String dbName = "bootcam-java-educacionit";
		
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://"+host+"/"+dbName+"?serverTimeZone=UTC&userSSL=false";
		
		//creación de la clase que perteneces al jar mysql-connection
		//no puedo hacer un new Driver, cargar dinamicamente una clase
		//usando
		try {
			Class.forName(driverName);
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			return connection;
		} catch (SQLException sqe) {
			throw new GenericException("no se ha podido conectar a: " + url, sqe);
		} catch (ClassNotFoundException cnfe) {
			throw new GenericException("No se ha encontrado el driver: " + driverName, cnfe);
		}
		
	}

}
