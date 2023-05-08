package co.edu.uptc.persistencia.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConeccion {
	
	// Definir la ruta de la base de datos
		private String dbUrl = "jdbc:mysql://127.0.0.1:3306/envios";
		 // Definir el nombre de usuario de la base de datos
		private String dbUser = "root";
		 // Definir la contrase�a de la base de datos
		private String dbPassword = "1234";
		 // Definir controlador de carga
		private String jdbcName = "com.mysql.jdbc.Driver";
	 
		 // Con�ctate a la base de datos
		public Connection getConn() {
			Connection conn = null;
			try {
				Class.forName(jdbcName);
			} catch (Exception e) {
				 System.err.println ("�Error al cargar el controlador!");
			}
			try {
				conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			} catch (SQLException ex) {
				 System.err.println ("�Error al conectarse a la base de datos!");
			}
			return conn;
		}

}
