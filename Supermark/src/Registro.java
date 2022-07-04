import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
	//private int id_user;
	private String nombre;
	private String apellido;
	private String email;
	private String pass;
	private int tipo;
	private boolean tieneTarjeta;
	
	public void Registrar() {
		
		System.out.println("---------- FORMULARIO DE REGISTRO ----------");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Nombre: ");
		this.nombre = teclado.next();
		
		System.out.println("Ingrese Apellido ");
		this.apellido = teclado.next();
		
		System.out.println("Ingrese Email ");
		this.email = teclado.next();
		
		System.out.println("Ingrese Contrasena ");
		this.pass = teclado.next();
		
		this.tipo=1;
		this.tieneTarjeta=false;//NO ya que ingresa por primera vez
		
	}
	public void validarDatos() throws SQLException {
		//VALIDAMOS EMAIL
		/*Conexion conexion = new Conexion();
		String consulta = "select * from usuario where email="+"'"+this.email+"'";
		
		ResultSet rs = conexion.devuelveConsulta(consulta);
		String email = rs.getString("EMAIL");
		if(email != "") {
			System.out.println("ERROR: Ya existe un Usuario con este Email: "+email+" ❌");
			return;
		}*/
		//VALIDAMOS CAMPOS VACIOS
		if(this.nombre!=""&&this.apellido!=""&&this.email!=""&&this.pass!="") {
			//System.out.println("REGISTRANDO.....");
			//caso de datos correctos -> registro al usuario
			String sql = "insert into usuario values(null,"+"'"+this.nombre+"',"+"'"+this.apellido+"',"+"'"+this.email+"',"+"'"+this.pass+"',"+"false,1);";
					
			Conexion conexion2 = new Conexion();
			conexion2.realizaConsulta(sql);
			System.out.println("Usuario registrado con exito!! ✅");
		}else {
			System.out.println("ERROR: Existen campos vacios!! ❌");
		}
	}
}
