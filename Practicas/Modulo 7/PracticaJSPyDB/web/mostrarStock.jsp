<%@page import="logica.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Stock</title>
    </head>
    <body>
        
        <%
            List <Producto> listaStock = (List) request.getSession().getAttribute("listaStock");
            
            for (Producto prod: listaStock){
        %>
        <p><b>Producto:<%=prod.getNombre()%></b></p>
        <p><b>Precio de costo:<%=prod.getPrecioCosto()%></b></p>
        <p><b>Precio de venta:<%=prod.getPrecioVenta()%></b></p>
        <p>-----------------------------------</p>
        <%}%>
        
        
    </body>
</html>
