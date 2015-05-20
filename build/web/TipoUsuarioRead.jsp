<%@include file="header.jsp" %>

        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Lista de Tipo de Usuario</h1>
        <table class="table">
            <thead>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <tr>
                    <td>${item.getDescripcion()}</td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Editar" onclick="editarTipoUsuario(this.id)"></td>
                    <td><input id="${item.getIdTipoUsuario()}" type="button" value="Eliminar" onclick="eliminarTipoUsuario(this.id)"></td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    <script>
        function editarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioUpdate?id="+id;
        }
        function eliminarTipoUsuario(id){
            window.location.href="ServletTipoUsuarioDelete?id="+id;
        }
    </script>
    <%@include file="footer.jsp" %>
