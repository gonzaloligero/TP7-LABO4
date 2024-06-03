package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import dominio.Usuario;

public class UsuarioDao {

	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";
	
	
	public ArrayList<Usuario> obtenerUsuarios() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select nombreUsuario, pass, tipoUsuario, dni, nombre, apellido FROM usuarios");
			
			while(rs.next()){
				
				Usuario usuarioRs = new Usuario();
				usuarioRs.setNombreUsuario(rs.getString("nombreUsuario"));
				usuarioRs.setPass(rs.getString("pass"));
				usuarioRs.setTipoUsuario(rs.getInt("tipoUsuario"));
				usuarioRs.setDni(rs.getString("dni"));
				usuarioRs.setNombre(rs.getString("nombre"));
				usuarioRs.setApellido(rs.getString("apellido"));
				
				
				lista.add(usuarioRs);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}
	
	public int agregarUsuario(Usuario seg)
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
			String query = "Insert into usuarios (nombreUsuario, pass, tipoUsuario, dni, nombre, apellido) values('"   +seg.getNombreUsuario()+"','"+seg.getPass()+ "','"+seg.getTipoUsuario()+ "','"+seg.getDni()+ "','" + seg.getNombre() + "','" + seg.getApellido() +  "')";
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	
}