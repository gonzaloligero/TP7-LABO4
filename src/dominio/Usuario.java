package dominio;

public class Usuario {

	private String nombreUsuario;
	private String pass;
	private int tipoUsuario;
	private String dni;
	private String nombre;
	private String apellido;
	
	
	public Usuario(String nombreUsuario, String pass, int tipoUsuario, String dni, String nombre, String apellido) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.pass = pass;
		this.tipoUsuario = tipoUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Usuario() {
		this.nombreUsuario = "";
		this.pass = "";
		this.tipoUsuario = 0;
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public int getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
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


	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Usuario nombreUsuario=" + nombreUsuario + ", pass=" + pass + ", tipoUsuario=" + tipoUsuario + ", dni="
				+ dni + ", nombre=" + nombre + ", apellido=" + apellido  ;
	}
	
	
	
}

