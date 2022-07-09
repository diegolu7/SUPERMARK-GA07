import java.sql.ResultSet;
import java.sql.SQLException;

public class Venta {
	private Conexion conexion;

public void mostrarHistorial() throws SQLException {
	String sql = "SELECT * FROM `venta`";
	this.conexion = new Conexion();
	ResultSet rs = this.conexion.devuelveConsulta(sql);
	while(rs.next()){
		String nombre_produto = rs.getString("NOMBRE");	
		double precio_produto = rs.getDouble("precio");	
		System.out.println("-> "+nombre_produto+" Precio: "+precio_produto+"$ ✅");	
	}
	}
}