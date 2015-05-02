<%@include file="header.jsp" %>
    <h3>Usuarios</h3>
    <ul>
        <li>
            <a href="ControlTUsuarioRegistrar">Registrar Usuario</a>
        </li>
        <li>
            <a href="ControlTUsuarioMostrar">Mostrar Usuario</a>
        </li>
    </ul>
    <h3>Tipos de Usuario</h3>
    <ul>
        <li>
            <a href="ServletTipoUsuarioInsert">Registrar Tipo Usuario </a>
        </li>
        <li>
            <a href="ServletTipoUsuarioRead">Mostrar Tipos Usuario</a>
        </li>
    </ul>
    <br>
    <a href="Logout.jsp">Cerrar Sesion</a>

    <%@include file="footer.jsp" %>
