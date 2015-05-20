<%@include file="header.jsp" %>

        <h1>Registrar Tipo Requerimiento</h1>
        <form action="ServletTipoRequerimientoInsert" method="post">            
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" required>
            
            <input type="submit" value="Ingresar Tipo Requerimiento" class="btn btn-primary">
        </form>
        <br><br>
    </body>
</html>
<%@include file="footer.jsp" %>