<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        
        <title>Category</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="catstyle.css">
        <%@ include file="header2.jspf" %>
     
            </head>
    
            <body>
      
        <br>
        <br><br><br>
        <h1 style="font-family: sans-serif;"> Welcome <%
            String user=(String)session.getAttribute("name");
            if(null==user){
                response.sendRedirect("Login.jsp"+"?name=Please Login first");
            }
          //  if(session==null)response.sendRedirect("Login.jsp");
        
           else out.print(session.getAttribute("name"));%></h1>
            
           
    
           

        <!-- Navigation Bar
        <div id="nav"><br>
            <ul class="topnav">
            <li><a href="#home">Logout</a></li>
            <li><a href="#news">Contact</a></li>
            <li><a href="category.jsp">Category</a></li>
            <li class="icon">
            <li><a href="logout.html">Home</li>
            </ul>
        </div>-->
        <section id="content">
            <br>
            <center><h1>Click on the category of your choice!</h1></center>
            <div class="box1" >
         <a href="search.jsp" style="color: black;"><img src="cloth.jpg" height="200px" width="200px" border="10px solid"></a>
         
         <h1>Clothing</h1>
</div>
<div class="box2">
         <a href="search.jsp" style="color: black;"><img src="shoes.jpg" height="200px" width="200px" border="10px solid"></a>
         
         <h1>Footwear</h1>
</div>
<div class="box3">
         <a href="search.jsp" style="color: black;"><img src="35.jpg" height="200px" width="200px" border="10px solid"></a>
         
         <h1>Accessories</h1>

</div>      
        
</section>
        
        <div id="about_us" hidden="true">
         
            <h2 style="color: black; font-size: 25px;  ">Contact Details</h2>
            
            <center><div class="contact">                
            <p>
                 Our address is:
            Logic Info Systems Pvt Ltd.
            Plot no. 109,
            Udyog Vihar, Phase 4,
            Gurgaon 122015
            </p>
            <p> You can reach us out at </p>
                    <pre> Email: apparel_comparator@gmail.com
          
   Call us on: +919630058801
                +919898497746
                    </pre>
            <p> You can provide your feedback and suggestions by clicking <a href="feedback.jsp" style="color: yellowgreen;">here</a></p>
                </div></center>

</div>
         
</body>
</html>
