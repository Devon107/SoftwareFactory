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
        <title>Modificar Usuario</title>
    </head>
    <body>
        <jsp:useBean id="negocioTUsuario" scope="request" class="Negocio.NegocioTUsuario" />
        <h1>Modificar Usuario</h1>
            <form action="ControlTUsuarioModificar" method="post">
            <label for="txtUsuario">Usuario</label>
            <input type="text" id="txtUsuario" name="txtUsuario" readonly="readonly" value="${negocioTUsuario.usuario.idUsuario}"><br>
            
            <label for="txtTipoUsuario">Tipo de Usuario</label>            
            <select id="cmbTipoUsuario" name="cmbTipoUsuario">
                <option value="GE001">Gestor de Proyectos</option>
            </select><br>
            
            <label for="txtNombre">Nombre</label>
            <input type="text" id="txtNombre" name="txtNombre" value="${negocioTUsuario.usuario.nombre}"><br>            
            
            <label for="txtApellido1">Apellido 1</label>
            <input type="text" id="txtApellido1" name="txtApellido1" value="${negocioTUsuario.usuario.apellido1}"><br>
            
            <label for="txtApellido2">Apellido 2</label>
            <input type="text" id="txtApellido2" name="txtApellido2" value="${negocioTUsuario.usuario.apellido2}"><br>
            
            <label for="txtCorreo">Correo Electronico</label>
            <input type="text" id="txtCorreo" name="txtCorreo" value="${negocioTUsuario.usuario.correoElectronico}"><br>
            
            <label for="txtTelefono">Telefono</label>
            <input type="text" id="txtTelefono" name="txtTelefono" value="${negocioTUsuario.usuario.telefono}"><br>
            
            <input type="submit" value="Actualizar Usuario">
        </form>
        <br><br>        
        <a href="Index.jsp">Regresar al Menu</a> 
    </body>
</html>
