<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Feedback</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="feedbackstyle.css">
         <%@ include file="header4.jspf" %>
         <script language="Javascript">
             function printMsg(){
                 var x=document.getElementById('name').value;
                 if(x=="")
                 {    alert("Name is mandatory");
                 return false ;}
                 document.getElementById('contentfeed').innerHTML=document.getElementById('collect').innerHTML;
             }
         </script>
    </head>
    
    <body>
        
        <!--<div id="nav"><br>
            <ul class="topnav">
            <li><a href="logout.jsp">Logout</a></li>
            <li><a href="#contact.jsp">Contact</a></li>
            <li class="icon">
            <li><a href="home.jsp">Home</a></li>
            </ul>
        </div>-->
        <section id="contentfeed">
        <div id="feedback">
    <br><center><div class="header"  style="font-family:Lobster; font-size:40px;">
            Feedback</div></center>
        <div id="form-main">
  <div id="form-div">
      <form class="form" id="form1">
      
      <p class="name">
          <input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Name" id="name" required="" oninvalid="this.setCustomValidity('Name is mandatory')" />
      </p>
      
      <p class="email">
        <input name="email" type="text" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Email" oninvalid="this.setCustomValidity('Email is mandatory')"/>
      </p>
      
      <p class="text">
        <textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Comment"></textarea>
      </p>
      
      
      <div class="submit">
        <input type="button" value="SEND" id="button-blue" onclick="printMsg()"/>
       
      </div>
    </form>
  </div>
        </div>
        </div>
        </section>
    <div id="collect" hidden="true">
           <center> <p style="font-size: 30px; font-family: sans-serif; font-weight: bold;"> Your feedback has been successfully received!. Thank You</p></center>
         </div>
         <div id="contact" hidden="true">
         
             <center>  <h2 style="color: black; font-size: 25px;  ">Contact Details</h2></center>
            
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
                </div>
            </center>
         </div>
    </body>
</html>
