<%@include file="header.jsp" %>

        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <div class="row">
            <h1 class="form-signin-heading" align="center">Lista de Tipo de Usuario</h1>
        <div class="col-md-8">
        
        <table class="table table-striped">
            <thead>
                <th>Id</th>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <tr>
                    <td >${item.getIdTipoUsuario()}</td>
                    <td >${item.getDescripcion()}</td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Editar" onclick="editarTipoUsuario(this.id)" class="btn btn-primary"></td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Eliminar" onclick="eliminarTipoUsuario(this.id)" class="btn btn-primary"></td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>
        </div>
        </div>
    <script>
        function editarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioUpdate?id="+id;
        }
        function eliminarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioDelete?id="+id;
        }
    </script>
    <%@include file="footer.jsp" %>
