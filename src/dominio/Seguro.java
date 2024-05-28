package dominio;

public class Seguro {
	
	private static int IDSeguro = 0;
	private String Descripcion;
	private int IDTipo;
	private float CostoContratacion;
	private float CostoAsegurado;
	
	public Seguro(String descripcion, int iDTipo, float costoContratacion, float costoAsegurado) {
		IDSeguro++;
		Descripcion = descripcion;
		IDTipo = iDTipo;
		CostoContratacion = costoContratacion;
		CostoAsegurado = costoAsegurado;
	}
	
	public Seguro() {
		IDSeguro++;
		this.Descripcion = "";
		this.IDTipo = 0;
		this.CostoContratacion = 0;
		this.CostoAsegurado = 0;
	}

	public static int getIDSeguro() {
		return IDSeguro;
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
		return "Seguro [Descripcion=" + Descripcion + ", IDTipo=" + IDTipo + ", CostoContratacion=" + CostoContratacion
				+ ", CostoAsegurado=" + CostoAsegurado + "]";
	}
	
	
	

}
