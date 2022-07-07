package tpfinal.code;

import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;



//atributos
public class Producto {
	private int id_producto;
	private String nombre;
	private int stock;
	//private Date fecha_vencimiento;
	private int precio;
	private String categoria;
	
	
//constructor	
	

public Producto(int id_producto, String nombre, int stock, int precio, String categoria) {
	this.id_producto = id_producto;
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
	this.categoria = categoria;
}

public Producto( ) {
	
}

//getters & setters

public int getId_producto() {
	return id_producto;
}


public void setId_producto(int id_producto) {
	this.id_producto = id_producto;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}


public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


public String getCategoria() {
	return categoria;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}



//otros metodos

//public void consultarProducto() throws SQLException {
//	Conexion conexion = new Conexion();
//	String consulta = "select * from producto where nombre = "+"'"+this.nombre+"'";
//	
//	ResultSet rs = conexion.devuelveConsulta(consulta);
//	
//	if(rs.next()) {
//			System.out.println("El producto existe");
//			//System.out.println("Su stock es de: " + this.stock);	
//				} else {
//		System.out.println("El producto no existe");
//	}
//}


public static void modificarProducto(int id_producto, String nombre, int stock, int precio, String categoria){
		
//Registrar JDBC Driver
			// JDBC nombre del driver y URL de la database
				String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
				String DB_URL = "jdbc:mysql://localhost:3306/supermercado";
			 // Credenciales de la database
				String USER = "root";
				String PASS = "Concatenacionx100.-.";
				
				 Connection conn = null;
				 Statement stmt = null;
				 
				 try{
				 //registra el JDBC driver
				 Class.forName(JDBC_DRIVER);
				 
				 //establece una conexion
				 System.out.println("Conectando a la base de datos...");
				 conn = DriverManager.getConnection(DB_URL,USER,PASS);
				 
				 //Ejecutar una consulta SQL
				 System.out.println("Generando consulta...");
				 stmt = conn.createStatement();
				 String sql =  MessageFormat.format("UPDATE supermercado.producto SET nombre = {1}, stock = {2}, precio = {3}, categoria = {4} WHERE id_producto = {0};", id_producto, nombre, stock, precio, categoria);
				 System.out.println(sql);
				 stmt.executeUpdate(sql);
				 
				
				 System.out.println("Productos actualizados exitosamente!");
				 
				 stmt.close();
				 conn.close();
				 }catch(SQLException se){
	 // Resuelve errores JDBC
					 se.printStackTrace();
				 }catch(Exception e){
	 // Resuelve errores para Class.forName
					 e.printStackTrace();
				 }finally{
	// cierra recursos
				 try{
					 if(stmt!=null)
						 stmt.close();
				 }catch(SQLException se2){
				 }
				 try{
					 if(conn!=null)
						 conn.close();
				 }catch(SQLException se){
				 se.printStackTrace();
				 	} //cierra finally try
				 } //cierra try
}

public static void agregarProducto(int id_producto, String nombre, int stock, int precio, String categoria) throws SQLException{
//Registrar JDBC Driver
		// JDBC nombre del driver y URL de la database
			String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
			String DB_URL = "jdbc:mysql://localhost:3306/supermercado";
		 // Credenciales de la database
			String USER = "root";
			String PASS = "Concatenacionx100.-.";
			
			 Connection conn = null;
			 Statement stmt = null;
			 
			 try{
			 //registra el JDBC driver
			 Class.forName(JDBC_DRIVER);
			 
			 //crea una conexion
			 System.out.println("Conectando a la base de datos...");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 
			 //Ejecutar una consulta SQL
			 System.out.println("Generando consulta...");
			 stmt = conn.createStatement();
			 String sql =  MessageFormat.format("INSERT INTO producto (id_producto, nombre, stock, precio, categoria) VALUES ({0}, {1}, {2}, {3}, {4});", id_producto, nombre, stock, precio, categoria);
			 System.out.println(sql);
			 stmt.executeUpdate(sql);
			 
			 System.out.println("Productos agregados exitosamente!");
			 
			 //Entorno de Limpieza
			 stmt.close();
			 conn.close();
			 }catch(SQLException se){
				 // Resuelve errores JDBC
				 se.printStackTrace();
			 }catch(Exception e){
				 // Resuelve errores para Class.forName
				 e.printStackTrace();
			 }finally{
// cierra recursos
			 try{
				 if(stmt!=null)
					 stmt.close();
			 }catch(SQLException se2){
			 }
			 try{
				 if(conn!=null)
					 conn.close();
			 }catch(SQLException se){
			 se.printStackTrace();
			 	} 
			 }

		
	
}



}


