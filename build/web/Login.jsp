<%-- 
    Document   : Login
    Created on : 13 Jun, 2016, 9:40:51 PM
    Author     : Mudit Mahashwari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="newcss.css">
        <script>
            function back_block()
{
window.history.foward(1);
}
            </script>
        <style>
            .message{
                color: green;
                font-size: 30px;
                text-align: center;
                font-weight: bold;
            }
            form input:required{
            background: #FFFFFF url('symbol.png') no-repeat right center;
        }
        form input:focus:invalid{
            background: #FFFFFF url('invalid.png') no-repeat right center;
            border: solid #CD3F33 2px;
            background-size:15px 15px;
        }
        form input:focus:valid{
            background: #FFFFFF url('valid.png') no-repeat right center;
            background-size:15px 15px;
            border: solid #2A9942 2px;
        }

        </style>
	</head>
	
        <% String message=(String)request.getParameter("name"); %>
        <body onunload="back_block()">
        
        <br><br>
        
       
    <center><div class="contain"><h1>Shopper Pro<h1></div></center>
                    <br><br>
        <div class="message"><% if(message!=null) out.println(message); %></div>    
        <div class="container">
        
            <img src="logo.png">
            <form method="post"  action="Validation" >
                <div class="form-input">
                    <input type="text" name="user" placeholder="Username" id="user"  title="Min 3 Max 8 Chars" required="" oninvalid="this.setCustomValidity('Username is mandatory')">
            
                </div>
                <div class="form-input">
                    <input type="password" name="pass" placeholder="Password"  id="pass"  required="" oninvalid="this.setCustomValidity('Password is mandatory')">
                    <br>
                    <input type="submit" name="Submit" value="Login" class="btn-login">
                    <br><p><h2>If new user, Please <a href="register2.jsp">Register here</a></h2></p>
                </div>
            </form>
        </div>
    </body>
</html>
