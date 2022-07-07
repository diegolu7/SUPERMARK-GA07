package tpfinal.code;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;


public class Principal {
	
	//Producto
	
	public Principal(Producto p) throws SQLException {
		

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa el id del producto");
		int id_producto = teclado.nextInt();
		System.out.println("Ingresa el nombre del producto entre ' '");
		String nombre = teclado.next();
		System.out.println("Ingresa el stock:");
		int stock = teclado.nextInt();
		System.out.println("Ingresa el precio:");
		int precio = teclado.nextInt();
		System.out.println("Ingresa la categoria entre ' ': ");
		String categoria = teclado.next();
		
		Producto productoNuevo = new Producto();
		
		productoNuevo.agregarProducto(id_producto,nombre,stock,precio,categoria);
		teclado.close();
	}
	
	
}

