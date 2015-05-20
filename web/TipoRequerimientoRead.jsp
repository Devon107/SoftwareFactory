<%@include file="header.jsp" %>

        <jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />
        <h1>Lista de Tipo de Requerimiento</h1>
        <table border="1">
            <thead>
                <th>Id</th>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                
            <c:forEach var="item" items="${negociotiporequerimiento.listaTipoRequerimiento}">
                <tr>
                    <td>${item.getIdTipoRequerimiento()}</td>
                    <td>${item.getDescripcion()}</td>
                    <td><input id="${item.getIdTipoRequerimiento()}" type="button" value="Editar" onclick="editarTipoRequerimiento(this.id)"></td>
                    <td><input id="${item.getIdTipoRequerimiento()}" type="button" value="Eliminar" onclick="eliminarTipoRequerimiento(this.id)"></td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    <script>
        function editarTipoRequerimiento(id){
            window.location.href="ServletTipoRequerimientoUpdate?id="+id;
        }
        function eliminarTipoRequerimiento(id){
            window.location.href="ServletTipoRequerimientoDelete?id="+id;
        }
    </script>
    <%@include file="footer.jsp" %>
