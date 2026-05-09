<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<html> 
<head> 
<title>Login</title> 
  
<style>
body {
    margin: 0;
    font-family: Arial;
    background: linear-gradient(to right, #ee0979, #ff6a00);
    display: flex; /* Added to center the box */
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.box {
    width: 400px;
    background: white;
    padding: 30px;
    border-radius: 15px;
    text-align: center;
    box-shadow: 0 0 15px rgba(0,0,0,0.2);
}

input {
    width: 90%;
    padding: 10px;
    margin: 10px;
    border-radius: 8px;
    border: 1px solid gray;
} /* Added missing closing brace here */

input[type=submit] {
    background: #28a745;
    color: white;
    border: none;
    cursor: pointer;
    width: 95%; /* Adjust width for the button */
}

input[type=submit]:hover {
    background: #218838;
}
</style> 
</head> 
 
<body> 
 
<div class="box"> 
 
<h2>🔐 Student Login</h2> 
 
<form action="LoginServlet" method="post"> 
 
<input type="text" name="username" placeholder="Enter Username" required> 
<input type="password" name="password" placeholder="Enter Password" required> 
 
<input type="submit" value="Login"> 
 
</form> 
 
</div> 
 
</body>