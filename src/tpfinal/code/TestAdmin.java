package tpfinal.code;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestAdmin {

	public static void main(String[] args) throws SQLException {
		Login login = new Login("juan@correo","1234");
		ResultSet rs = login.Ingresar();

		if(rs.next()) {
			
			if(rs.getInt("rol")==1) {
				System.out.println("Bienvenido! Usuario administrador");
				Usuario u=new Usuario(rs.getInt("id_usuario"),rs.getString("nombre"),rs.getString("apellido1"),rs.getString("apellido2"),rs.getString("dni"),rs.getString("telefono"),rs.getString("correo"),rs.getString("password"),rs.getInt("rol"));
		
				Admin a = new Admin(u); //pasarle el panel al administrador
			
			} else {
				System.out.println("Usuario cliente");
			Usuario u=new Usuario(rs.getInt("id_usuario"),rs.getString("nombre"),rs.getString("apellido1"),rs.getString("apellido2"),rs.getString("dni"),rs.getString("telefono"),rs.getString("correo"),rs.getString("password"),rs.getInt("rol"));
			}
			
		} else {
			System.out.println("Usuario o contraseña incorrectos");
		
		}
	}

}
