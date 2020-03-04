package StreamAssignment;
/*
import java.sql.*;
public class PeriodicTable
{
    public static void main(String[] args) throws Exception
    {
    Connection con;
    ResultSet rs;
    Statement t;
    PreparedStatement pr;
    Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","root");
    char ch=args[0].charAt(0);
    switch(ch)
    {
        case 'R':
            t=con.createStatement();
            rs=t.executeQuery("select * from element");
            while(rs.next())
            {
                System.out.println("name="+rs.getString(2));
                System.out.println("atomicnumber="+rs.getInt(1));
                System.out.println("chemicalsymbol="+rs.getString(3));
            }
            break;
        case 'D':
            String name=args[1];
            t=con.createStatement();
            t.executeUpdate("delete from element where name='"+name+"'");
            break;
        case 'U':
            name=args[1];
            int awt=Integer.parseInt(args[2]);
            String sm=args[3];
            t=con.createStatement();
            t.executeUpdate("update element set atomicweight="+awt+",chemicalsymbol="+sm+" where name="+name+" ");
            break;
    }
    }
    
  }
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PeriodicTable
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String c=s.nextLine();		
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/deep","root","root");
				switch(c) 
				{
				case "I":
				int f =s.nextInt();
				String str=s.nextLine();
				String strr=s.nextLine();	
				PreparedStatement ps=con.prepareStatement("insert into element values(?,?,?)");
				ps.setInt(1, f);
				ps.setString(2, str);
				ps.setString(3, strr);
				int i=ps.executeUpdate();
				  if(i>0)
				   {
					   System.out.println("Successfully inserted");
				   }
				break;
				case "R":
				     Statement st=con.createStatement();
				 	ResultSet rs=  st.executeQuery("select * from element");
				 	while(rs.next())
				 	{
				 		System.out.println(rs.getInt(1));
				 		System.out.println(rs.getString(2));
				 		System.out.println(rs.getString(3));
				 	}
				break;
				case "U":
					int f1 =s.nextInt();
					String str1=s.nextLine();
					String strr1=s.nextLine();
					PreparedStatement p=con.prepareStatement("update element set atomicweight=?,name=? where chemicalsymbol=?");
					p.setInt(1, f1);
					p.setString(2, str1);
					p.setString(3, strr1);
					p.executeUpdate();
				break;
				case "D":
					String strr2=s.nextLine();
					PreparedStatement ps1=con.prepareStatement("delete from element where chemicalsymbol=?");
					  ps1.executeQuery();
					  ps1.setString(3, strr2);
					  System.out.println("Successfully ");
				break;	  
				}
			}
			catch(Exception e)
			{
				
			}
	
	}

}
