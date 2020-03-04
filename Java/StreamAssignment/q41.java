package StreamAssignment;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;



public class q41 extends HttpServlet
{

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
Enumeration enum1=request.getHeaderNames();
while (enum1.hasMoreElements())
{
String hname=(String)enum1.nextElement();
String hvalue=request.getHeader(hname);
out.print(hname);
out.println(hvalue+"<br>");
}

}

}


