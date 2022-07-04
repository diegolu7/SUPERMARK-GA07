package tpfinal.code;

import java.sql.SQLException;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) throws SQLException {
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Escriba el nombre del producto que busca: ");
//		String nombreProducto = teclado.next();
//		Producto producto = new Producto(0, nombreProducto, 0, null, 0, null);
//		teclado.close();
//		producto.consultarProducto();
		
		
		Scanner teclado1 = new Scanner (System.in);	
		System.out.println("Ingresa el id del producto, su nombre, stock, precio y categoria: ");
		Producto nuevoProducto = new Producto(teclado1.nextInt(), teclado1.next(), teclado1.nextInt(), teclado1.nextDouble(), teclado1.next());
		nuevoProducto.agregarProducto();
		
	
	}
	

}
