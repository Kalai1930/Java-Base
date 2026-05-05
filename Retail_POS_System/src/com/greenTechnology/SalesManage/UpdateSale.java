package com.greenTechnology.SalesManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.greenTechnology.DBOperations.MainClass;

public class UpdateSale {
	public void update() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "update sales set quantity_sold=?,sales_price=? where sale_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 5);
			pst.setInt(2, 300);
			pst.setInt(3, 1001);
			
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
