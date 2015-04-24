package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UsuarioRegistrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script src=\"validaciones\" type=\"text/javascript\"></script>\r\n");
      out.write("        <title>Registrar Usuario</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      Negocio.NegocioTipoUsuario negociotipousuario = null;
      synchronized (request) {
        negociotipousuario = (Negocio.NegocioTipoUsuario) _jspx_page_context.getAttribute("negociotipousuario", PageContext.REQUEST_SCOPE);
        if (negociotipousuario == null){
          negociotipousuario = new Negocio.NegocioTipoUsuario();
          _jspx_page_context.setAttribute("negociotipousuario", negociotipousuario, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        <h1>Registrar Usuario</h1>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"ControlTUsuarioRegistrar\" method=\"POST\">\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"cmbTipoUsuario\">Tipo de Usuario</label>            \r\n");
      out.write("            <select id=\"cmbTipoUsuario\" name=\"cmbTipoUsuario\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </select><br>\r\n");
      out.write("            <label for=\"txtNombre\">Nombre</label>\r\n");
      out.write("            <input type=\"text\" id=\"txtNombre\" name=\"txtNombre\" required pattern=\"^[a-zA-ZáéíóúÁÉÍÓÚ]+\"><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"txtApellido1\">Apellido 1</label>\r\n");
      out.write("            <input type=\"text\" id=\"txtApellido1\" name=\"txtApellido1\" required pattern=\"^[a-zA-ZáéíóúÁÉÍÓÚ]+\"><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"txtApellido2\">Apellido 2</label>\r\n");
      out.write("            <input type=\"text\" id=\"txtApellido2\" name=\"txtApellido2\" pattern=\"^[a-zA-ZáéíóúÁÉÍÓÚ]+\"><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"txtCorreo\">Correo Electronico</label>\r\n");
      out.write("            <input type=\"text\" id=\"txtCorreo\" name=\"txtCorreo\" required pattern=\"^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$\"><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"txtTelefono\">Telefono</label>\r\n");
      out.write("            <input type=\"text\" id=\"txtTelefono\" name=\"txtTelefono\" onkeyup=\"mascara(this,'-',sep,true);\" required pattern=\"^[0-9]{1,4}-[0-9]{1,4}\"><br>\r\n");
      out.write(" \r\n");
      out.write("            <input type=\"submit\" value=\"Registrar Usuario\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <a href=\"Index.jsp\">Regresar al Menu</a>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${negociotipousuario.listaTipoUsuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getIdTipoUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
