package com.sms;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {

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
"update student set name=?,course=?,email=?,mobileno=?,city=? where rollno=?");
ps.setString(1,request.getParameter("name"));
ps.setString(2,request.getParameter("course"));
ps.setString(3,request.getParameter("email"));
ps.setString(4,request.getParameter("mobileno"));
ps.setString(5,request.getParameter("city"));
ps.setInt(6,Integer.parseInt(request.getParameter("rollno")));

ps.executeUpdate();
response.sendRedirect("view.jsp");
}catch(Exception e){
e.printStackTrace();
}
}
}
