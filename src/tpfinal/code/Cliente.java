package tpfinal.code;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
	private Usuario id_usuario;
	private int id_cliente;
	private Domicilio id_domicilio; 
	private Tarjeta	numero_tarjeta;
	private boolean realizo_compra;
	
//constructor
	public Cliente(Usuario id_usuario, int id_cliente, Domicilio id_domicilio, Tarjeta numero_tarjeta, boolean realizo_compra) {
		this.id_usuario = id_usuario;
		this.id_cliente = id_cliente;
		this.id_domicilio = id_domicilio;
		this.numero_tarjeta = numero_tarjeta;
		this.realizo_compra = realizo_compra;
	}


	public Cliente() {
	}

//getter y Setter
	
	public Usuario getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public Domicilio getId_domicilio() {
		return id_domicilio;
	}


	public void setId_domicilio(Domicilio id_domicilio) {
		this.id_domicilio = id_domicilio;
	}


	public Tarjeta getNumero_tarjeta() {
		return numero_tarjeta;
	}


	public void setNumero_tarjeta(Tarjeta numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	
	public boolean getRealizo_compra() {
		return realizo_compra;
	}


	public void setRealizo_compra(boolean realizo_compra) {
		this.realizo_compra = realizo_compra;
	}
	
	
	public void mostrarClientes(boolean realizo_compra) {
		
	}
	
	
}


