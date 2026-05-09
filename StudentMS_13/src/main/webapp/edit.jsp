<%@ page import="java.sql.*" %>
<%
    // Database logic remains the same
    int roll = Integer.parseInt(request.getParameter("roll"));
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdb","root","Firdous@001");
    PreparedStatement ps = con.prepareStatement("select * from student where rollno=?");
    ps.setInt(1, roll);
    ResultSet rs = ps.executeQuery();
    rs.next();
%>
<html>
<head>
<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', sans-serif;
        background:linear-gradient(135deg, #11998e, #38ef7d);
        height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    /* This creates the inner white form box */
    .container {
        width: 350px; /* Shorter width */
        background: white;
        padding: 25px;
        border-radius: 15px;
        box-shadow: 0 8px 20px rgba(0,0,0,0.15);
    }
    h2 { text-align: center; margin-top: 0; color: #333; }
    input {
        width: 100%;
        padding: 10px;
        margin: 6px 0 12px 0;
        border: 1px solid #ccc;
        border-radius: 8px;
        box-sizing: border-box; /* Keeps input inside the white box */
    }
    input[readonly] { background: #f9f9f9; color: #888; }
    button {
        width: 100%;
        padding: 12px;
        background: #28a745;
        color: white;
        border: none;
        border-radius: 8px;
        font-weight: bold;
        cursor: pointer;
    }
    .back {
        display: block;
        text-align: center;
        margin-top: 15px;
        color: #007bff;
        text-decoration: none;
        font-size: 14px;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Edit Student</h2>
    <form action="UpdateServlet" method="post">
        <input type="text" name="rollno" value="<%=rs.getInt(1)%>" readonly>
        <input type="text" name="name" value="<%=rs.getString(2)%>" required>
        <input type="text" name="course" value="<%=rs.getString(3)%>" required>
        <input type="email" name="email" value="<%=rs.getString(4)%>" required>
        <input type="text" name="mobileno" value="<%=rs.getString(5)%>" required>
        <input type="text" name="city" value="<%=rs.getString(6)%>" required>
        <button type="submit">Update Changes</button>
    </form>
    <a href="view.jsp" class="back">← Back to Records</a>
</div>

</body>
</html>