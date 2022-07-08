
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
	
}
