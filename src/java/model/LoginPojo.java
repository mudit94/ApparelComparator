/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/**
 *
 * @author Mudit Mahashwari
 */
public class LoginPojo extends HttpServlet {

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
		Connection con;
                PreparedStatement ps;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              String user = request.getParameter("uname");    
    String pwd = request.getParameter("password");
   String dbUsername,dbEmail; 
   String fname = request.getParameter("name");
    //out.println(fname);
    //out.println(pwd);
    
    String email = request.getParameter("email");
    
    Class.forName("oracle.jdbc.OracleDriver");
        //out.println("not able to find class");
 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mudit");
          //  out.println("connection established");
Statement state=con.createStatement();
boolean exists=false;
ResultSet result=state.executeQuery("select *from login");
while(result.next()){
     dbUsername = result.getString("uname");
     dbEmail= result.getString("email");
     if(dbUsername.equals(user)){
         String msg="Username in use";
          request.setAttribute("message",msg);
           response.sendRedirect("register2.jsp"+"?message="+msg);
           
     }
     else if(dbEmail.equals(email)){
         String msg="Email in use";
          request.setAttribute("message",msg);
           response.sendRedirect("register2.jsp"+"?message="+msg);
  
     }
     
}
			    
ps = con.prepareStatement("insert into login values (?,?,?,?)");
                ps.setString(1,fname);
               
                ps.setString(2,email);
                ps.setString(3,user);
                ps.setString(4,pwd);
                int i=ps.executeUpdate();
                if(i>0){     
                    String message="Registered successfully";
                    request.setAttribute("name",message);
                    response.sendRedirect("Login.jsp"+"?name="+message);

                    ps.close();
                    con.close();
                    
                }
                    

        }
        
        catch(Exception e){
        e.printStackTrace();
        }
        finally{
       
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