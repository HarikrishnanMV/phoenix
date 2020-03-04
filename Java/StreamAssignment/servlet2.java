package StreamAssignment;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet2 extends HttpServlet 
{
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 {
  PrintWriter out=response.getWriter();
  String a= (String)request.getAttribute("user");
  String b= (String)request.getAttribute("pass");
  
  out.println("<h1>Details:"+a +" "+b);
 }
}

