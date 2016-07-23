package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <script>\n");
      out.write("            function back_block()\n");
      out.write("{\n");
      out.write("window.history.foward(1);\n");
      out.write("}\n");
      out.write("            </script>\n");
      out.write("        <style>\n");
      out.write("            .message{\n");
      out.write("                color: green;\n");
      out.write("                font-size: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            form input:required{\n");
      out.write("            background: #FFFFFF url('symbol.png') no-repeat right center;\n");
      out.write("        }\n");
      out.write("        form input:focus:invalid{\n");
      out.write("            background: #FFFFFF url('invalid.png') no-repeat right center;\n");
      out.write("            border: solid #CD3F33 2px;\n");
      out.write("            background-size:15px 15px;\n");
      out.write("        }\n");
      out.write("        form input:focus:valid{\n");
      out.write("            background: #FFFFFF url('valid.png') no-repeat right center;\n");
      out.write("            background-size:15px 15px;\n");
      out.write("            border: solid #2A9942 2px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("        ");
 String message=(String)request.getParameter("name"); 
      out.write("\n");
      out.write("        <body onunload=\"back_block()\">\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    <center><div class=\"contain\"><h1>Shopper Pro<h1></div></center>\n");
      out.write("                    <br><br>\n");
      out.write("        <div class=\"message\">");
 if(message!=null) out.println(message); 
      out.write("</div>    \n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <img src=\"logo.png\">\n");
      out.write("            <form method=\"post\"  action=\"Validation\" >\n");
      out.write("                <div class=\"form-input\">\n");
      out.write("                    <input type=\"text\" name=\"user\" placeholder=\"Username\" id=\"user\"  title=\"Min 3 Max 8 Chars\" required=\"\" oninvalid=\"this.setCustomValidity('Username is mandatory')\">\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-input\">\n");
      out.write("                    <input type=\"password\" name=\"pass\" placeholder=\"Password\"  id=\"pass\"  required=\"\" oninvalid=\"this.setCustomValidity('Password is mandatory')\">\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" name=\"Submit\" value=\"Login\" class=\"btn-login\">\n");
      out.write("                    <br><p><h2>If new user, Please <a href=\"register2.jsp\">Register here</a></h2></p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
