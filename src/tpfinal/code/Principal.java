package tpfinal.code;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Principal {
//producto
	public static void main(String[] args) throws SQLException {
	Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el nombre del producto que busca: ");
		String nombreProducto = teclado.next();
		Producto producto = new Producto(0, nombreProducto, 0, null, 0, null);
		teclado.close();
		producto.consultarProducto();
		
		
	}	
}

