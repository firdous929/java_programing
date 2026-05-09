package com.session;

import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 
import jakarta.servlet.annotation.WebServlet; 
 
@WebServlet("/LoginServlet") 
public class LoginServlet extends HttpServlet { 
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request,HttpServletResponse response) 
throws ServletException, IOException { 
 
String user = request.getParameter("username"); 
String pass = request.getParameter("password"); 
 
if(user.equals("Firdous") && pass.equals("firdous@1234")) 
{ 
HttpSession session = request.getSession(); 
session.setAttribute("user", user); 
 
response.sendRedirect("dashboard.jsp"); 
} 
else 
{ 
response.getWriter().println("<h2>Invalid Login</h2>"); 
} 
} 
}