<%@include file="header.jsp" %>

        <jsp:useBean id="negocioTUsuario" scope="request" class="Negocio.NegocioTUsuario" />
        <div class="row">
            <h1 class="form-signin-heading" align="center" >Lista de Usuarios</h1>
        <div class="col-md-5">
        
        <table class="table table-striped">
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
                        <td><input id="${item.getIdUsuario()}" type="button" onclick="editarUsuario(this.id);" value="Editar" class="btn btn-primary"></td>
                        <td><input id="${item.getIdUsuario()}" type="button" onclick="eliminarUsuario(this.id);" value="Eliminar" class="btn btn-primary"></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            </div>
            </div>

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

    <%@include file="footer.jsp" %>
