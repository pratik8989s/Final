package com.shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shopping.beans.OrderBean;
import com.shopping.util.DBUtil;

public class OrderDAO {
	public boolean pay(OrderBean ob)
	{
		boolean b = false;
		try{
			
			  Connection con = DBUtil.getDBCon(); 		
			String st="SuccessFull";
			PreparedStatement pstat = con.prepareStatement("insert into ORDER_DETAILS values(order_seq.nextval,sysdate,?,?,?,?)");
	
		
		//pstat.setString(1, ob.getStatus());
		pstat.setString(1, ob.getMode());
		pstat.setString(2, st);
		pstat.setString(3, ob.getPid());
		pstat.setString(4, ob.getCid());
		
		
		int result =pstat.executeUpdate();
		
		 if(result>0){
		    	b = true;
		    	con.commit();
		    }}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return b;
	
}
}

