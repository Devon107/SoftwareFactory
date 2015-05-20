<%-- 
    Document   : RequerimientoResultado
    Created on : May 18, 2015, 5:00:03 PM
    Author     : reynaldoalfonso
--%>
<%@include file="header.jsp" %>


        <%
            if(request.getAttribute("Resultado").equals("Correcto"))
            {%>
            <p>Operacion Correcta</p>
            <%
            }else{ %>
            <p>Operacion Incorrecta</p>
            <%}
        %>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
        <%@include file="footer.jsp" %>