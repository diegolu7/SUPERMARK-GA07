import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws SQLException {
		Carrito carrito1 = new Carrito(0); //instancio un carrito vacio
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
	      		  
	      		  if(user != null && user.getTipo()== 1) {
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
	      				        System.out.println("|__________6 - <-VOLVER_ATRAS______|");
	      				        System.out.println("|- - - - - - - - - - - - - - - - - |");
	      				        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
	      				        op2=tecla3.nextInt();
	      				        
	      				        if(op2==1||op2==2||op2==3||op2==4||op2==5) {
	      				        	//CORREGIR: DEBO TRAER LAS OP DE LA DB!!
	      				        	Conexion conexionCat = new Conexion();
	      				    		String consulta = "select * from productos where id_categoria=" + "'" +op2+"'";
	      				    		
	      				    		ResultSet rs = conexionCat.devuelveConsulta(consulta);
	      				    		while(rs.next()) {
	      				    			int id_producto = rs.getInt("ID");
	      				    			String nom = rs.getString("NOMBRE");
	      				    			int stock = rs.getInt("STOCK");
	      				    			float precio = rs.getFloat("precio");
	      				    			if(stock != 0) { //SOLO MUESTRO SI HAY STOCK
		      				    			System.out.println("-----------------------------------------------------------------------------------------------------");			
		      				    			System.out.println("CODIGO: "+id_producto+" | PRODUCTO: "+nom+" | STOCK: "+stock+" | PRECIO: $"+precio);
		      				    			System.out.println("-----------------------------------------------------------------------------------------------------");    				    			
	      				    			}
	      				    		}
	      				    		Scanner teclado3 = new Scanner(System.in);
	      				        	int op_3 = -1;
	      				        	do{
	      				        		System.out.println("INGRESE EL CODIGO UN PRODUCTO PARA GUARDAR EN CARRITO! \"0\" PARA VOLVER A CATEGORIA");
	      				        		op_3=teclado3.nextInt();
	      				        		if(op_3 == 0) {
	      				        			System.out.println("VOLVIENDO A CATEGORIAS...");
	      				        		}else {      				        			
	      				        			if(carrito1.agregarProducto(op_3)){ //le paso el id seleccionado
	      				        				carrito1.listaProductos(op_3); //agrego a lista de productos seleccionados
	      				        				System.out.println("AGREGADO AL CARRITO✅");			        			
	      				        			}      				  				    
	      				        		}
	      				        	} while (op_3!=0);     				        	
	      				        }else if(op2 == 6) {
	      				        	System.out.println("SALISTE DE CATEGORIAS");
	      				        }
	      					}while(op2!=6);
	      					
	      					break;
	      				case 2:
	      					//MOSTRAR CARRITO
	      					if(carrito1.listaProductos().isEmpty()) {
	      						System.out.println("NO HAY PRODUCTOS EN SU CARRITO ⚠️");
	      					}else {
	      						System.out.println("PRODUCTOS SELEECCIONADOS 🛒: ");
	      						carrito1.mostrarCarrito();
	      					}
	      					break;
	      				case 3:
	      					//FINALIZAR COMPRA
	      					System.out.println("FACTURA DE COMPRA:");
      						carrito1.mostrarCarrito();
      						System.out.println("FINALIZAR COMPRA = 1 | CANCELAR COMPRA 0");
      						Scanner teclado5 =new Scanner(System.in);
      						int respuesta=Integer.parseInt(teclado5.next());    						
      						if(respuesta==1) {
      							System.out.println("COMPRA EXITOSA! ✅");
      							carrito1.setId_cliente(user.getId_user());
      							carrito1.registrarVenta();
      						}else {
      							System.out.println("COMPRA CANCELADA ❌");
      							carrito1.listaProductos().clear();
      						}
      						break;
	      				case 4:
	      					//SALIR
	      			        System.out.println("CERRANDO SESSION...");	
	      					break;
	      				}
	      		    }while(op_2 != 4);    
	      			  
	      			  //-------
	      		  }else {
	      			  System.out.println("No pudimos acceder a tu cuenta 'CLIENTE' ❌");
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
	              Scanner teclado3 = new Scanner(System.in);
		      		
	      		  System.out.println("Ingrese Email");
	      		  String email3 = teclado3.next();
	      		
	      		  System.out.println("Ingrese Contrasena");
	      		  String pass3 = teclado3.next();
	      		
	      		  Login login1 = new Login(email3,pass3);
	      		  Usuario user3 = login1.ingresar();
	      		
      			 if(user3 != null && user3.getTipo()== 2) {
	      			  System.out.println("ADMIN: "+user3.getApellido()+", "+user3.getNombre()+" ✅");
	      			  //PROGRAMAMOS MENU ADMIN
	      		  }else {
	      			  System.out.println("No pudimos acceder a tu cuenta 'ADMIN' ❌");
	      		  }
		        break;
	            case 4:
	            	System.out.println("Vuelva Pronto!👋");
	            break;
	            default:
	            System.out.println("No es una opcion valida. ❌");

	        }
	    } while (op!=4);        
		

}
}
