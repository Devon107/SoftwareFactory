<%@include file="header.jsp" %>
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
        <a href="Index.jsp">Regresar al Menu</a>        
<%@include file="footer.jsp" %>
