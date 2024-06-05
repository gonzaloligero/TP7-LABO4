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
     
    	
    	// Aquí puedes manejar otras acciones que no sean guardar
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	int filas = 0;
        boolean aviso = false;
        int aviso2 =  0;

        if (request.getParameter("btnAceptar") != null) {
        	 
               Seguro s = new Seguro();
               String descripcion = request.getParameter("txtDescripcion");
               if (descripcion == null || descripcion.trim().isEmpty()) {
            	   aviso = true;
            	   request.setAttribute("aviso", aviso);
                   RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                   rd.forward(request, response);
                   return ;
               } else {
                   s.setDescripcion(descripcion);
                 }

            
               String tipoSeguroStr = request.getParameter("tipoSeguro");
               if (tipoSeguroStr == null || tipoSeguroStr.trim().isEmpty()) {
              	   aviso = true;
            	   request.setAttribute("aviso", aviso);
                   RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                   rd.forward(request, response);
                   return;
               } else {
                      try {
                          int tipoSeguro = Integer.parseInt(tipoSeguroStr);
                          s.setIDTipo(tipoSeguro);
                      } catch (NumberFormatException e) {
                          aviso = true;
                	      request.setAttribute("aviso", aviso);
                          RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                          rd.forward(request, response);
                          return;
                        }
                 }

            
               String costoContratacionStr = request.getParameter("txtCostoContratacion");
               if (costoContratacionStr == null || costoContratacionStr.trim().isEmpty()) {
            	   aviso = true;
            	   request.setAttribute("aviso", aviso);
                   RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                   rd.forward(request, response);
                   return;
               } else {
                      try {
                	      float costoContratacion = Float.parseFloat(costoContratacionStr);               	
                          if (costoContratacion < 0) {                  	
                    	     aviso2 = 1;                  	
                             request.setAttribute("aviso2", aviso2);
                             RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                             rd.forward(request, response);
                             return;
                          } else { 
                    	
                               s.setCostoContratacion(costoContratacion);
                       
                            }
                      } catch (NumberFormatException e) {
                	       aviso = true;
                	       request.setAttribute("aviso", aviso);
                           RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                           rd.forward(request, response);
                           return;
                        }
                 }

            
               String costoAseguradoStr = request.getParameter("txtcostoMaximoAsegurado");
               if (costoAseguradoStr == null || costoAseguradoStr.trim().isEmpty()) {
            	   aviso = true;
            	   request.setAttribute("aviso", aviso);
                   RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                   rd.forward(request, response);
                   return;
               } else {
                       try {
                	
                	         float costoAsegurado = Float.parseFloat(costoAseguradoStr);               
                             if (costoAsegurado < 0) {
                    	        aviso2 = 1;
                                request.setAttribute("aviso2", aviso2);
                                RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                                rd.forward(request, response);
                                return;
                             } else { 
                    	
                    	           s.setCostoAsegurado(costoAsegurado);
                       
                             }             	       
                   
                       } catch (NumberFormatException e) {
                	       aviso = true;
                	       request.setAttribute("aviso", aviso);
                           RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
                           rd.forward(request, response);
                           return;
                         }
                 }
     
               SeguroDao sDao = new SeguroDao();
               filas = sDao.agregarSeguro(s);
               request.setAttribute("cantFilas", filas);
               RequestDispatcher rd = request.getRequestDispatcher("AgregarSeguro.jsp");
               rd.forward(request, response);
               
        }
        	
        
        
        
        if (request.getParameter("btnFiltrar") != null) {
        	
            int idTipo = Integer.parseInt(request.getParameter("tipoSeguro"));
            SeguroDao seguroDao = new SeguroDao();
            ArrayList<Seguro> listaSeguros = seguroDao.obtenerSegurosPorTipo(idTipo);
            request.setAttribute("listaS", listaSeguros);
            RequestDispatcher dispatcher = request.getRequestDispatcher("ListarSeguro.jsp");
            dispatcher.forward(request, response);
        }
        
    }
}
