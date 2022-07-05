import java.util.Scanner;

public class InicioUsuario {
	private Usuario user;
	private Conexion conexion;
	
	public InicioUsuario(Usuario user) {
		this.user=user;
		this.conexion= new Conexion();
	}
	
	public void mostrarMenu() {
		System.out.println("Welcome: "+this.user.getApellido()+", "+this.user.getNombre());
		Scanner teclado = new Scanner(System.in);
		int op=0;
		
		
		do {
			System.out.println("|- - - - - - - - - - - - - - - -|");
	        System.out.println("|-----> Cliente: "+this.user.getApellido()+", "+this.user.getNombre());
	        System.out.println("|__________1 - VER CATEGORIAS______|");
	        System.out.println("|__________2 - VER MI CARRITO______|");
	        System.out.println("|__________3 - FINALIZAR COMPRA____|");
	        System.out.println("|__________4 - SALIR_______________|");
	        System.out.println("|- - - - - - - - - - - - - - - - - |");
	        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
	        op=teclado.nextInt();
			
			switch(op) {
			case 1:
				//MOSTRAMOS CATEGORIAS
				Scanner tecla = new Scanner(System.in);
				int op2=0;
				do {
					System.out.println("|- - - - - - - - - - - - - - - -|");
			        System.out.println("|-----> Cliente: "+this.user.getApellido()+", "+this.user.getNombre());
			        System.out.println("|__________1 - BEBIDAS_____________|");
			        System.out.println("|__________2 - LACTEOS_____________|");
			        System.out.println("|__________3 - CARNES______________|");
			        System.out.println("|__________4 - VERDURAS____________|");
			        System.out.println("|__________5 - PERFUMERIA__________|");
			        System.out.println("|__________6 - SALIR_______________|");
			        System.out.println("|- - - - - - - - - - - - - - - - - |");
			        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
			        op2=tecla.nextInt();
			        
			        if(op2==1||op2==2||op2==3||op2==4||op2==5) {
			        	//DEBERIA TOMAR LOS OP DE LA DB????????????????????????
			        	//DEBERIA TOMAR LOS OP DE LA DB????????????????????????
			        	//DEBERIA TOMAR LOS OP DE LA DB????????????????????????
			        	//DEBERIA TOMAR LOS OP DE LA DB????????????????????????
			        	//DEBERIA TOMAR LOS OP DE LA DB????????????????????????
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
	    }while(op != 4);    
	}
}