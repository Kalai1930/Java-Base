package com.greenTechnology.InvoiceManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.greenTechnology.DBOperations.MainClass;

public class UpdateInvoice {
	
	public void update() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "update invoice set total_amt=? where invoice_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 1000);
			pst.setInt(2, 3);
			
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
