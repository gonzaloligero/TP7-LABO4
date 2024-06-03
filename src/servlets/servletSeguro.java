package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SeguroDao;
import dominio.Seguro;


@WebServlet("/servletSeguro")
public class servletSeguro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servletSeguro() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int filas = 0;
		if(request.getParameter("btnAceptar")!= null)
		{
			Seguro s = new Seguro();
			s.setDescripcion(request.getParameter("txtDescripcion"));
			s.setCostoContratacion(Float.parseFloat(request.getParameter("txtCostoContratacion")));
			s.setCostoAsegurado(Float.parseFloat(request.getParameter("txtCostoAsegurado")));
			
			SeguroDao sDao = new SeguroDao();
			filas = sDao.agregarSeguro(s);
		}
		
		request.setAttribute("cantFilas", filas);
		RequestDispatcher rd = request.getRequestDispatcher(" ");//Colocar el nombre del jsp
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
