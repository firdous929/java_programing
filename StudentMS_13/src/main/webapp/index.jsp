<%@ page language="java" %>
<html>
<head>
<title>Student Management</title>
<style>
body{
margin:0;
font-family:'Segoe UI';
background:linear-gradient(120deg,#89f7fe,#66a6ff);
}
.container{
width:450px;
margin:50px auto;
background:white;
padding:30px;
border-radius:20px;
box-shadow:0 10px 30px rgba(0,0,0,0.2);
}
button:hover{
background:#0056b3;
}
a{
display:block;
text-align:center;
margin-top:15px;
font-weight:bold;
}
</style>
</head>
<body>
<div class="container">
<h2>Student Form</h2>
<form action="StudentServlet" method="post">
<input type="number" name="rollno" placeholder="Roll No" required>
<input type="text" name="name" placeholder="Name" required>
<input type="text" name="course" placeholder="Course" required>
<input type="email" name="email" placeholder="Email" required>
<input type="text" name="mobileno" placeholder="Mobile No" required>

<input type="text" name="city" placeholder="City" required>
<button type="submit">Save Student</button>
</form>
<a href="view.jsp">View Students</a>
</div>
</body>
</html>