<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <center>
        <h1>Inicio de Sesion</h1>
        <form action="ControlLogin" method="POST">
            <label for="txtUsuario">Usuario</label>
            <input type="text" id="txtUsuario" name="txtUsuario" ><br><br>
            
            <label for="txtContrasenia">Password</label>
            <input type="password" id="txtContrasenia" name="txtContrasenia"><br><br>
            
            <input type="submit" id="btnSubmit" value="Ingresar">
        </form>      
        
    </center>
    </body>
</html>
