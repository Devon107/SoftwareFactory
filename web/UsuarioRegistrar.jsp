<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
response.setHeader("Content-Type","text/html; charset=windows-1252");
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Cache-Control", "must-revalidate");
response.setHeader("Cache-Control","no-cache");
    
    HttpSession actual =request.getSession(true);
    String id = actual.getId();
    String nombre = (String)actual.getAttribute("Logueado");
    
    if(actual.isNew()){
        response.sendRedirect("Login.jsp");
        return;
    }
    
    if(actual == null)
    {
        response.sendRedirect("Login.jsp");
    }
    else
    {
        if(actual.getAttribute("Logueado")==null){
            response.sendRedirect("Login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body>
        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Registrar Usuario</h1>
        
        <form action="ControlTUsuarioRegistrar" method="POST">
            
            <label for="cmbTipoUsuario">Tipo de Usuario</label>            
            <select id="cmbTipoUsuario" name="cmbTipoUsuario">
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <option value="${item.getIdTipoUsuario()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select><br>
            <label for="txtNombre">Nombre</label>
            <input type="text" id="txtNombre" name="txtNombre"><br>
            
            <label for="txtApellido1">Apellido 1</label>
            <input type="text" id="txtApellido1" name="txtApellido1"><br>
            
            <label for="txtApellido2">Apellido 2</label>
            <input type="text" id="txtApellido2" name="txtApellido2"><br>
            
            <label for="txtCorreo">Correo Electronico</label>
            <input type="text" id="txtCorreo" name="txtCorreo"><br>
            
            <label for="txtTelefono">Telefono</label>
            <input type="text" id="txtTelefono" name="txtTelefono"><br>
            
            <input type="submit" value="Registrar Usuario">
        </form>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a>
    </body>
</html>
