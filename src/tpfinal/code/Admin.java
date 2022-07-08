package tpfinal.code;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Admin {

	
	Conexion conn= new Conexion();
	private String[][] matrizResultado;
	
	public Admin(Usuario u) throws SQLException {
	
		Scanner t= new Scanner(System.in);
		//menu
		System.out.println("\n");
		System.out.println("Menu del administrador");
		System.out.println("1 Ver listado de productos");
		System.out.println("2 Cargar productos");
		System.out.println("3 Modificar los datos de productos cargados");
		System.out.println("4 Eliminar productos");
		System.out.println("5 Ver todos los clientes que realizaron una compra");
		System.out.println("6 Ver listado de productos seleccionados por el usuario");
		
		
		System.out.println("Ingresa una opcion: ");
		int opcion= t.nextInt(); //por que no me lo toma?
				
	
		if (opcion==1) {
			System.out.println("Elegiste ver listado de productos");
			String sql= "select * from producto;";
			ResultSet rs= conn.devuelveConsulta(sql);
			
			System.out.println(" id_producto | nombre  | stock | precio | categoria");
			
			while (rs.next()) {
				System.out.println("\t"+rs.getInt("id_producto")+"\t"+rs.getString("nombre")+"\t"+rs.getInt("stock")+"\t"+rs.getDouble("precio")+"\t"+rs.getString("categoria"));
	//como guardo esto en una matriz para que salga mas ordenado?		
				}
		
		}
	else if (opcion==2){
		System.out.println("Elegiste cargar productos");
		
		Producto productoNuevo = new Producto();
		Principal principal = new Principal(productoNuevo);
		
	} else if (opcion==3){
		System.out.println("Elegiste modificar los datos de productos cargados");
		Producto productoActualizado =new Producto();
		ModificacionProd actualizacion = new ModificacionProd(productoActualizado);
	} else if(opcion==4) {
		System.out.println("Elegiste eliminar productos");
		Producto productoEliminado = new Producto();
		EliminacionProd eliminacion = new EliminacionProd(productoEliminado);
	}

	}
}
