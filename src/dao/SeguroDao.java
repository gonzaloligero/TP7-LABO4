package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.PreparedStatement;

import dominio.Seguro;

public class SeguroDao {

	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";
	
	
	public ArrayList<Seguro> obtenerSeguros() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Seguro> lista = new ArrayList<Seguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado FROM seguros");
			
			while(rs.next()){
				
				Seguro seguroRs = new Seguro();
				seguroRs.setIDSeguro(rs.getInt("idSeguro"));
				seguroRs.setDescripcion(rs.getString("descripcion"));
				seguroRs.setIDTipo(rs.getInt("idTipo"));
				seguroRs.setCostoContratacion(rs.getFloat("costoContratacion"));
				seguroRs.setCostoAsegurado(rs.getFloat("costoAsegurado"));
				
				
				lista.add(seguroRs);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}
	
	public int agregarSeguro(Seguro seg)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			String query = "Insert into seguros(descripcion,idTipo, costoContratacion, costoAsegurado) values('"   +seg.getDescripcion()+"','"+seg.getIDTipo()+ "','"+seg.getCostoContratacion()+ "','"+seg.getCostoAsegurado()+   "')";
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	public ArrayList<Seguro> obtenerSegurosPorTipo(int idTipo) {
        ArrayList<Seguro> lista = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(host + dbName, user, pass);
            String query = "SELECT idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado FROM seguros WHERE idTipo = ?";
            ps = (PreparedStatement) conn.prepareStatement(query);
            ps.setInt(1, idTipo);
            rs = ps.executeQuery();

            while (rs.next()) {
                Seguro seguro = new Seguro();
                seguro.setIDSeguro(rs.getInt("idSeguro"));
                seguro.setDescripcion(rs.getString("descripcion"));
                seguro.setIDTipo(rs.getInt("idTipo"));
                seguro.setCostoContratacion(rs.getFloat("costoContratacion"));
                seguro.setCostoAsegurado(rs.getFloat("costoAsegurado"));
                lista.add(seguro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (ps != null) ps.close(); } catch (Exception e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
        }

        return lista;
    }
	
	
}
