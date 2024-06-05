<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="dominio.TipoSeguros" %>
<%@ page import="dao.TipoSeguroDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Seguro</title>
<style>
    .estilo_lbl{
        display: inline-block;
        width: 170px;
        margin-bottom: 5px;
    }
</style>
</head>
<body>

   <a href="Inicio.jsp">Inicio</a>
   <a href="AgregarSeguro.jsp" style="margin-left: 10px;">Agregar Seguro</a>
   <a href="ListarSeguro.jsp" style="margin-left: 10px;">Lista Seguros</a>

   <h1>Agregar Seguros</h1>

   <form action="servletSeguro" method="post">
        <%     
         TipoSeguroDao tsDao = new TipoSeguroDao();
         int ultimoId = tsDao.obtenerUltimoId() + 1; 
        %>

        <label class="estilo_lbl">Id Seguros:</label> <%= ultimoId %><br>   
        <label class="estilo_lbl">Descripción:</label> <input type="text" name="txtDescripcion"><br>
        <label class="estilo_lbl">Tipo de seguro:</label> 
        <select name="tipoSeguro">
            <% 
            List<TipoSeguros> listaSeguros = tsDao.listarSeguros();
            if (listaSeguros != null) {
                for (TipoSeguros seguro : listaSeguros) {
            %>
            <option value="<%= seguro.getIdTipo() %>"><%= seguro.getDescripcion() %></option>
            <% 
                }
            }
            %>      
        </select><br>
        <label class="estilo_lbl">Costo de contratación:</label> <input type="text" name="txtCostoContratacion"><br>
        <label class="estilo_lbl">Costo máximo asegurado:</label> <input type="text" name="txtcostoMaximoAsegurado"><br>
       
        <input type="submit" value="Aceptar" name="btnAceptar" style="margin-left: 174px;">

   </form>

   <% if (Boolean.TRUE.equals(request.getAttribute("aviso"))) { %>  
        <p>ERROR - Campos Obligatorios</p>    
    <% } %>
    
    <% if (request.getAttribute("aviso2") != null && (int) request.getAttribute("aviso2") == 1) { %>      
        <p>ERROR - Monto incorrecto</p>     
    <% } %>
    
</body>
</html>
