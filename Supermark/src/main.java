import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws SQLException {
		Scanner ingreso =new Scanner(System.in);
		int op=0;
		do {
	        System.out.println("|-------- SUPER MARK 🛒 --------|");
	        System.out.println("|__________1 - CLIENTE__________|");
	        System.out.println("|__________2 - REGISTRARSE______|");
	        System.out.println("|__________3 - ADMINISTRAR______|");
	        System.out.println("|__________4 - SALIR____________|");
	        System.out.println("|------ INGRESE UNA OPCIÓN------|");
	        
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
	      		  
	      		  System.out.println("HASTA AQUI INGRESO CORRECTO!");
	            break;    
	            case 2:
	            	System.out.println("________REGISTRARSE________");
		      		Registro registro1 = new Registro();
		      		registro1.Registrar();
		      		registro1.validarDatos();
		      		//OK
	            break;
	            case 3:
	              System.out.println("________ADMINISTRADOR________");
	              Scanner teclado3 = new Scanner(System.in);
		      		
	      		  System.out.println("Ingrese Email");
	      		  String email3 = teclado3.next();
	      		
	      		  System.out.println("Ingrese Contrasena");
	      		  String pass3 = teclado3.next();
	      		
	      		  Login login1 = new Login(email3,pass3);
	      		  Usuario user3 = login1.ingresar();
	      		
	      		  if(user3 != null) {
	      			  System.out.println("ADMIN: "+user3.getApellido()+", "+user3.getNombre()+" ✅");
	      		  }else {
	      			  System.out.println("No pudimos acceder a tu cuenta ❌");
	      		  }	
	      		  
	      		  System.out.println("HASTA AQUI INGRESO CORRECTO!");
		        break;
	            case 4:
	            	System.out.println("Vuelva Pronto!👋");
	            	//OK
	            break;
	            default:
	            System.out.println("No es una opcion valida.");

	        }
	    } while (op!=4);        
		

}
}
