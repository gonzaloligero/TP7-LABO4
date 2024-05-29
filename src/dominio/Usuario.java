package dominio;

public class Usuario {
	
	private String NombreUsuario;
	private String Contraseña;
	private int TipoUsuario;
	private int Dni;
	private String Nombre;
	private String Apellido;
	
	public Usuario(String nombreUsuario, String contraseña, int tipoUsuario, int dni, String nombre, String apellido) {
		super();
		NombreUsuario = nombreUsuario;
		Contraseña = contraseña;
		TipoUsuario = tipoUsuario;
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public int getTipoUsuario() {
		return TipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}

	public int getDni() {
		return Dni;
	}

	public void setDni(int dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
	
	
	

}
