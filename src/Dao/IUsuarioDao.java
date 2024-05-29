package Dao;

import java.util.ArrayList;

import dominio.Usuario;



public interface IUsuarioDao {

	public boolean insert(Usuario usuario);
	public boolean delete(Usuario usuario_a_eliminar);
	public boolean update(Usuario usuario_a_modificar);
	public ArrayList<Usuario> readALL();
}
