package tpfinal.code;

public class Usuario {

	private int id_usuario;
	private String nombre; 
	private String apellido1;
	private String apellido2; 
	private String dni; 
	private String telefono;
	private String correo;
	private String password;
	private int rol;
	
	
	//constructor
	public Usuario(int id_usuario, String nombre, String apellido1, String apellido2, String dni, String telefono,
			String correo, String password, int rol) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
		this.rol = rol;
	}
	public Usuario() {
		
	}
	
	//getter y setter
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRol() {
		return rol;
	}
	public void setTipo(int rol) {
		this.rol = rol;
	}
	
	
	
	
	
}
