package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header2.jspf");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <title>Category</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"catstyle.css\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<script Language=\"JavaScript\">\r\n");
      out.write("   \r\n");
      out.write("    function about_us()\r\n");
      out.write("   {\r\n");
      out.write("       document.getElementById('content').innerHTML=document.getElementById('about_us').innerHTML;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function logout(){\r\n");
      out.write("       \r\n");
      out.write("       alert(\"You have been logged out successfully\");\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"nav\"><br>\r\n");
      out.write("      \r\n");
      out.write("            <ul class=\"topnav\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    \r\n");
      out.write("                    <li><a href=\"Logout\"><h2>Logout</h2></a></li>\r\n");
      out.write("                        <li onclick=\"about_us()\"><a href=\"#about_us\"><h2>Contact</h2></a></li>\r\n");
      out.write("                        <li><a href=\"category.jsp\"><h2>Category</h2></a></li>\r\n");
      out.write("            <!--<li class=\"icon\">-->\r\n");
      out.write("                </b>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t</body>");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("            </head>\r\n");
      out.write("    \r\n");
      out.write("            <body>\r\n");
      out.write("      \r\n");
      out.write("        <br>\r\n");
      out.write("        <br><br><br>\r\n");
      out.write("        <h1 style=\"font-family: sans-serif;\"> Welcome ");

            String user=(String)session.getAttribute("name");
            if(null==user){
                response.sendRedirect("Login.jsp"+"?name=Please Login first");
            }
          //  if(session==null)response.sendRedirect("Login.jsp");
        
           else out.print(session.getAttribute("name"));
      out.write("</h1>\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("    \r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation Bar\r\n");
      out.write("        <div id=\"nav\"><br>\r\n");
      out.write("            <ul class=\"topnav\">\r\n");
      out.write("            <li><a href=\"#home\">Logout</a></li>\r\n");
      out.write("            <li><a href=\"#news\">Contact</a></li>\r\n");
      out.write("            <li><a href=\"category.jsp\">Category</a></li>\r\n");
      out.write("            <li class=\"icon\">\r\n");
      out.write("            <li><a href=\"logout.html\">Home</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>-->\r\n");
      out.write("        <section id=\"content\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <center><h1>Click on the category of your choice!</h1></center>\r\n");
      out.write("            <div class=\"box1\" >\r\n");
      out.write("         <a href=\"search.jsp\" style=\"color: black;\"><img src=\"cloth.jpg\" height=\"200px\" width=\"200px\" border=\"10px solid\"></a>\r\n");
      out.write("         \r\n");
      out.write("         <h1>Clothing</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"box2\">\r\n");
      out.write("         <a href=\"search.jsp\" style=\"color: black;\"><img src=\"shoes.jpg\" height=\"200px\" width=\"200px\" border=\"10px solid\"></a>\r\n");
      out.write("         \r\n");
      out.write("         <h1>Footwear</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"box3\">\r\n");
      out.write("         <a href=\"search.jsp\" style=\"color: black;\"><img src=\"35.jpg\" height=\"200px\" width=\"200px\" border=\"10px solid\"></a>\r\n");
      out.write("         \r\n");
      out.write("         <h1>Accessories</h1>\r\n");
      out.write("\r\n");
      out.write("</div>      \r\n");
      out.write("        \r\n");
      out.write("</section>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"about_us\" hidden=\"true\">\r\n");
      out.write("         \r\n");
      out.write("            <h2 style=\"color: black; font-size: 25px;  \">Contact Details</h2>\r\n");
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
      out.write("            <p> You can provide your feedback and suggestions by clicking <a href=\"feedback.jsp\" style=\"color: yellowgreen;\">here</a></p>\r\n");
      out.write("                </div></center>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("         \r\n");
      out.write("</body>\r\n");
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
