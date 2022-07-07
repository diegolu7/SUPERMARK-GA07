package tpfinal.code;

import java.util.Scanner;

public class ModificacionProd {

	public  ModificacionProd(Producto p) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("ingresa el id del producto a actualizar");
	int id_producto = teclado.nextInt();
	System.out.println("Ingresa el nombre del nuevo producto entre ' '");
	String nombre = teclado.next();
	System.out.println("Ingresa el stock:");
	int stock = teclado.nextInt();
	System.out.println("Ingresa el precio:");
	int precio = teclado.nextInt();
	System.out.println("Ingresa la categoria entre ' ': ");
	String categoria = teclado.next();
	
	Producto productoActualizado = new Producto();
	
	productoActualizado.modificarProducto(id_producto,nombre,stock,precio,categoria);
	teclado.close();
}
}

