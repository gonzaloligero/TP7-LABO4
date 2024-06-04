package servlets;

import java.io.IOException;
import java.util.ArrayList;

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
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int filas = 0;
		if(request.getParameter("btnAceptar")!= null)
		{
			Seguro s = new Seguro();
			s.setDescripcion(request.getParameter("txtDescripcion"));
            s.setIDTipo(Integer.parseInt(request.getParameter("tipoSeguro")));
            s.setCostoContratacion(Float.parseFloat(request.getParameter("txtCostoContratacion")));
            s.setCostoAsegurado(Float.parseFloat(request.getParameter("txtcostoMaximoAsegurado")));
			
			SeguroDao sDao = new SeguroDao();
			filas = sDao.agregarSeguro(s);
		}
		
		request.setAttribute("cantFilas", filas);
		RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");//Colocar el nombre del jsp
		rd.forward(request, response);
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	
    	
    	
    	
        SeguroDao seguroDao = new SeguroDao();
        ArrayList<Seguro> listaSeguros = seguroDao.obtenerSeguros();
        
        request.setAttribute("listaSeguros", listaSeguros);

        RequestDispatcher dispatcher = request.getRequestDispatcher("ListarSeguro.jsp");
        dispatcher.forward(request, response);
        
    }




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	
    	String descripcion = request.getParameter("txtDescripcion");
        int idTipo = Integer.parseInt(request.getParameter("tipoSeguro"));
        float costoContratacion = Float.parseFloat(request.getParameter("txtCostoContratacion"));
        float costoMaximoAsegurado = Float.parseFloat(request.getParameter("txtCostoMaximoAsegurado"));

        Seguro seguro = new Seguro();
        seguro.setDescripcion(descripcion);
        seguro.setIDTipo(idTipo);
        seguro.setCostoContratacion(costoContratacion);
        seguro.setCostoAsegurado(costoMaximoAsegurado);

        SeguroDao seguroDao = new SeguroDao();
        int result = seguroDao.agregarSeguro(seguro);
        
        if (result > 0) {
            
            response.sendRedirect("servletSeguro");
        } else {
            response.getWriter().write("Error al agregar el seguro");
        }
        
        
    }


}
