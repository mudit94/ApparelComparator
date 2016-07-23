<%-- 
    Document   : exists
    Created on : 20 Jun, 2016, 11:03:20 PM
    Author     : Mudit Mahashwari
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    try{
        Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mudit");
           PreparedStatement ps = con.prepareStatement("SELECT  * FROM Login WHERE " +
                    "uname = mudit94");
                     ps.setString(2,request.getParameter("uname"));
           out.println("yo yo");
 
                     ResultSet res = ps.executeQuery();
            if(res.first()){
                out.print("User already exists");
            }else{
                out.print("User name is valid");
            }
        }catch (Exception e){
            System.out.println(e);  
        }
%>
