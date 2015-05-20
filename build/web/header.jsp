<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
response.setHeader("Content-Type","text/html; charset=windows-1252");
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Cache-Control", "must-revalidate");
response.setHeader("Cache-Control","no-cache");
    
    HttpSession actual =request.getSession(true);
    String id = actual.getId();
    String nombre = (String)actual.getAttribute("Logueado");
    
    if(actual.isNew()){
        response.sendRedirect("Login.jsp");
        return;
    }
    
    if(actual == null)
    {
        response.sendRedirect("Login.jsp");
    }
    else
    {
        if(actual.getAttribute("Logueado")==null){
            response.sendRedirect("Login.jsp");
        }
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css" >
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" >
        <link rel="stylesheet" type="text/css" href="css/signin.css" >
        <!-- JS -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/validaciones.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="Index.jsp">Software Factory</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="Index.jsp">Inicio</a></li>
            <li><a href="Logout.jsp">Cerrar sesión</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
        <div class="container">