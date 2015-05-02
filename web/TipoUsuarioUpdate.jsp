<%@include file="header.jsp" %>
        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Editar Tipo Usuario</h1>
        <form action="ServletTipoUsuarioUpdate" method="post">
            <label for="txtIdTipoUsuario">ID Usuario</label>
            <input type="text" id="txtIdTipoUsuario" name="txtIdTipoUsuario" value="${negociotipousuario.tipousuario.idTipoUsuario}" readonly>
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" value="${negociotipousuario.tipousuario.descripcion}" pattern="^([A-Za-z������������]{3,}\s){1,3}([A-Za-z������������]{3,}){1}$" required>
            <input type="submit" value="Actualizar Tipo usuario">
        </form>
            <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
        <%@include file="footer.jsp" %>