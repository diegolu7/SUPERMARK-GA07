import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.time.LocalDate;
public class Carrito {
	private int id_cliente;
	private ArrayList<Integer> listaProductos = new ArrayList<Integer>();
	private int limite;
	private Conexion conexion;
	private double total;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Carrito(int limite) {
		this.limite = limite;
	}
	public ArrayList<Integer> listaProductos() {
		return listaProductos;
	}
	public void listaProductos(int id_prod) {
		this.listaProductos.add(id_prod);
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void mostrarCarrito() throws SQLException { //construyo la expresion SQL
		String sql = "SELECT * FROM `productos` where ID IN (";
		for (int i = 0; i < this.listaProductos.size(); i++) {
			//this.listaProductos.get(i);
			if(i== this.listaProductos.size()-1) {
				sql = sql+this.listaProductos.get(i)+")";	
			}else {
				sql = sql+this.listaProductos.get(i)+",";			
			}
		}
		sql=sql+";";
		this.conexion = new Conexion();
		ResultSet rs = this.conexion.devuelveConsulta(sql);
		while(rs.next()){
			String nombre_produto = rs.getString("NOMBRE");	
			double precio_produto = rs.getDouble("precio");	
			System.out.println("-> "+nombre_produto+" Precio: "+precio_produto+"$ ✅");	
		}
		System.out.println("---> TOTAL:"+this.total+" $");
	}
	public boolean agregarProducto(int id) throws SQLException {	//ADD Producto
		if(limite <= 30) {	//LIMITE DE PRODUCTOS 30
			this.conexion = new Conexion();
			String sql = "SELECT * FROM `productos` where ID="+id+";";
			ResultSet rs = this.conexion.devuelveConsulta(sql);
			while(rs.next()){
				String nombre_produto = rs.getString("NOMBRE");	
				double precio_produto = rs.getDouble("precio");	
				
				System.out.println("-> "+nombre_produto+" Precio: "+precio_produto+"$ ✅");
				this.total=this.total+precio_produto;		
			}
			return true;
		}else{
			System.out.println("Llego al limite de productos en su carrito!");
			return false;
		}
	}
	public void registrarVenta() throws SQLException {
		//registrar venta en DB
	    LocalDate fecha_hoy = LocalDate.now();
	    
		for (int i = 0; i < this.listaProductos.size(); i++) {
			String sql = "insert into venta values(null,"+"'"+fecha_hoy+"',"+"'"+this.total+"',"+"'"+this.id_cliente+"',"+"'"+i+"');";
			//System.out.println(sql);
			this.conexion = new Conexion();
			this.conexion.realizaConsulta(sql);
		}
	}
	public void actualizarStock() {
		//actualizar stock! -> quitar productos vendidos!
	}
	public void eliminarProducto() {	//Remove Producto de carrito
			//Elimino el id del array
			//resto el total
			//retorno TRUE
	}
}