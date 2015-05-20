<%-- 
    Document   : RequerimientoResultado
    Created on : May 18, 2015, 5:00:03 PM
    Author     : reynaldoalfonso
--%>
<%@include file="header.jsp" %>
<br><br> <br><br> 

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
        <%@include file="footer.jsp" %>