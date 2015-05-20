<%@include file="header.jsp" %>

        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Registrar Usuario</h1>
        
        <form action="ControlTUsuarioRegistrar" method="POST">
           <table>
	<tr>
		<td><label for="cmbTipoUsuario">Tipo de Usuario</label></td>
		<td><select id="cmbTipoUsuario" name="cmbTipoUsuario">
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <option value="${item.getIdTipoUsuario()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select></td>
	</tr>
	<tr>
		<td><label for="txtNombre">Nombre</label></td>
		<td><input type="text" id="txtNombre" name="txtNombre" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            </td>
	</tr>
	<tr>
		<td><label for="txtApellido1">Apellido 1</label></td>
		<td><input type="text" id="txtApellido1" name="txtApellido1" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            </td>
	</tr>
	<tr>
		<td><label for="txtApellido2">Apellido 2</label></td>
		<td><input type="text" id="txtApellido2" name="txtApellido2" pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            </td>
	</tr>
	<tr>
		<td><label for="txtCorreo">Correo Electronico</label></td>
		<td><input type="text" id="txtCorreo" name="txtCorreo" required pattern="^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$"><br>
            </td>
	</tr>
	<tr>
		<td><label for="txtTelefono">Telefono</label></td>
                <td><input type="text" id="txtTelefono" name="txtTelefono" onkeyup="mascara(this,'-',sep,true);" required pattern="^[0-9]{1,4}-[0-9]{1,4}" maxlength="9"><br>
            </td>
	</tr>
	<tr>
		<td><input type="submit" value="Registrar Usuario" class="btn btn-primary">
       </td>
	</tr>
</table></form>
<%@include file="footer.jsp" %>

