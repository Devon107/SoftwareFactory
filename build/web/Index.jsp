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
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Usuarios</h3>
        <ul>
            <li>
                <a href="ControlTUsuarioRegistrar">Registrar Usuario</a>
            </li>
            <li>
                <a href="ControlTUsuarioMostrar">Mostrar Usuario</a>
            </li>
        </ul>
        <h3>Tipos de Usuario</h3>
        <ul>
            <li>
                <a href="ServletTipoUsuarioInsert">Registrar Tipo Usuario </a>
            </li>
            <li>
                <a href="ServletTipoUsuarioRead">Mostrar Tipos Usuario</a>
            </li>
        </ul>
        <br>
        <a href="Logout.jsp">Cerrar Sesion</a>
    </body>
</html>
