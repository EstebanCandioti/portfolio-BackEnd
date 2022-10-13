<%@page import="java.util.List"%>
<%@page import="Logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>
    <body>
        
        <h1> Lista de Personas</h1>
        
        <%
            List<Persona> listaPersonas= (List)request.getSession().getAttribute("listaPersonas");  
            
            for (Persona per: listaPersonas){
               
        %>
        <p><b>Dni: <%=per.getDni()%></b></p>
        <p><b>Nombre: <%=per.getNombre()%></b></p>
        <p><b>Apellido: <%=per.getApellido()%></b></p>
        <p><b>Telefono: <%=per.getTelefono()%></b></p>
        <p>---------------------------------------</p>
        <%}%>                    
    </body>
</html>
