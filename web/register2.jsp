<%-- 
    Document   : register2
    Created on : 17 Jun, 2016, 3:32:08 PM
    Author     : Mudit Mahashwari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Registration</title>
         <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="regstyle.css">
        <script type="text/javascript" src="uservalidate.js"></script>
	<script>
	function validateName(){
  var name=document.getElementById("name").value;
  re=/[0-9]/;
  if(re.test(name)){
  document.getElementById("name").value="";
  }
  }
   function validate(){
    var password = document.getElementById("password");
   var confirm_password = document.getElementById("confirm_password");
	if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Passwords Don't Match");
  } else {
    confirm_password.setCustomValidity('');
  }}
  
  function checkExists(){
        var xmlhttp = new XMLHttpRequest();
                var username = document.getElementById("username");
                var url = "exist.jsp?uname=" + username;
                xmlhttp.onreadystatechange = function(){
                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
                        if(xmlhttp.responseText == "yo yo")
                            document.getElementById("isE").style.color = "red";
                        else
                            document.getElementById("isE").style.color = "green";
                        document.getElementById("isE").innerHTML = xmlhttp.responseText;
                    }
                    
                };
                try{
                xmlhttp.open("GET",url,true);
                xmlhttp.send();
            }catch(e){alert("unable to connect to server");
            }
        }
	
        
</script><% String message=(String)request.getParameter("message"); %>
        </head>
<body>
    <div class="container"><h1>Registration</h1></div>
        <div class="contain">
            <center><div class="message" style="color: red; font-size: 20px;"><% if(message!=null)  out.println(message); %></div></center>
     <form method="post" action="LoginPojo" >
         <br><br>
         <input type="text" pattern="^[a-zA-Z][" "]$"  name="name" placeholder="Name" required  id="name" required="" oninvalid="this.setCustomValidity('Name is mandatory')" onkeyup="validateName() ">
                <input type="text" id="username" pattern="^[a-zA-Z0-9]{3,9}$" title="Min 3 Max 8 Chars" name="uname" placeholder="Username" required="" oninvalid="this.setCustomValidity('Username is mandatory')"><p style="position:fixed; color:white; font-size: 20px;" >Username must be 3 to 8 characters long.</p> <span id="isE"></span>
         <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Enter valid Email Id" name="email" placeholder="Email Id" required="" oninvalid="this.setCustomValidity('Email is mandatory')" ><p style="position:fixed; color:white; font-size: 20px;">Enter valid Email Id</p>
		  <input type="password" id="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Min 3 Max 8 Chars" name="password" placeholder="Password" required="" oninvalid="this.setCustomValidity('Password is mandatory')"><p style="position:fixed; color:white; font-size: 20px;">Password must contain:<br>1. Atleast one Uppercase<br>2. Atleast one Lowercase<br>3. Atleast one Numeric.</p>
		<input type="password"  name="pwd" placeholder="Confirm Password" required id="confirm_password" onkeyup="validate()">
         <input type="submit" name="Submit" value="Register" class="btn-login">       
     </form>
    </div>
</body>

