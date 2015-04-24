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
        <jsp:useBean id="negocioTUsuario" scope="request" class="Negocio.NegocioTUsuario" />
        <h1>Lista de Usuarios</h1>
        <table border="1">
            <thead>
                <th>Usuario</th>                
                <th>Nombre</th>
                <th>Apellido 1</th>
                <th>Apellido 2</th>
                <th>Tipo de Usuario</th>
                <th>Correo Electronico</th>
                <th>Telefono</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                <c:forEach var="item" items="${negocioTUsuario.listaUsuario}">
                    <tr>
                        <td>${item.getIdUsuario()}</td>
                        <td>${item.getNombre()}</td>
                        <td>${item.getApellido1()}</td>
                        <td>${item.getApellido2()}</td>
                        <td>${item.getTipousuario().getIdTipoUsuario()}</td>
                        <td>${item.getCorreoElectronico()}</td>
                        <td>${item.getTelefono()}</td>
                        <td><input id="${item.getIdUsuario()}" type="button" onclick="editarUsuario(this.id);" value="Editar"></td>
                        <td><input id="${item.getIdUsuario()}" type="button" onclick="eliminarUsuario(this.id);" value="Eliminar"></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a>
    </body>
    <script>
        function editarUsuario(id)
        {
            window.location.href="ControlTUsuarioModificar?id="+id;
        }
        
        function eliminarUsuario(id)
        {
            window.location.href="ControlTUsuarioEliminar?id="+id;
        }
    </script>
</html>
