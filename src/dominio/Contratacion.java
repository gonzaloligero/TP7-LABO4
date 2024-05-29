package dominio;

public class Contratacion {
	
	private int IDContratacion;
	private String NombreUsuario;
	private int IDSeguro;
	private float CostoContratacion;
	
	public Contratacion(int iDContratacion, String nombreUsuario, int iDSeguro, float costoContratacion) {
		IDContratacion = iDContratacion;
		NombreUsuario = nombreUsuario;
		IDSeguro = iDSeguro;
		CostoContratacion = costoContratacion;
	}
	
	public Contratacion() {
		this.IDContratacion = 0;
		this.NombreUsuario = "";
		this.IDSeguro = 0;
		this.CostoContratacion = 0;
	}

	public int getIDContratacion() {
		return IDContratacion;
	}

	public void setIDContratacion(int iDContratacion) {
		IDContratacion = iDContratacion;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public int getIDSeguro() {
		return IDSeguro;
	}

	public void setIDSeguro(int iDSeguro) {
		IDSeguro = iDSeguro;
	}

	public float getCostoContratacion() {
		return CostoContratacion;
	}

	public void setCostoContratacion(float costoContratacion) {
		CostoContratacion = costoContratacion;
	}

	@Override
	public String toString() {
		return "Contratacion [IDContratacion=" + IDContratacion + ", NombreUsuario=" + NombreUsuario + ", IDSeguro="
				+ IDSeguro + ", CostoContratacion=" + CostoContratacion + "]";
	}
	
	
	

}
