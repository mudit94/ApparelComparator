<%-- 
    Document   : checkusername
    Created on : 19 Jun, 2016, 4:47:38 PM
    Author     : Mudit Mahashwari
--%>

<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%
                    String sn=request.getParameter("ver");
                    Class.forName("oracle.jdbc.OracleDriver");
                    Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mudit");
                    Statement st=con.createStatement();
                    ResultSet rs = st.executeQuery("select * from login where uname='"+sn+"'");  // this is for name
                    if(rs.next())
                    {   %>
                        <font color=red>
                        Name already taken
                        <input type="hidden" id="actual" name="actual" value="taken">
                        <input type="submit" value="submit">
                        </font>

                   <% }else {%>
                        <font color=green>
                        <input type="hidden" id="actual" name="actual" value="available">
                        Available
                        </font>
                        <input type="submit" value="submit">
                   <% }%>
                   
     <%              
rs.close();
st.close();
con.close();
%>

