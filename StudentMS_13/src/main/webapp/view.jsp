<%@ page import="java.sql.*" %>
<html>
<head>
    <style>
        body{font-family:Arial;background:#eef2f7;}
        .container{width:95%;margin:auto;padding:20px;}
        table{width:100%;border-collapse:collapse;background:white;}
        th, td {padding:12px; text-align:center; border: 1px solid #ddd;}
        th{background:#007bff;color:white;}
        .btn {padding:5px 10px; text-decoration:none; color:white; border-radius:4px;}
        .edit {background:#28a745;}
        .delete {background:#dc3545;}
    </style>
</head>
<body>
<div class="container">
    <h2>Student Records</h2>
    <table>
        <tr>
            <th>Roll</th><th>Name</th><th>Course</th>
            <th>Email</th><th>Mobile</th><th>City</th>
            <th>Edit</th><th>Delete</th>
        </tr>
        <%
            try {
                // Fixed: Added correct Driver and Connection string [cite: 568, 570]
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdb", "root", "Firdous@001");
                
                // Fixed: Added missing '=' sign 
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from student");

                // Fixed: Added the missing while loop 
                while(rs.next()) { 
        %>
        <tr>
            <td><%=rs.getInt(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><a class="btn edit" href="edit.jsp?roll=<%=rs.getInt(1)%>">Edit</a></td>
            <td><a class="btn delete" href="DeleteServlet?roll=<%=rs.getInt(1)%>">Delete</a></td>
        </tr>
        <% 
                } // This matches the closing brace in your PDF 
                con.close();
            } catch(Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
    <br>
    <a href="index.jsp">Add Student</a>
</div>
</body>
</html>