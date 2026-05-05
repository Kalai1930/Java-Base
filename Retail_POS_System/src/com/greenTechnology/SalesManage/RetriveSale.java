package com.greenTechnology.SalesManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.greenTechnology.DBOperations.MainClass;

public class RetriveSale {
	
	public void getvalues() {
		try {
			Connection conn = MainClass.DbConnect();
			String query = "select * from sales";
			PreparedStatement pst = conn.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Sales ID: "+rs.getInt("sale_id")+" Product_id: "+rs.getInt("product_id")+
						" Invoice_Id: "+rs.getInt("invoice_id")+" Quantity_sold: "+rs.getInt("quantity_sold")+
						" Sales_price: "+rs.getInt("sales_price")+" Sales_date: "+rs.getDate("sales_date"));
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
