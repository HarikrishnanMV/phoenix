package StreamAssignment;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.RequestDispatcher;


public class servlet1 extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html"); 
	     
        
	      String n=request.getParameter("username"); 
	      String p=request.getParameter("password"); 
	     
	      request.setAttribute("user",n);
	   request.setAttribute("pass",p);
	     
	      RequestDispatcher rd=request.getRequestDispatcher("/servlet2"); 
	         rd.forward(request,response);
	}

}