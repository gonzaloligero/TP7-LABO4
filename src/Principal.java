import dao.ContratacionDao;

import dominio.Contratacion;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SeguroDao sDao = new SeguroDao();
		//TipoSeguroDao tsDao = new TipoSeguroDao();
		ContratacionDao tsDao2 = new ContratacionDao();
		Contratacion c = new Contratacion();
		c.setNombreUsuario("Gaston");
		c.setIdSeguro(1);
		c.setCostoContratacion(2950);
		tsDao2.agregarContratacion(c);
		//System.out.println(sDao.obtenerUsuarios());
		//System.out.println(tsDao.listarSeguros());
		System.out.println(tsDao2.listarContratacion());
		System.out.println("Test");
		
		//int f = sDao.agregarSeguro(new Seguro("Segupor por recursar", 3, 900, 1700));
	}

}
