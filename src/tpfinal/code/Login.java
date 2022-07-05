package tpfinal.code;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	private String correo;
	private String password;
	private Conexion conn; 
	public Login(String correo, String password) {
		this.correo = correo;
		this.password = password;
		this.conn =new Conexion();
		
	}
	
	public Login() {
		
	}
	
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ResultSet Ingresar() throws SQLException {
		String sql = "select * from usuario where correo= "+"'"+this.correo+"'" +" and password= "+"'"+this.password+"'"+";";
		
		ResultSet rs = this.conn.devuelveConsulta(sql);
		
		return rs;
		
		
		
	}
	
	
	
	
}
