package dominio;

public class Contratacion {

	private static int IdContratacion = 0;
	private String NombreUsuario;
	private int IdSeguro;
	private float CostoContratacion;
	
	public Contratacion() {
		IdContratacion ++;
		NombreUsuario = "";
		IdSeguro = 0;
		CostoContratacion = 0;
	}

	public Contratacion (String nombreUsuario, int idSeguro, float costoContratacion) {
		IdContratacion ++;
		NombreUsuario = nombreUsuario;
		IdSeguro = idSeguro;
		CostoContratacion = costoContratacion;
	}
	
	public static int getIdContratacion() {
		return IdContratacion;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public int getIdSeguro() {
		return IdSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		IdSeguro = idSeguro;
	}

	public float getCostoContratacion() {
		return CostoContratacion;
	}

	public void setCostoContratacion(float costoContratacion) {
		CostoContratacion = costoContratacion;
	}
	
	@Override
	public String toString() {
		return "nombreUsuario: " + NombreUsuario + ",  IdSeguro: " + IdSeguro + ",  CostoContratacion: "+ CostoContratacion;
	}
	
}
