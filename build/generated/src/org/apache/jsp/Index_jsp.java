package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" >\r\n");
      out.write("        <!-- JS -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/validaciones.js\"></script>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>");
      out.write("\r\n");
      out.write("    <h3>Usuarios</h3>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ControlTUsuarioRegistrar\">Registrar Usuario</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ControlTUsuarioMostrar\">Mostrar Usuario</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <h3>Tipos de Usuario</h3>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ServletTipoUsuarioInsert\">Registrar Tipo Usuario </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ServletTipoUsuarioRead\">Mostrar Tipos Usuario</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("        <h3>Tipos de Requerimiento</h3>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ServletTipoRequerimientoInsert\">Registrar Tipo Requerimiento </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ServletTipoRequerimientoRead\">Mostrar Tipos Requerimiento</a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <br>\r\n");
      out.write("    <a href=\"Logout.jsp\">Cerrar Sesion</a>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
