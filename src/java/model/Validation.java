/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mudit Mahashwari
 */
public class Validation extends HttpServlet {
   
   /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
   response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
/*String userName = (String) session.getAttribute("User");
if (null == userName) {
   request.setAttribute("Error", "Session has ended.  Please login.");
   RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
   rd.forward(request, response);
}*/
            String uname = request.getParameter("user");    
String query,dbUsername,dbPassword;
   boolean login=false; 
   //HttpSession session;
   //if(session.getAttribute()==null)
   //out.println(uname);
   
    String pwd = request.getParameter("pass");
       Class.forName("oracle.jdbc.OracleDriver");
     
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mudit");
        
                query = "SELECT * FROM Login";
            Statement stmt=(Statement)con.createStatement();
                    stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                
                dbUsername = rs.getString("uname");
               //out.print(dbUsername);
                dbPassword = rs.getString("password");
     //           out.println(dbUsername+" "+dbPassword);
                if(dbUsername.equals(uname) && dbPassword.equals(pwd)){
                 //   out.println("OK");
                   
                    login = true;
                }
                if(login==true){
                     HttpSession session=request.getSession();  
        session.setAttribute("name",uname);  
        RequestDispatcher rd=request.getRequestDispatcher("category.jsp");
        rd.forward(request, response);
                              //response.sendRedirect("category.jsp");
                }
            }
                if(login==false){
                    String msg="Invalid Credentials";
                    request.setAttribute("message",msg);
                    response.sendRedirect("Login.jsp"+"?name="+msg);
                }
                
            
            rs.close();
            stmt.close();
            con.close();
            
        }
        catch(Exception e){
    
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
