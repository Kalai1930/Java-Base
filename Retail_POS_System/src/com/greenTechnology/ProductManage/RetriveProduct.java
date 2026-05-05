package com.greenTechnology.ProductManage;

import java.sql.*;

import com.greenTechnology.DBOperations.MainClass;

public class RetriveProduct {
	
	public void getvalues() {
	try {
		Connection conn = MainClass.DbConnect();
		String query = "select * from product";
		PreparedStatement pst = conn.prepareStatement(query);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println("Product ID: "+rs.getInt("pro_id")+" Product_name: "+rs.getString("pro_name")+
					" Brand: "+rs.getString("brand")+" Price: "+rs.getInt("price")+" Stock quantity: "
					+rs.getInt("stock_quantity"));
		}
		conn.close();
		pst.close();
		rs.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}
