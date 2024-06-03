package dominio;

public class Seguro {
	
	private int IDSeguro;
	private String Descripcion;
	private int IDTipo;
	private float CostoContratacion;
	private float CostoAsegurado;
	
	public Seguro() {
	
	}

	public Seguro(int iDSeguro, String descripcion, int iDTipo, float costoContratacion, float costoAsegurado) {
		
		IDSeguro = iDSeguro;
		Descripcion = descripcion;
		IDTipo = iDTipo;
		CostoContratacion = costoContratacion;
		CostoAsegurado = costoAsegurado;
	}

	
	public Seguro(String descripcion, int iDTipo, float costoContratacion, float costoAsegurado) {
		
		Descripcion = descripcion;
		IDTipo = iDTipo;
		CostoContratacion = costoContratacion;
		CostoAsegurado = costoAsegurado;
	}
	
	
	public int getIDSeguro() {
		return IDSeguro;
	}

	public void setIDSeguro(int iDSeguro) {
		IDSeguro = iDSeguro;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getIDTipo() {
		return IDTipo;
	}

	public void setIDTipo(int iDTipo) {
		IDTipo = iDTipo;
	}

	public float getCostoContratacion() {
		return CostoContratacion;
	}

	public void setCostoContratacion(float costoContratacion) {
		CostoContratacion = costoContratacion;
	}

	public float getCostoAsegurado() {
		return CostoAsegurado;
	}

	public void setCostoAsegurado(float costoAsegurado) {
		CostoAsegurado = costoAsegurado;
	}

	@Override
	public String toString() {
		return IDSeguro + ", " + Descripcion + ", " + IDTipo + ", " + CostoContratacion + ", " + CostoAsegurado + "\n";
	}


}
