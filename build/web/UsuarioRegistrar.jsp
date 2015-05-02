<%@include file="header.jsp" %>

        <jsp:useBean id="negociotipousuario" scope="request" class="Negocio.NegocioTipoUsuario" />
        <h1>Registrar Usuario</h1>
        
        <form action="ControlTUsuarioRegistrar" method="POST">
           <label for="cmbTipoUsuario">Tipo de Usuario</label>            
            <select id="cmbTipoUsuario" name="cmbTipoUsuario">
            <c:forEach var="item" items="${negociotipousuario.listaTipoUsuario}">
                <option value="${item.getIdTipoUsuario()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select><br>
            <label for="txtNombre">Nombre</label>
            <input type="text" id="txtNombre" name="txtNombre" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            
            <label for="txtApellido1">Apellido 1</label>
            <input type="text" id="txtApellido1" name="txtApellido1" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            
            <label for="txtApellido2">Apellido 2</label>
            <input type="text" id="txtApellido2" name="txtApellido2" pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+"><br>
            
            <label for="txtCorreo">Correo Electronico</label>
            <input type="text" id="txtCorreo" name="txtCorreo" required pattern="^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$"><br>
            
            <label for="txtTelefono">Telefono</label>
            <input type="text" id="txtTelefono" name="txtTelefono" onkeyup="mascara(this,'-',sep,true);" required pattern="^[0-9]{1,4}-[0-9]{1,4}" maxlength="9"><br>
 
            <input type="submit" value="Registrar Usuario">
        
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a>
<%@include file="footer.jsp" %>

