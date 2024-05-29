package dominio;

public class Usuario {
	
	private String NombreUsuario;
	private String Contrase�a;
	private int TipoUsuario;
	private int Dni;
	private String Nombre;
	private String Apellido;
	
	public Usuario(String nombreUsuario, String contrase�a, int tipoUsuario, int dni, String nombre, String apellido) {
		super();
		NombreUsuario = nombreUsuario;
		Contrase�a = contrase�a;
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

	public String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
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
