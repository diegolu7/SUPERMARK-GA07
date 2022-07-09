import java.sql.ResultSet;
import java.sql.SQLException;

public class Venta {
	private Conexion conexion;

public void mostrarHistorial() throws SQLException {
	String sql = "SELECT * FROM `venta`";
	this.conexion = new Conexion();
	ResultSet rs = this.conexion.devuelveConsulta(sql);
	while(rs.next()){
		String fecha_compra = rs.getString("FECHA");	
		int id_usuario = rs.getInt("ID_USUARIO");	
		int id_producto = rs.getInt("ID_PRODUCTO");
		System.out.println("CLIENTE: "+this.mostrarUsuario(id_usuario)+" PRODUCTO: "+this.mostrarProducto(id_producto)+" FECHA:"+fecha_compra);
		System.out.println("---------------------------------------------------------------------------------------------------");
	}
	}

public String mostrarUsuario(int id_usuario) throws SQLException {
	String sql = "SELECT * FROM `usuario` WHERE id = "+id_usuario+";";
	Conexion conectar1 = new Conexion();
	ResultSet rs = conectar1.devuelveConsulta(sql);
	while(rs.next()){
		String cliente_nom = rs.getString("NOMBRE");
		String cliente_ape = rs.getString("APELLIDO");	
		String cliente = cliente_ape+" "+cliente_nom;
		return cliente;
	}
	return "ERROR";
}
public String mostrarProducto(int id_producto) throws SQLException {
	String sql = "SELECT * FROM `productos` WHERE id = "+id_producto+";";
	Conexion conectar1 = new Conexion();
	ResultSet rs = conectar1.devuelveConsulta(sql);
	while(rs.next()){
		String producto = rs.getString("NOMBRE");	
		return producto;
	}
	return "ERROR";
}
}