import java.sql.SQLException;
import java.time.LocalDate;

public class Producto {
	private int id_producto;
	private String nombre;
	private int stock;
	private float precio;
	
	public Producto(int id_producto, String nombre, int stock, float precio) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean AddProduct(String fecha_v,int categoria_p) throws SQLException{
		String sql = "INSERT INTO `productos` values(null,"+"'"+this.nombre+"',"+"'"+this.stock+"',"+"'"+fecha_v+"',"+"'"+categoria_p+"',"+"'"+this.precio+"')";
		if(this.nombre!=""&&this.stock!=0 &&this.precio!=0 && categoria_p > 0 && categoria_p < 6) {
			//inserto
			Conexion conexion2 = new Conexion();
			conexion2.realizaConsulta(sql);
			return true;
		}else {
			return false;
		}
	}
	public boolean modificarProducto(String fecha_v,int categoria_p) {
		String sql ="UPDATE `productos` SET `NOMBRE`='"+this.nombre+"',`STOCK`='"+this.stock+"',`FECHA_VENCIMIENTO`='"+fecha_v+"',`ID_CATEGORIA`='"+categoria_p+"',`precio`='"+this.precio+"' WHERE ID = "+this.id_producto+";";
		Conexion conexion = new Conexion();
		try {
			conexion.realizaConsulta(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
}
