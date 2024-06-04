<%@page import="dao.TipoSeguroDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dominio.Seguro" %>
<%@ page import="dao.SeguroDao" %>
<%
    SeguroDao seguroDao = new SeguroDao();
    ArrayList<Seguro> listaSeguros = seguroDao.obtenerSeguros();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Seguros</title>
</head>
<body>

<a href="Inicio.jsp">Inicio</a>
<a href="AgregarSeguro.jsp" style="margin-left: 10px;">Agregar Seguro</a>
<a href="servletSeguro?action=list" style="margin-left: 10px;">Lista Seguros</a>

<h2>Lista de Seguros</h2>

<%
    if (listaSeguros != null && !listaSeguros.isEmpty()) {
%>


<table border="1">
    <tr>
        <th>ID Seguro</th>
        <th>Descripción</th>
        <th>ID Tipo</th>
        <th>Costo de Contratación</th>
        <th>Costo Asegurado</th>
    </tr>
<%
        for (Seguro seguro : listaSeguros) {
        	TipoSeguroDao ts = new TipoSeguroDao();
%>
    <tr>
        <td><%= seguro.getIDSeguro() %></td>
        <td><%= seguro.getDescripcion() %></td>
        <td><%= ts.obtenerDescripcion(seguro.getIDTipo()) %></td>
        <td><%= seguro.getCostoContratacion() %></td>
        <td><%= seguro.getCostoAsegurado() %></td>
    </tr>
<%
        }
    } else {
%>
    <tr>
        <td colspan="5">No se encontraron seguros.</td>
    </tr>
<%
    }
%>
</table>

</body>
</html>
