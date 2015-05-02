<%@include file="header.jsp" %>

        <h1>Registrar Tipo Usuario</h1>
        <form action="ServletTipoUsuarioInsert" method="post">            
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion" pattern="^([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}\s){1,3}([A-Za-zñÑáéíóúÁÉÍÓÚ]{3,}){1}$" required>
            
            <input type="submit" value="Ingresar Tipo Usuario">
        </form>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    </body>
</html>
<%@include file="footer.jsp" %>
