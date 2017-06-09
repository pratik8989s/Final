
package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shopping.util.DBUtil;

public class AdminDAO {
	
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		
		 Connection con = DBUtil.getDBCon(); 
		      
		PreparedStatement ps=con.prepareStatement("select email_id,password from admin where email_id=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		ResultSet rs=ps.executeQuery();  
		
		status=rs.next();  
		          
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		return status;  
		}  

}

