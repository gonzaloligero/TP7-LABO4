package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import dominio.TipoSeguros;

public class TipoSeguroDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";
	
	public ArrayList<TipoSeguros> listarSeguros(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		ArrayList<TipoSeguros> lista = new ArrayList<TipoSeguros>();
		Connection conn = null;
	
		
		try {
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM segurosgroup.tiposeguros;");
			
		
		  while (rs.next()) {
			  TipoSeguros tipoSeguro = new TipoSeguros();
              tipoSeguro.setIdTipo(rs.getInt("idTipo")); 
              tipoSeguro.setDescripcion(rs.getString("descripcion")); 
              lista.add(tipoSeguro);
          }

      } catch (Exception e) {
          e.printStackTrace();
      }finally {
    	  
      }

      return lista;
		
	}
	public int obtenerUltimoId() {
        int ultimoId = 0; 

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(host + dbName, user, pass);
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT MAX(idSeguro)as maxId FROM seguros;");

            if (rs.next()) {
                ultimoId = rs.getInt("maxId");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }

        return ultimoId;
    }
	
	
    public String obtenerDescripcion(int id) {
        String descripcion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(host + dbName, user, pass);
            Statement st = conn.createStatement();

            String query = "SELECT descripcion FROM tiposeguros WHERE idTipo = " + id + ";";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                descripcion = rs.getString("descripcion");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }

        return descripcion;
    }
	
	
}

