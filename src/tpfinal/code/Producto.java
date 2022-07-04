package tpfinal.code;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

//atributos
public class Producto {
	private int idProducto;
	private String nombreProducto;
	private int stock;
	private Date fechaVenc;
	private double precio;
	private String nombre_categoria;
	
//constructor	
public Producto(int idProducto, String nombreProducto, int stock, Date fechaVenc, double precio, String nombre_categoria) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.stock = stock;
		this.fechaVenc = fechaVenc;
		this.precio = precio;
		this.nombre_categoria = nombre_categoria;
}
		

public Producto(int idProducto, String nombreProducto, int stock, double precio, String nombre_categoria) {
			this.idProducto = idProducto;
			this.nombreProducto = nombreProducto;
			this.stock = stock;
			this.precio = precio;
			this.nombre_categoria = nombre_categoria;

	
	}

//getters & setters
public int getIdProducto() {
	return idProducto;
}


public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}


public String getNombreProducto() {
	return nombreProducto;
}


public void setNombreProducto(String nombreProducto) {
	this.nombreProducto = nombreProducto;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}


public Date getFechaVenc() {
	return fechaVenc;
}


public void setFechaVenc(Date fechaVenc) {
	this.fechaVenc = fechaVenc;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}

public String getnNombre_Categoria() {
	return nombre_categoria;
}


public void setNombre_Categoria(String nombre_categoria) {
	this.nombre_categoria = nombre_categoria;
}
	
//otros metodos

public void consultarProducto() throws SQLException {
	Conexion conexion = new Conexion();
	String consulta = "select * from producto where nombre = "+"'"+this.nombreProducto+"'";
	
	ResultSet rs = conexion.devuelveConsulta(consulta);
	
	if(rs.next()) {
			System.out.println("El producto existe");
			//System.out.println("Su stock es de: " + this.stock);	
	} else {
		System.out.println("El producto no existe");
	}
}

public void agregarProducto() throws SQLException {
	Conexion conexion = new Conexion();
	String consulta = "INSERT INTO `supermercado`.`producto`"
	+"(`id_producto`, `nombre`, `stock`, `precio`, `nombre_categoria`) VALUES"
	+"('"+this.idProducto+"','"+this.nombreProducto+"','"+this.stock+"','"+this.precio+"','"+this.nombre_categoria+"')";
	
	ResultSet rs = conexion.devuelveConsulta(consulta);
	
	if(rs.next()) {
			System.out.println("El producto se ha agregado correctamente");
			
	} else {
		System.out.println("Error de conexion");
	}
}

//public void eliminarProducto() {}

//public void modificarStock(){ }

}
