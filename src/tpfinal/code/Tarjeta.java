package tpfinal.code;

import java.sql.Date;

public class Tarjeta {
	private Cliente id_cliente;
	private long numero_tarjeta; 
	private String titular; 
	private Date fecha_vencimiento;
	
	
	//constructor
	public Tarjeta(Cliente id_cliente, long numero_tarjeta, String titular, Date fecha_vencimiento) {
		this.id_cliente = id_cliente;
		this.numero_tarjeta = numero_tarjeta;
		this.titular = titular;
		this.fecha_vencimiento = fecha_vencimiento;	
	
	}

	
	public Tarjeta(Cliente id_cliente, long numero_tarjeta, String titular) {
		this.id_cliente = id_cliente;
		this.numero_tarjeta = numero_tarjeta;
		this.titular = titular;
	}


	public Tarjeta() {

	}

	//getters y setters

	public Cliente getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}


	public long getNumero_tarjeta() {
		return numero_tarjeta;
	}


	public void setNumero_tarjeta(long numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}


	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	
	
	
}
