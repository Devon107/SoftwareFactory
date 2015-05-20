<%-- 
    Document   : RequerimientoUpdate
    Created on : May 18, 2015, 7:04:04 PM
    Author     : reynaldoalfonso
--%>

<%@include file="header.jsp" %>

<h1>Actualizar Requerimiento</h1>
<jsp:useBean id="negociorequerimiento" scope="request" class="Negocio.NegocioRequerimiento" />
<jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />

<form action="ServletRequerimientoUpdate" method="post">
    <label for="txtIdRequerimiento">Id</label><br>
    <input type="text" name="txtIdRequerimiento" id="txtIdRequerimiento" readonly value="${negociorequerimiento.requerimiento.idRequerimiento}">
    <label for="txtNombre">Nombre</label>
    <input type="text" id="txtNombre" name="txtNombre" required pattern="^[a-zA-ZáéíóúñÑÁÉÍÓÚ]+" value="${negociorequerimiento.requerimiento.nombre}"><br>
    <label for="txtCosto">Costo</label>
    <input type="textCost" id="txtCosto" name="txtCosto" onkeypress="return NumCheck(event,this)" required value="${negociorequerimiento.requerimiento.costo}"><br>
    <label for="txtHorashombre">Horas Hombre</label>
    <input type="text" id="txtHorasHombre" name="txtHorasHombre" onkeypress="return NumCheck(event,this)" required value="${negociorequerimiento.requerimiento.horasHombre}"><br>
    <label>Descripci&oacute;n</label>
    <textarea class="" name="txtDescripcion" id="txtDescripcion" rows="3" required >${negociorequerimiento.requerimiento.descripcion}</textarea><br>
    <label for="cmbTipoUsuario">Tipo de Usuario</label>            
     <label for="cmbTipoRequerimiento">Tipo de Requerimiento</label>            
            <select id="cmbTipoRequerimiento" name="cmbTipoRequerimiento">
            <c:forEach var="item" items="${negociotiporequerimiento.listaTipoRequerimiento}">
                <option value="${item.getIdTipoRequerimiento()}">${item.getDescripcion()}</option>
            </c:forEach>
                </select><br>
    <input type="submit" value="Actualizar Requerimiento"> 
        
</form>
       
<%@include file="footer.jsp" %>