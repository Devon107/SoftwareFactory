<%-- 
    Document   : RequerimientoRead
    Created on : May 18, 2015, 5:02:35 PM
    Author     : reynaldoalfonso
--%>

<%@include file="header.jsp" %>
<jsp:useBean id="negociorequerimiento" scope="request" class="Negocio.NegocioRequerimiento" />
<div class="row">
            <h1 class="form-signin-heading" align="center" >Lista Requerimientos</h1>
        <div class="col-md-8">
        
        <table class="table table-striped">
    <thead>
        <th> Id</th>
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
                <td>${item.getIdRequerimiento()}</td>
                <td>${item.getTiporequerimiento().getIdTipoRequerimiento()}</td>
                <td>${item.getNombre()}</td>
                <td>${item.getCosto()}</td>
                <td>${item.getHorasHombre()}</td>
                <td>${item.getDescripcion()}</td>
                <td><input id="${item.getIdRequerimiento()}" type="button" value="Editar" onclick="editarRequerimiento(this.id)" class="btn btn-primary"></td>
                <td><input id="${item.getIdRequerimiento()}" type="button" value="Eliminar" onclick="eliminarRequerimiento(this.id)" class="btn btn-primary"></td>
                
            </tr>
        </c:forEach>
    </tbody>
</table>
            </div>
            </div>
  <script>
        function editarRequerimiento(id){
            window.location.href="ServletRequerimientoUpdate?id="+id;
        }
        function eliminarRequerimiento(id){
            window.location.href="ServletRequerimientoDelete?id="+id;
        }
    </script>
   
<%@include file="footer.jsp" %>