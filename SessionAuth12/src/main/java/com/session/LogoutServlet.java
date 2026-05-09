package com.session;

import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.http.*; 
import jakarta.servlet.annotation.WebServlet; 
 
@WebServlet("/LogoutServlet") 
public class LogoutServlet extends HttpServlet { 
 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request,HttpServletResponse response) 
throws ServletException, IOException { 
 
HttpSession session = request.getSession(false); 
 
if(session != null) 
{ 
session.invalidate(); 
} 
 
response.sendRedirect("login.jsp"); 
} 
}