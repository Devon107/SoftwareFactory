<%-- 
    Document   : Logout
    Created on : 04-20-2015, 01:11:38 AM
    Author     : Abinadi
--%>

<%
    response.setContentType("text/html");
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Cache-Control","no-store");
    response.setDateHeader("Expire",0);
    response.setHeader("Pragma","no-cache");
    
    request.getSession().removeAttribute("logueado");
    session.invalidate();
    response.sendRedirect("Login.jsp");
    %>
