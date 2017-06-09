package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shopping.util.DBUtil;

public class UserDeleteFromWishlistDao {
	
	
public static void DeleteUserWishlist(String cid,String pid) {
		
		try {
			Connection con = DBUtil.getDBCon();
			PreparedStatement ps = con
					.prepareStatement("delete from mywishlist where product_id=? AND customer_id=?  ");
ps.clearParameters();
ps.setString(1, pid);
ps.setString(2, cid);
			 ps.executeUpdate();

			
			
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}
	

}
