package dominio;

public class TipoSeguro {

	private int IDTipo;
	private String Descripcion;
	
	public TipoSeguro(int iDTipo, String descripcion) {
		IDTipo = iDTipo;
		Descripcion = descripcion;
	}
	
	public TipoSeguro() {
		this.IDTipo = 0;
		this.Descripcion = "";
	}

	public int getIDTipo() {
		return IDTipo;
	}

	public void setIDTipo(int iDTipo) {
		IDTipo = iDTipo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoSeguro [IDTipo=" + IDTipo + ", Descripcion=" + Descripcion + "]";
	}
	
	
	
}
