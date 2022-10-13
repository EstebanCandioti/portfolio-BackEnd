<%-- 
    Document   : MostrarJSP
    Created on : 23 jul. 2022, 15:56:31
    Author     : esteban
--%>

<%@page import="Clases.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    
        <h1>Lista de Clientes</h1>
        <%
            List<Cliente> listaClientes= (List) request.getSession().getAttribute("listaClientes");
            int cont=1;
            for (Cliente cli: listaClientes){%>
            <p><b>Cliente Nro: <%=cont%></b></p>
            <p>Dni: <%=cli.getDni()%></p>
            <p>Nombre: <%=cli.getNombre()%></p>
            <p>Apellido: <%=cli.getApellido()%></p>
            <p>Telefono: <%=cli.getTelefono()%></p>
            
            <%cont=cont+1;%>
        <%}%>
        
    
</html>
