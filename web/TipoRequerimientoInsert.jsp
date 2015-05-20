<%@include file="header.jsp" %>

        <h1>Registrar Tipo Requerimiento</h1>
        <form action="ServletTipoRequerimientoInsert" method="post">            
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" required>
            
            <input type="submit" value="Ingresar Tipo Requerimiento">
        </form>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    </body>
</html>
<%@include file="footer.jsp" %>