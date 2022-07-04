
public class Usuario {
	private int id_user;
	private String nombre;
	private String apellido;
	private String email;
	private int tipo;
	private boolean tieneTarjeta;
	public Usuario(int id_user, String nombre, String apellido, String email, int tipo, boolean tieneTarjeta) {

		this.id_user = id_user;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tipo = tipo;
		this.tieneTarjeta = tieneTarjeta;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean isTieneTarjeta() {
		return tieneTarjeta;
	}
	public void setTieneTarjeta(boolean tieneTarjeta) {
		this.tieneTarjeta = tieneTarjeta;
	}


}

