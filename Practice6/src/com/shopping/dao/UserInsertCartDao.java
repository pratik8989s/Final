package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shopping.util.DBUtil;

public class UserInsertCartDao {
	
public static void InsertUserCart(String cid,String pid) {
		
		try {
			Connection con = DBUtil.getDBCon();
			PreparedStatement ps = con
					.prepareStatement("insert into mycart values(?,?) ");
ps.clearParameters();
ps.setString(1, cid);
ps.setString(2, pid);
			 ps.executeUpdate();

			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
