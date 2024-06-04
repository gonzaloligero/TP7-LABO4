<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
<%@ page import="dominio.TipoSeguros" %>
<%@ page import="dao.TipoSeguroDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Seguro</title>
</head>
<body>

<a href="Inicio.jsp">Inicio</a>
<a href="AgregarSeguro.jsp" style="margin-left: 10px;">Agregar Seguro</a>
<a href="ListarSeguro.jsp" style="margin-left: 10px;">Lista Seguros</a>

    <h1>Agregar Seguros</h1>

   <form action="servletSeguro" method="get">
		<% 
		TipoSeguroDao tsDao = new TipoSeguroDao();
		int ultimoId = tsDao.obtenerUltimoId()+1; 
		%>

  Id Seguros <%=ultimoId %><br>
    
    
    Descripcion        <input type="text" name="txtDescripcion"> <br>
    Tipo de Seguros   <select name="tipoSeguro">
    <%
    List<TipoSeguros> listaSeguros = tsDao.listarSeguros();
	if(listaSeguros!=null)
    for (TipoSeguros seguro : listaSeguros) {
    %>
        <option value=<%= seguro.getIdTipo() %>><%= seguro.getDescripcion() %></option>
    <%
    }
    %>
</select><br>
    Costo contratacion <input type="text" name="txtCostoContratacion"> <br>
    Costo maximo asegurado    <input type="text" name="txtcostoMaximoAsegurado"> <br>
    <input type="submit" value="Aceptar" name="btnAceptar">
</form>

</body>
</html>