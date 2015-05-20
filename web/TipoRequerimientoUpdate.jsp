<%@include file="header.jsp" %>
        <jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />
        <h1>Editar Tipo Requerimiento</h1>
        <form action="ServletTipoRequerimientoUpdate" method="post">
            <label for="txtIdTipoRequerimiento">ID Requerimiento</label>
            <input type="text" id="txtIdTipoRequerimiento" name="txtIdTipoRequerimiento" value="${negociotiporequerimiento.tiporequerimiento.idTipoRequerimiento}" readonly>
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" value="${negociotiporequerimiento.tiporequerimiento.descripcion}" pattern="^([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}\s){1,3}([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}){1}$" required>
            <input type="submit" value="Actualizar Tipo Requerimiento">
        </form>
            <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
        <%@include file="footer.jsp" %>