package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Registration</title>\n");
      out.write("         <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"regstyle.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"uservalidate.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\tfunction validateName(){\n");
      out.write("  var name=document.getElementById(\"name\").value;\n");
      out.write("  re=/[0-9]/;\n");
      out.write("  if(re.test(name)){\n");
      out.write("  document.getElementById(\"name\").value=\"\";\n");
      out.write("  }\n");
      out.write("  }\n");
      out.write("   function validate(){\n");
      out.write("    var password = document.getElementById(\"password\");\n");
      out.write("   var confirm_password = document.getElementById(\"confirm_password\");\n");
      out.write("\tif(password.value != confirm_password.value) {\n");
      out.write("    confirm_password.setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("  } else {\n");
      out.write("    confirm_password.setCustomValidity('');\n");
      out.write("  }}\n");
      out.write("  \n");
      out.write("  function checkExists(){\n");
      out.write("        var xmlhttp = new XMLHttpRequest();\n");
      out.write("                var username = document.getElementById(\"username\");\n");
      out.write("                var url = \"exist.jsp?uname=\" + username;\n");
      out.write("                xmlhttp.onreadystatechange = function(){\n");
      out.write("                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200){\n");
      out.write("                        if(xmlhttp.responseText == \"yo yo\")\n");
      out.write("                            document.getElementById(\"isE\").style.color = \"red\";\n");
      out.write("                        else\n");
      out.write("                            document.getElementById(\"isE\").style.color = \"green\";\n");
      out.write("                        document.getElementById(\"isE\").innerHTML = xmlhttp.responseText;\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                };\n");
      out.write("                try{\n");
      out.write("                xmlhttp.open(\"GET\",url,true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("            }catch(e){alert(\"unable to connect to server\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("</script>");
 String message=(String)request.getParameter("message"); 
      out.write("\n");
      out.write("        </head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\"><h1>Registration</h1></div>\n");
      out.write("        <div class=\"contain\">\n");
      out.write("            <center><div class=\"message\" style=\"color: red; font-size: 20px;\">");
 if(message!=null)  out.println(message); 
      out.write("</div></center>\n");
      out.write("     <form method=\"post\" action=\"LoginPojo\" >\n");
      out.write("         <br><br>\n");
      out.write("         <input type=\"text\" pattern=\"^[a-zA-Z][\" \"]$\"  name=\"name\" placeholder=\"Name\" required  id=\"name\" required=\"\" oninvalid=\"this.setCustomValidity('name is mandatory')\" onkeyup=\"validateName() \">\n");
      out.write("                <input type=\"text\" id=\"username\" pattern=\"^[a-zA-Z0-9]{3,9}$\" title=\"Min 3 Max 8 Chars\" name=\"uname\" placeholder=\"Username\" ><p style=\"position:fixed; color:white; font-size: 20px;\" >Username must be 3 to 8 characters long.</p> <span id=\"isE\"></span>\n");
      out.write("         <input type=\"text\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" title=\"Enter valid Email Id\" name=\"email\" placeholder=\"Email Id\" required=\"\" oninvalid=\"this.setCustomValidity('email is mandatory')\" ><p style=\"position:fixed; color:white; font-size: 20px;\">Enter valid Email Id</p>\n");
      out.write("\t\t  <input type=\"password\" id=\"password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Min 3 Max 8 Chars\" name=\"password\" placeholder=\"Password\" required><p style=\"position:fixed; color:white; font-size: 20px;\">Password must contain:<br>1. Atleast one Uppercase<br>2. Atleast one Lowercase<br>3. Atleast one Numeric.</p>\n");
      out.write("\t\t<input type=\"password\"  name=\"pwd\" placeholder=\"Confirm Password\" required id=\"confirm_password\" onkeyup=\"validate()\">\n");
      out.write("         <input type=\"submit\" name=\"Submit\" value=\"Register\" class=\"btn-login\">       \n");
      out.write("     </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
