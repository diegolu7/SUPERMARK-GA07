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
	        System.out.println("|__________1 - VER TIENDA__________|");
	        System.out.println("|__________2 - VER MI CARRITO______|");
	        System.out.println("|__________3 - FINALIZAR COMPRA____|");
	        System.out.println("|__________4 - SALIR_______________|");
	        System.out.println("|- - - - - - - - - - - - - - - - - |");
	        System.out.println("| - - - ELIJE UNA OPCION: - - - - -|");	
	        op=teclado.nextInt();
			
			switch(op) {
			case 1:
				//MOSTRAMOS PRODUCTOS
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
