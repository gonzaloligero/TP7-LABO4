import dao.SeguroDao;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeguroDao sDao = new SeguroDao();
		
		System.out.println(sDao.obtenerUsuarios());
		
		//int f = sDao.agregarSeguro(new Seguro("Segupor por recursar", 3, 900, 1700));
	}

}
