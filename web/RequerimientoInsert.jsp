<%-- 
    Document   : RequerimientoInsert
    Created on : May 18, 2015, 2:38:08 PM
    Author     : reynaldoalfonso
--%>

<%@include file="header.jsp" %>
<jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />
<h1>Registrar Requerimientos</h1>
<form action="ServletRequerimientoInsert" method="post">
    <label for="txtNombre">Nombre</label>
    <input type="text" id="txtNombre" name="txtNombre" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
    <label for="txtCosto">Costo</label>
    <input type="textCost" id="txtCosto" name="txtCosto" onkeypress="return NumCheck(event,this)" required ><br>
    <label for="txtHorashombre">Horas Hombre</label>
    <input type="text" id="txtHorasHombre" name="txtHorasHombre" onkeypress="return NumCheck(event,this)" required><br>
    <label>Descripci&oacute;n</label>
     <textarea class="" name="txtDescripcion" id="txtDescripcion" rows="3" required></textarea><br>
   
    <label for="cmbTipoRequerimiento">Tipo de Requerimiento</label>            
            <select id="cmbTipoRequerimiento" name="cmbTipoRequerimiento">
            <c:forEach var="item" items="${negociotiporequerimiento.listaTipoRequerimiento}">
                <option value="${item.getIdTipoRequerimiento()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select><br>
    <input type="submit" value="Registrar Requerimiento">    
        
</form>
<%@include file="footer.jsp" %>
