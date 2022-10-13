<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stock</title>
    </head>
    <body>
        <h1>Ingrese los datos del producto que quiere dar de alta</h1>
        <form action="SvStock" method="POST">
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Precio de costo: </label><input type="text" name="costo"></p>
            <p><label>Precio de venta: </label><input type="text" name="venta"></p>
            <button type="sumbit">Enviar</button>
        </form>
        
        <h1>Ver lista de stock</h1>
        <form action="SvStock" method="GET">
            <button type="sumbit">Mostrar</button>
        </form>
    </body>
</html>
