package tpfinal.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {

	 Connection conn = null;
	 Statement stmt = null;
	 
	public Conexion() {
		 final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 final String DB_URL = "jdbc:mysql://localhost:3306/supermercado";
		 //Credenciales de la BDD
		 final String USER = "root";
		 final String PASS = "password";

		 
		 try {
			Class.forName(JDBC_DRIVER); //levantar el driver
			
			System.out.println("Conectando a la base de datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS); //conecta a la bdd
			
		    
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (SQLException e) {
				e.printStackTrace();
		}
		 
	}
	
	public ResultSet devuelveConsulta(String sql) throws SQLException {
		System.out.println("Realizando consulta...");
		stmt = conn.createStatement(); //crea sentencia sql sobre la conexion creada
		ResultSet rs = stmt.executeQuery(sql);
		
		return rs;
	}
}
