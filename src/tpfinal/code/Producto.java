package tpfinal.code;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.StatementEvent;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

//atributos
public class Producto {
	private int id_producto;
	private String nombre;
	private int stock;
	private Date fecha_vencimiento;
	private double precio;
	private String categoria;
	
//constructor	
public Producto(int id_producto, String nombre, int stock, Date fecha_vencimiento, double precio, String categoria) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.stock = stock;
		this.fecha_vencimiento = fecha_vencimiento;
		this.precio = precio;
		this.categoria = categoria;
}
		

public Producto(int id_producto, String nombre, int stock, double precio, String categoria) {
	this.id_producto = id_producto;
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
	this.categoria = categoria;
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


public Date getFecha_vencimiento() {
	return fecha_vencimiento;
}


public void setFecha_vencimiento(Date fecha_vencimiento) {
	this.fecha_vencimiento = fecha_vencimiento;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public String getCategoria() {
	return categoria;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}



//otros metodos

public void consultarProducto() throws SQLException {
	Conexion conexion = new Conexion();
	String consulta = "select * from producto where nombre = "+"'"+this.nombre+"'";
	
	ResultSet rs = conexion.devuelveConsulta(consulta);
	
	if(rs.next()) {
			System.out.println("El producto existe");
			//System.out.println("Su stock es de: " + this.stock);	
	} else {
		System.out.println("El producto no existe");
	}
}



public void agregarProducto() throws SQLException {
}
//public void eliminarProducto() {}

//public void modificarStock(){ }

}
