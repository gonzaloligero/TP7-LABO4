package Dao;

import java.awt.List;
import java.util.ArrayList;

import dominio.Seguro;

public interface ISeguroDao {

	public boolean insert(Seguro seguro);
	public boolean delete(Seguro seguro_a_eliminar);
	public boolean update(Seguro seguro_a_modificar);
	public ArrayList<Seguro> readALL();
	 
}

