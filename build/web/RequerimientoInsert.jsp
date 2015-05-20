<%-- 
    Document   : RequerimientoInsert
    Created on : May 18, 2015, 2:38:08 PM
    Author     : reynaldoalfonso
--%>

<%@include file="header.jsp" %>
<jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />
<h1>Registrar Requerimientos</h1>
<form action="ServletRequerimientoInsert" method="post">
    <table>
	<tr>
		<td> <label for="txtNombre">Nombre</label></td>
		<td><input type="text" id="txtNombre" name="txtNombre" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
    </td>
	</tr>
	<tr>
		<td><label for="txtCosto">Costo</label></td>
		<td><input type="text" id="txtCosto" name="txtCosto" onkeypress="return NumCheck(event,this)" required ><br>
    </td>
	</tr>
	<tr>
		<td><label for="txtHorashombre">Horas Hombre</label></td>
		<td><input type="text" id="txtHorasHombre" name="txtHorasHombre" onkeypress="return NumCheck(event,this)" required><br>
   </td>
	</tr>
	<tr>
		<td><label>Descripci&oacute;n</label></td>
		<td><textarea style=" margin: 0px; height: 145px; width: 279px;" class="" name="txtDescripcion" id="txtDescripcion" rows="3" required></textarea><br>
   </td>
	</tr>
	<tr>
		<td><label for="cmbTipoRequerimiento">Tipo de Requerimiento</label></td>
		<td><select id="cmbTipoRequerimiento" name="cmbTipoRequerimiento">
            <c:forEach var="item" items="${negociotiporequerimiento.listaTipoRequerimiento}">
                <option value="${item.getIdTipoRequerimiento()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select></td>
	</tr>
	<tr>
		<td><input type="submit" value="Registrar Requerimiento" class="btn btn-primary"></td>	</tr>
</table>  
</form>
<%@include file="footer.jsp" %>
