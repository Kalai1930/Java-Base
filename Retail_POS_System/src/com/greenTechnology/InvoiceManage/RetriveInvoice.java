package com.greenTechnology.InvoiceManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.greenTechnology.DBOperations.MainClass;

public class RetriveInvoice {
	
	public void getvalues() {
		try {
			Connection conn = MainClass.DbConnect();
			String query = "select * from invoice";
			PreparedStatement pst = conn.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("Invoice ID: "+rs.getInt(1)+" Invoice_name: "+rs.getString(2)+
						" Bill_amt: "+rs.getInt(3));
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
