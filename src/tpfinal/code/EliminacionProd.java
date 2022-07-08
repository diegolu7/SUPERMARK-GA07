package tpfinal.code;

import java.sql.SQLException;
import java.util.Scanner;

public class EliminacionProd {
	
	public EliminacionProd(Producto p) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa el id del producto que deseas eliminar");
		int id_producto = teclado.nextInt();
			
		Producto productoEliminado = new Producto();
		
		productoEliminado.eliminarProducto(id_producto);
		teclado.close();
		
	}

}
