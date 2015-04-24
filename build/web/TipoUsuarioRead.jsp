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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Lista de Tipo de Usuario</h1>
        <table border="1">
            <thead>
                <th>Id</th>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <tr>
                    <td>${item.getIdTipoUsuario()}</td>
                    <td>${item.getDescripcion()}</td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Editar" onclick="editarTipoUsuario(this.id)"></td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Eliminar" onclick="eliminarTipoUsuario(this.id)"></td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    </body>
    <script>
        function editarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioUpdate?id="+id;
        }
        function eliminarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioDelete?id="+id;
        }
    </script>
</html>
