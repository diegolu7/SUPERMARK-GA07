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
	public void ingresar() throws SQLException {
		Conexion conexion = new Conexion();
		String sql = "select * from usuario where email="+"'"+
		this.email+"'"+" and contrasenia="+"'"+this.pass+"'";
		
		ResultSet rs = conexion.devuelveConsulta(sql);
		while(rs.next()){
			System.out.println("ingreso correcto");
		}
	}
}