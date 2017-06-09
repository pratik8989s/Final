package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shopping.util.DBUtil;

public class DeleteProductDAO {
	public static boolean delete(String pid)
	{
		
		boolean status=false;  
		try{  
			
			 Connection con = DBUtil.getDBCon(); 
			 PreparedStatement ps1=con.prepareStatement(  "delete from order_details where PRODUCT_ID=?");
			 ps1.setString(1,pid); 
			 int result1 =ps1.executeUpdate();
			 PreparedStatement ps2=con.prepareStatement(  "delete from mycart where PRODUCT_ID=?");
			 ps2.setString(1,pid); 
			 int result2 =ps2.executeUpdate();
			 PreparedStatement ps3=con.prepareStatement(  "delete from mywishlist where PRODUCT_ID=?");
			 ps3.setString(1,pid);  
			 int result3 =ps3.executeUpdate();
			PreparedStatement ps4=con.prepareStatement(  "delete from PRODUCT1 where PRODUCT_ID=?");  
			ps4.setString(1,pid); 
			int result4 =ps4.executeUpdate();
			
			  if(result4!=0)  
			{
				 
		status=true;
		con.commit();
			}
			          
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
			return status;  
			}  
}

