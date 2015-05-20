<%@include file="header.jsp" %>
<br><br> <br><br> 
        <% 
            if(request.getAttribute("resultado").equals("Correcto"))
            {
                %>
                <p>Operacion Correcta</p>
                <%
            }
            else
            {
                %>
                <p>Operacion Incorrecta</p>
                <%
            }
        %>
        <br><br>      
<%@include file="footer.jsp" %>
