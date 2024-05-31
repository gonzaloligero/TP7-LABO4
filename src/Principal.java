
import dao.TipoSeguroDao;


public class Principal {

	public static void main(String[] args) {
		
		//SeguroDao sDao = new SeguroDao();
		TipoSeguroDao tsDao = new TipoSeguroDao();
		

		//System.out.println(sDao.obtenerUsuarios());
		System.out.println(tsDao.listarSeguros());
		
		//int f = sDao.agregarSeguro(new Seguro("Segupor por recursar", 3, 900, 1700));
	}

}
