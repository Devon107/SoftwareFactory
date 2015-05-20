<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" >
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" >
        <link rel="stylesheet" type="text/css" href="css/signin.css">
        <!-- JS -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validaciones.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <form action="ControlLogin" method="POST" class="form-signin">
             <h2 class="form-signin-heading">Inicio de Sesion</h2>
            <label for="txtUsuario">Usuario</label>
            <input type="text" id="txtUsuario" name="txtUsuario" class="form-control" placeholder="Usuario" required>
            
            <label for="txtContrasenia">Password</label>
            <input type="password" id="txtContrasenia" class="form-control" name="txtContrasenia" placeholder="Contraseña" required>
            
            <input class="btn btn-lg btn-primary btn-block" type="submit" id="btnSubmit" value="Ingresar">
        </form>    
        </div>
<%@include file="footer.jsp" %>
