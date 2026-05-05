package com.greenTechnology.ProductManage;

import java.sql.*;

import com.greenTechnology.DBOperations.MainClass;

public class UpdateProduct {
	
	public void update() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "update Product set stock_quantity=? where pro_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 40);
			pst.setInt(2, 003);
			
			int i = pst.executeUpdate();
			if(i > 0) {
				System.out.println("Values udpated successfully");
			}
			else {
				System.out.println("values are not updateed");
			}
			
			conn.close();
			pst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
