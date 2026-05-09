<%@ page language="java" %> 
<%@ page session="true" %> 
 
<% 
String user = (String)session.getAttribute("user"); 
if(user == null) 
{ 
response.sendRedirect("login.jsp"); 
return; 
} 
%> 
 
<html> 
<head> 
<title>Dashboard</title> 
 
<style> 
body{ 
margin:0; 
font-family:Arial; 
background:linear-gradient(to right,#43cea2,#185a9d); 
} 
 
.box{ 
width:400px; 
margin:100px auto; 
background:white; 
padding:30px; 
border-radius:15px; 
text-align:center; 
box-shadow:0 0 15px gray; 
} 
</style> 
</head> 
 
<body> 
 
<div class="box"> 
 
<h1>Welcome <%=user%> </h1> 
 
<h3>Dashboard Page</h3> 
 
<a href="LogoutServlet">Logout</a> 
 
</div> 
 
</body> 
</html>