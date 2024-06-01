package dominio;

public class TipoSeguros {
	    private int idTipo;
	    private String descripcion;

	  
	    public TipoSeguros() {}

	    
	    public TipoSeguros(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    
	    public TipoSeguros(int idTipo, String descripcion) {
	        this.idTipo = idTipo;
	        this.descripcion = descripcion;
	    }

	    
	    
	    // Getters y Setters
	    public int getIdTipo() {
	        return idTipo;
	    }

	    public void setIdTipo(int idTipo) {
	        this.idTipo = idTipo;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }




	@Override
	public String toString() {
		return "TipoSeguros idTipos=" + idTipo + ", descripcion=" + descripcion + "\n";
	}
	
	
 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
