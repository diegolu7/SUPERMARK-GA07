package tpfinal.code;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Admin {

	
	Conexion conn= new Conexion();
	//private String[][] matrizResultado;
	
	public Admin(Usuario u) throws SQLException {
	
		Scanner t= new Scanner(System.in);
		//menu
		System.out.println("Menu del administrador");
		System.out.println("1 Ver listado de productos");
		System.out.println("2 Cargar productos");
		System.out.println("3 Modificar los datos de productos cargados");
		System.out.println("4 Ver todos los clientes que realizaron una compra");
		System.out.println("5 Ver listado de productos seleccionados por el usuario");
		
		
		System.out.println("Ingresa una opcion: ");
		int opcion= t.nextInt(); //por que no me lo toma?
				
	
		if (opcion==1) {
			String sql= "select * from producto;";
			ResultSet rs= conn.devuelveConsulta(sql);
			
			System.out.println("id_producto |\t nombre |\t stock |\t fecha_vencimiento |\t precio |\t categoria");
			
			while (rs.next()) {
				System.out.println(rs.getInt("id_producto")+"\t"+rs.getString("nombre")+"\t"+rs.getInt("stock")+"\t"+rs.getDate("fecha_vencimiento")+"\t"+rs.getDouble("precio")+"\t"+rs.getString("categoria"));
	}
			
		}
	}
}
