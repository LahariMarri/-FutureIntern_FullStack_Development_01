package test;

import java.sql.*;

public class AddEmployeeDetailsDAO 
{
public int k=0;
public int insert(EmpBean eb)
{
	try
	{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into EmployeeDetails values(?,?,?,?)");
		ps.setString(1,eb.getId());
		ps.setString(2, eb.getName());
		ps.setFloat(3, eb.getSalary());
		ps.setString(4, eb.getAddress());
		k=ps.executeUpdate();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return k;
}
}
