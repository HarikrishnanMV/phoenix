package StreamAssignment;

import java.util.*;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class q42 extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
java.util.Date date=new java.util.Date();
out.println(date);
}

}

