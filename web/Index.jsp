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
        <h3>Tipos de Requerimiento</h3>
    <ul>
        <li>
            <a href="ServletTipoRequerimientoInsert">Registrar Tipo Requerimiento </a>
        </li>
        <li>
            <a href="ServletTipoRequerimientoRead">Mostrar Tipos Requerimiento</a>
        </li>
    </ul>
        <h3>Requerimiento</h3>
    <ul>
        <li>
            <a href="ServletRequerimientoInsert">Registrar Requerimiento </a>
        </li>
        <li>
            <a href="ServletRequerimientoRead">Mostrar Requerimientos</a>
        </li>
    </ul>
        <h3>Sistemas</h3>
    <ul>
        <li>
            <a href="ServletSistemaMenuInsert">Registrar Sistema </a>
        </li>
    </ul>
    <br>
    <a href="Logout.jsp">Cerrar Sesion</a>

    <%@include file="footer.jsp" %>
