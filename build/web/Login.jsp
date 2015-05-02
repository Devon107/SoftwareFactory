<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" >
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" >
        <!-- JS -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validaciones.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Inicio de Sesion</h1>
        <form action="ControlLogin" method="POST">
            <label for="txtUsuario">Usuario</label>
            <input type="text" id="txtUsuario" name="txtUsuario" required><br><br>
            
            <label for="txtContrasenia">Password</label>
            <input type="password" id="txtContrasenia" name="txtContrasenia" required><br><br>
            
            <input type="submit" id="btnSubmit" value="Ingresar" class="btn btn-default">
        </form>      
        
    </center>
<%@include file="footer.jsp" %>
