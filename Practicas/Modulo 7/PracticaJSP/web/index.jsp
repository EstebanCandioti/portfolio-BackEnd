<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese la informacion del auto</h1>
        <form method="POST" action="SvAutos">
            <p>Ingrese la patente <input type="text" name="patente"></p>
            
            <p>Ingrese la marca <input type="text" name="marca"></p>
            
            <p>Ingrese el modelo <input type="text" name="modelo"></p>
            
            <p>Ingrese el color <input type="text" name="color"></p>
            
            <p>Ingrese el tipo de motor <input type="text" name="motor"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver todos los autos</h1>
        <form action="SvAutos" method="GET">
            <button>Ver Autos</button>           
        </form>

    </body>
</html>
