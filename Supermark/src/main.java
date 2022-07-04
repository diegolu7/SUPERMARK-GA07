import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws SQLException {/*
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Email");
		String email = teclado.next();
		
		System.out.println("Ingrese Contrasena");
		String pass = teclado.next();
		
		Login login = new Login(email,pass);
		Usuario user = login.ingresar();
		
		if(user != null) {
			System.out.println("Welcome "+user.getApellido()+", "+user.getNombre()+" ✅");
		}else {
			System.out.println("No pudimos acceder a tu cuenta ❌");
		}
		
		//programamos
		//Menu IF(ADMIN) / USUARIO
		//do{    
			//code to be executed / loop body  
			//update statement   
			//}while (condition);    
		
		//1 -> ¿ADMIN O USUARIO NORMAL?
		//2 -> USUARIO NORMAL : (LOGEARSE/REGISTRARSE)
		//3 si Logeado -> instanciamos USUARIO
		
		// */
		Registro registro1 = new Registro();
		registro1.Registrar();
		registro1.validarDatos();
	} 

}
