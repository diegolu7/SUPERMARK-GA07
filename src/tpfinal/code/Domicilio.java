package tpfinal.code;

public class Domicilio {
	private int id_domicilio;
	private int id_cliente; 
	private String calle;
	private int numero;
	
//constructor
	public Domicilio(int id_domicilio, int id_cliente, String calle, int numero) {
		this.id_domicilio = id_domicilio;
		this.id_cliente = id_cliente;
		this.calle = calle;
		this.numero = numero;
	}
	
	public Domicilio() {
		
	}

//getters y setters
	public int getId_domicilio() {
		return id_domicilio;
	}

	public void setId_domicilio(int id_domicilio) {
		this.id_domicilio = id_domicilio;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	
}
