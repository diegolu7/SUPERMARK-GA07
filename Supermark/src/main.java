import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws SQLException {
		Scanner ingreso =new Scanner(System.in);
		int op=0;
		do {
			System.out.println("\n"
					+ "   _____                         __  __            _    \n"
					+ "  / ____|                       |  \\/  |          | |   \n"
					+ " | (___  _   _ _ __   ___ _ __  | \\  / | __ _ _ __| | __\n"
					+ "  \\___ \\| | | | '_ \\ / _ | '__| | |\\/| |/ _` | '__| |/ /\n"
					+ "  ____) | |_| | |_) |  __| |    | |  | | (_| | |  |   < \n"
					+ " |_____/ \\__,_| .__/ \\___|_|    |_|  |_|\\__,_|_|  |_|\\_\\\n"
					+ "              | |                                       \n"
					+ "              |_|                                       \n"
					);
	        System.out.println("|- - - - - - - - - - - - - - - -|");
	        System.out.println("|-------- SUPER MARK 🛒 --------|");
	        System.out.println("|__________1 - CLIENTE__________|");
	        System.out.println("|__________2 - REGISTRARSE______|");
	        System.out.println("|__________3 - ADMIN____________|");
	        System.out.println("|__________4 - SALIR____________|");
	        System.out.println("|------ INGRESE UNA OPCIÓN:-----|");
	        System.out.println("|- - - - - - - - - - - - - - - -|");
	        op=Integer.parseInt(ingreso.next());
	        switch (op){
	            case 1:
	  	          System.out.println("|_______INGRESO CLIENTE:________|");
	              Scanner teclado = new Scanner(System.in);
	      		
	      		  System.out.println("Ingrese Email");
	      		  String email = teclado.next();
	      		
	      		  System.out.println("Ingrese Contrasena");
	      		  String pass = teclado.next();
	      		
	      		  Login login = new Login(email,pass);
	      		  Usuario user = login.ingresar();
	      		
	      		  if(user != null) {
	      			  //MENU CLIENTE ETC....
	      			  //InicioUsuario inicioU = new InicioUsuario(user);
	      			  //inicioU.mostrarMenu();
	      			  //-------
	      			System.out.println("Welcome: "+user.getApellido()+", "+user.getNombre()+"✅");
	      			Scanner tecla2 = new Scanner(System.in);
	      			int op_2=0;
	      				
	      			do {
	      				System.out.println("|- - - - - - - - - - - - - - - - - |");
	      		        System.out.println("|-----> Cliente: "+user.getApellido()+", "+user.getNombre());
	      		        System.out.println("|____________MENU CLIENTES🟢_______|");
	      		        System.out.println("|__________1 - VER CATEGORIAS______|");
	      		        System.out.println("|__________2 - VER MI CARRITO______|");
	      		        System.out.println("|__________3 - FINALIZAR COMPRA____|");
	      		        System.out.println("|__________4 - SALIR_______________|");
	      		        System.out.println("|- - - - - - - - - - - - - - - - - |");
	      		        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
	      		      op_2=tecla2.nextInt();
	      				
	      				switch(op_2) {
	      				case 1:
	      					//MOSTRAMOS CATEGORIAS
	      					Scanner tecla3 = new Scanner(System.in);
	      					int op2=0;
	      					do {
	      						System.out.println("|- - - - - - - - - - - - - - - - - |");
	      				        System.out.println("|-----> Cliente: "+user.getApellido()+", "+user.getNombre());
	      				        System.out.println("|___________CATEGORIAS🔵___________|");
	      				        System.out.println("|__________1 - BEBIDAS_____________|");
	      				        System.out.println("|__________2 - LACTEOS_____________|");
	      				        System.out.println("|__________3 - CARNES______________|");
	      				        System.out.println("|__________4 - VERDURAS____________|");
	      				        System.out.println("|__________5 - PERFUMERIA__________|");
	      				        System.out.println("|__________6 - SALIR_______________|");
	      				        System.out.println("|- - - - - - - - - - - - - - - - - |");
	      				        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
	      				        op2=tecla3.nextInt();
	      				        
	      				        if(op2==1||op2==2||op2==3||op2==4||op2==5) {
	      				        	//sql = traer * where id .. ... .. .
	      				        	Conexion conexionCat = new Conexion();
	      				    		String consulta = "select * from productos where id_categoria=" + "'" +op2+"'";
	      				    		
	      				    		ResultSet rs = conexionCat.devuelveConsulta(consulta);
	      				    		while(rs.next()) {
	      				    			//nom stock precio
	      				    			int id_producto = rs.getInt("ID");
	      				    			String nom = rs.getString("NOMBRE");
	      				    			int stock = rs.getInt("STOCK");
	      				    			float precio = rs.getFloat("precio");
	      				    			System.out.println("-----------------------------------------------------------------------------------------------------");			
	      				    			System.out.println("CODIGO: "+id_producto+" | PRODUCTO: "+nom+" | STOCK: "+stock+" | PRECIO: $"+precio);
	      				    			System.out.println("-----------------------------------------------------------------------------------------------------");	
	      				    			Producto Producto1 = new Producto(id_producto,nom,stock,precio);
	      				    			//this.productosDB.add(Producto1);
	      				    			//private ArrayList<Producto> carrito = new ArrayList();
	      				    			//this.productosDB
	      				    		}
	      				    		//
	      				    		Scanner teclado3 = new Scanner(System.in);
	      				        	int op_3 = -1;
	      				        	do{
	      				        		System.out.println("INGRESE EL CODIGO UN PRODUCTO PARA GUARDAR EN CARRITO! \"0\" PARA VOLVER A CATEGORIA");
	      				        		op_3=teclado3.nextInt();
	      				        		if(op_3 == 0) {
	      				        			System.out.println("VOLVIENDO A CATEGORIAS...");
	      				        		}else {
	      				        			System.out.println("AGREGADO AL CARRITO✅");
	      				        		}
	      				        	
	      				        	} while (op_3!=0);  
	      				        	
	      				        	
	      				        	//
	      				        }else if(op2 == 6) {
	      				        	System.out.println("SALISTE DE CATEGORIAS");
	      				        }
	      					}while(op2!=6);
	      					
	      					break;
	      				case 2:
	      					//MOSTRAR CARRITO
	      					break;
	      				case 3:
	      					//FINALIZAR COMPRA
	      					break;
	      				case 4:
	      					//SALIR
	      			        System.out.println("| - - - CERRANDO SESSION... - - - - -|");	
	      					break;
	      				}
	      		    }while(op_2 != 4);    
	      			  
	      			  //-------
	      		  }else {
	      			  System.out.println("No pudimos acceder a tu cuenta ❌");
	      		  }	      		  
	      		  //AHORA INSTANCIAMOS UNA CLASE CLIENTE DONDE MOSTRAREMOS EL MENU PARA CLIENTES
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
	      		  //AHORA INSTANCIAMOS UNA CLASE ADMIN DONDE MOSTRAREMOS EL MENU PARA CLIENTES
		        break;
	            case 4:
	            	System.out.println("Vuelva Pronto!👋");
	            	//OK
	            break;
	            default:
	            System.out.println("No es una opcion valida. ❌");

	        }
	    } while (op!=4);        
		

}
}
