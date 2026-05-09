package com.sms;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws ServletException, IOException {
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdb","root","Firdous@001");

PreparedStatement ps=con.prepareStatement(
"insert into student values(?,?,?,?,?,?)");

ps.setInt(1,Integer.parseInt(request.getParameter("rollno")));
ps.setString(2,request.getParameter("name"));
ps.setString(3,request.getParameter("course"));
ps.setString(4,request.getParameter("email"));
ps.setString(5,request.getParameter("mobileno"));
ps.setString(6,request.getParameter("city"));

ps.executeUpdate();

response.sendRedirect("view.jsp");

}catch(Exception e){
e.printStackTrace();
}
}
}
