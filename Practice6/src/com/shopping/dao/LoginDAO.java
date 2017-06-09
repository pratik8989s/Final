	package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shopping.util.DBUtil;

public class LoginDAO {
	public static boolean validate(String uname,String upass){  
		boolean status=false;  
		try{  
		
		 Connection con = DBUtil.getDBCon(); 
		      
		PreparedStatement ps=con.prepareStatement(  "select email_id, password from customer1 where email_id=? and PASSWORD=?");  
		ps.setString(1,uname);  
		ps.setString(2,upass);  
		ResultSet rs=ps.executeQuery();  
		
		if(rs.next())
		{
			status=true;
		}
		else
		{
			status=false;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		return status;  
		}  

}

