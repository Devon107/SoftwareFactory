<%-- 
    Document   : RequerimientoRead
    Created on : May 18, 2015, 5:02:35 PM
    Author     : reynaldoalfonso
--%>

<%@include file="header.jsp" %>
<jsp:useBean id="negociorequerimiento" scope="request" class="Negocio.NegocioRequerimiento" />
<h1>Listar Requerimientos</h1>
<table class="table">
    <thead>
        <th> Tipo Requerimiento</th>
        <th> Nombre</th>
        <th> Costo</th>
        <th> Horas Hombre</th>
        <th> Descripci&oacute;n</th>
        <th> Operaci&oacute;n</th>
    </thead>
    <tbody>
        <c:forEach var="item" items="${negociorequerimiento.listaRequerimiento}">
            <tr>
                <td>${item.getTiporequerimiento().getDescripcion()}</td>
                <td>${item.getNombre()}</td>
                <td>${item.getCosto()}</td>
                <td>${item.getHorasHombre()}</td>
                <td>${item.getDescripcion()}</td>
                <td><input id="${item.getIdRequerimiento()}" type="button" value="Editar" onclick="editarRequerimiento(this.id)"></td>
                <td><input id="${item.getIdRequerimiento()}" type="button" value="Eliminar" onclick="eliminarRequerimiento(this.id)"></td>
                
            </tr>
        </c:forEach>
    </tbody>
</table>
<br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
  <script>
        function editarRequerimiento(id){
            window.location.href="ServletRequerimientoUpdate?id="+id;
        }
        function eliminarRequerimiento(id){
            window.location.href="ServletRequerimientoDelete?id="+id;
        }
    </script>
   
<%@include file="footer.jsp" %>