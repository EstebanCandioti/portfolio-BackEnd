<%-- 
    Document   : index
    Created on : 23 jul. 2022, 16:23:45
    Author     : esteban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Datos del cliente</h1>
        <form action="SvPersona" method="POST">
            <p><label>Dni: </label><input type="text" name="dni"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type="sumbir">Enviar</button>
        </form>
        
        <h1>Ver lista clientes</h1>
        <p>Si desea ver todos los clientes haga click en el boton mostrar clientes</p>
        <form action="SvPersona" method="GET">
            <button type="submit">Mostrar clientes</button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <p>Ingrese el Id de la persona a eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id:</label><input type="text" name="id_eliminar"></p>
            <button type="sumbit">Eliminar</button>
        </form>
        
        <h1>Modificar Personas</h1>
        <p>Ingrese el Id de la persona que quiere modificar</p>
        <form action="SvModificar" method="GET">
            <p><label>Id:</label><input type="text" name="id_modificar"></p>
            <button type="sumbit">Modificar</button>
        </form>
    </body>
</html>
