package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header4.jspf");
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Feedback</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"feedbackstyle.css\">\r\n");
      out.write("         ");
      out.write("\r\n");
      out.write("<script Language=\"JavaScript\">\r\n");
      out.write("   \r\n");
      out.write("    function feedback()\r\n");
      out.write("   {\r\n");
      out.write("       document.getElementById('contentfeed').innerHTML=document.getElementById('contact').innerHTML;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"nav\"><br>\r\n");
      out.write("      \r\n");
      out.write("            <ul class=\"topnav\">\r\n");
      out.write("                <li onclick=\"Logout\"><a href=\"Login.jsp\">Logout</a></li>\r\n");
      out.write("            <li onclick=\"feedback()\"><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("            <li><a href=\"category.jsp\">Category</a></li>\r\n");
      out.write("            \r\n");
      out.write("            <!--<li class=\"icon\">-->\r\n");
      out.write("            \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t</body>");
      out.write("\r\n");
      out.write("         <script language=\"Javascript\">\r\n");
      out.write("             function printMsg(){\r\n");
      out.write("                 document.getElementById('contentfeed').innerHTML=document.getElementById('collect').innerHTML;\r\n");
      out.write("             }\r\n");
      out.write("         </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <!--<div id=\"nav\"><br>\r\n");
      out.write("            <ul class=\"topnav\">\r\n");
      out.write("            <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("            <li><a href=\"#contact.jsp\">Contact</a></li>\r\n");
      out.write("            <li class=\"icon\">\r\n");
      out.write("            <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>-->\r\n");
      out.write("        <section id=\"contentfeed\">\r\n");
      out.write("        <div id=\"feedback\">\r\n");
      out.write("    <br><center><div class=\"header\"  style=\"font-family:Lobster; font-size:40px;\">\r\n");
      out.write("            Feedback</div></center>\r\n");
      out.write("        <div id=\"form-main\">\r\n");
      out.write("  <div id=\"form-div\">\r\n");
      out.write("    <form class=\"form\" id=\"form1\">\r\n");
      out.write("      \r\n");
      out.write("      <p class=\"name\">\r\n");
      out.write("          <input name=\"name\" type=\"text\" class=\"validate[required,custom[onlyLetter],length[0,100]] feedback-input\" placeholder=\"Name\" id=\"name\" required=\"\" oninvalid=\"this.setCustomValidity('Name is mandatory')\" />\r\n");
      out.write("      </p>\r\n");
      out.write("      \r\n");
      out.write("      <p class=\"email\">\r\n");
      out.write("        <input name=\"email\" type=\"text\" class=\"validate[required,custom[email]] feedback-input\" id=\"email\" placeholder=\"Email\" oninvalid=\"this.setCustomValidity('Email is mandatory')\"/>\r\n");
      out.write("      </p>\r\n");
      out.write("      \r\n");
      out.write("      <p class=\"text\">\r\n");
      out.write("        <textarea name=\"text\" class=\"validate[required,length[6,300]] feedback-input\" id=\"comment\" placeholder=\"Comment\"></textarea>\r\n");
      out.write("      </p>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"submit\">\r\n");
      out.write("        <input type=\"button\" value=\"SEND\" id=\"button-blue\" onclick=\"printMsg()\"/>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    <div id=\"collect\" hidden=\"true\">\r\n");
      out.write("           <center> <p style=\"font-size: 30px; font-family: sans-serif; font-weight: bold;\"> Your feedback has been successfully received!. Thank You</p></center>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div id=\"contact\" hidden=\"true\">\r\n");
      out.write("         \r\n");
      out.write("             <center>  <h2 style=\"color: black; font-size: 25px;  \">Contact Details</h2></center>\r\n");
      out.write("            \r\n");
      out.write("            <center><div class=\"contact\">                \r\n");
      out.write("            <p>\r\n");
      out.write("                 Our address is:\r\n");
      out.write("            Logic Info Systems Pvt Ltd.\r\n");
      out.write("            Plot no. 109,\r\n");
      out.write("            Udyog Vihar, Phase 4,\r\n");
      out.write("            Gurgaon 122015\r\n");
      out.write("            </p>\r\n");
      out.write("            <p> You can reach us out at </p>\r\n");
      out.write("                    <pre> Email: apparel_comparator@gmail.com\r\n");
      out.write("          \r\n");
      out.write("   Call us on: +919630058801\r\n");
      out.write("                +919898497746\r\n");
      out.write("                    </pre>\r\n");
      out.write("                </div>\r\n");
      out.write("            </center>\r\n");
      out.write("         </div>\r\n");
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
}
