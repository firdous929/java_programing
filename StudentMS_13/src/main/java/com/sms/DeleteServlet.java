package com.sms;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DeleteServlet")

public class DeleteServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {

try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdb","root","Firdous@001");

PreparedStatement ps=con.prepareStatement(
"delete from student where rollno=?");

ps.setInt(1,Integer.parseInt(request.getParameter("roll")));
ps.executeUpdate();
response.sendRedirect("view.jsp");
}catch(Exception e){
e.printStackTrace();
}
}
}
