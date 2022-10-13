<%@page import="java.util.List"%>
<%@page import="Logica.Auto"%>
<%@page import="Logica.Auto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Autos</title>
    </head>
    <body>
        <%
            List <Auto> listaAutos = (List) request.getSession().getAttribute("listaAutos");
            
            for (Auto au: listaAutos){
        %>
        <p><b>Patente:<%=au.getPatente()%></b></p>
        <p><b>Marca:<%=au.getMarca()%></b></p>
        <p><b>Modelo:<%=au.getModelo()%></b></p>
        <p><b>Color:<%=au.getColor()%></b></p>
        <p><b>Motor:<%=au.getMotor()%></b></p>
        <p>-----------------------------------</p>
        <%}%>
        
    </body>
</html>
