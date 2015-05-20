<%-- 
    Document   : SistemaMenuInsert
    Created on : 05-20-2015, 03:45:02 AM
    Author     : Montano
--%>

<%@include file="header.jsp" %>
<jsp:useBean id="negocioRequerimiento" scope="request" class="Negocio.NegocioRequerimiento" />
<h1>Listar Requerimientos</h1>
<table class="table">
    <thead>
        <th> Tipo Requerimiento</th>
        <th> Nombre</th>
        <th> Costo</th>
        <th> Horas Hombre</th>
        <th> Acci&oacute;n</th>
    </thead>
    <tbody>
        <c:forEach var="item" items="${negocioRequerimiento.listaRequerimiento}">
            <tr>
                <td>${item.getNombre()}</td>
                <td>${item.getCosto()}</td>
                <td>${item.getHorasHombre()}</td>
                <td>${item.getDescripcion()}</td>
                <td><input id="${item.getIdRequerimiento()}" type="button" value="Agregar" onclick="agregarRequerimiento(this.id)"></td>                
            </tr>
        </c:forEach>
    </tbody>
</table>
<br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
  <script>
        function agregarRequerimiento(id){
            window.location.href="ServletRequerimientoUpdate?id="+id;
        }
    </script>
   
<%@include file="footer.jsp" %>