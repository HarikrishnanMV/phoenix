import java.sql.*;

class jdbc1 
{
	public static void main(String atgs[]) throws SQLException
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localHost:3306/hari","root","root");
			System.out.println("Connected");
		     
			PreparedStatement ps=con.prepareStatement("insert into Krishnan values(?,?,?,?,?)");
			
		      ps.setInt(1,100);
		      ps.setString(2,"thilaka");
		      ps.setFloat(3,50000);
		      ps.setFloat(4,78687);
		      ps.setInt(5,88);
			  ps.executeUpdate();
			  ps.close();
			  
			  ps=con.prepareStatement("select * from Krishnan");
			  ResultSet rs=ps.executeQuery();
		         
		        while(rs.next())
		         {
		        	 System.out.println(rs.getInt("eno"));
		        	 System.out.println(rs.getString("ename"));
		        	 System.out.println(rs.getFloat("esalary"));
		         }
		     
		}
		catch(SQLException | ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutoCommit(false);
			con.commit();
		
		}
		
	    
		
	}

}
