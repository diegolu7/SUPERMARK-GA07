import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	private String email;
	private String pass;
	public Login(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null;
		
		Conexion conexion = new Conexion();
		String sql = "select * from usuario where email="+"'"+
		this.email+"'"+" and contrasenia="+"'"+this.pass+"'";
		
		ResultSet rs = conexion.devuelveConsulta(sql);
		while(rs.next()){
			int id_user = rs.getInt("ID");
			String nombre = rs.getString("NOMBRE");
			String apellido = rs.getString("APELLIDO");
			String email = rs.getString("EMAIL");
			int tipoUsuario = rs.getInt("ID_TIPODEUSUARIO");
			boolean tieneTarjeta = rs.getBoolean("TIENETARJETA");
			
			user = new Usuario(id_user,nombre,apellido,email,tipoUsuario,tieneTarjeta);
		}
		return user;
	}
}