import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws SQLException {
		Scanner ingreso =new Scanner(System.in);
		int op=0;
		do {
	        System.out.println("-------- SUPER-MARK🛒 --------");
	        System.out.println("________1 - CLIENTE________");
	        System.out.println("________2 - REGISTRARSE____");
	        System.out.println("________3 - ADMINISTRAR____");
	        System.out.println("________4 - SALIR__________");
	        System.out.println("---- INGRESE UNA OPCIÓN----");
	        
	        op=Integer.parseInt(ingreso.next());
	        switch (op){
	            case 1:
	              System.out.println("________CLIENTE________");
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
	            break;    
	            case 2:
	            	System.out.println("________REGISTRARSE________");
		      		Registro registro1 = new Registro();
		      		registro1.Registrar();
		      		registro1.validarDatos();

	            break;
	            case 3:
	              System.out.println("________ADMINISTRADOR________");
		        break;
	            case 4:
	            	System.out.println("Vuelva Pronto!👋");
	            break;
	            default:
	            System.out.println("No es una opcion valida.");

	        }
	    } while (op!=4);        
		

}
}
