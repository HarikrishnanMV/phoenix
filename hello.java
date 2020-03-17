
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hello extends HttpServlet
{
protected void  doP(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
     // System.out.println("Hello");
	
 response.setContentType("text/html");
PrintWriter pw=response.getWriter();

pw.println("hello");
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");

pw.println(s1+"  "+s2); 
}
}


//try
//{
//
//String url=getServletContext().getInitParameter("url");
//String usr=getServletContext().getInitParameter("user");
//String pass=getServletContext().getInitParameter("password");
//
//
//
//Class.forName(getServletContext.getInitParameter("driver"));
//Connection con=DriverManager.getConnection("url","usr","pass");
//}
//
//catch(ClassNotFoundException | SQLException cf)
//{
//	System.out.println("cf");
//}
//  pw.println(s1+" "+s2);
//  
//}