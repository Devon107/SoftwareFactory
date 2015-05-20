<%@include file="header.jsp" %>
        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Editar Tipo Usuario</h1>
        <form action="ServletTipoUsuarioUpdate" method="post">
            <label for="txtIdTipoUsuario">ID Usuario</label>
            <input type="text" id="txtIdTipoUsuario" name="txtIdTipoUsuario" value="${negociotipousuario.tipousuario.idTipoUsuario}" readonly>
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" value="${negociotipousuario.tipousuario.descripcion}" pattern="^([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}\s){1,3}([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}){1}$" required>
            <input type="submit" value="Actualizar Tipo usuario"class="btn btn-primary" >
        </form>
            <br><br>
        <%@include file="footer.jsp" %>