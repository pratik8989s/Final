package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shopping.util.DBUtil;

public class ChangeAdminPassDao {
	
	
	public static String updateAdminPass(String oldpass,String newpass)
	{
		Connection con=null;
		PreparedStatement ps=null;
		String b = "false";
		try{
		  con = DBUtil.getDBCon(); 
		      
		
		 ps=con.prepareStatement("update admin set password=? where password=?");   
		ps.setString(1, oldpass);
		ps.setString(2, newpass);
		
		
		int result =ps.executeUpdate();
		
		 if(result!=0){
		    	b = "true";
		    	con.commit();
		    	return b;
		    }}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return b;
		
		
}
	

}
