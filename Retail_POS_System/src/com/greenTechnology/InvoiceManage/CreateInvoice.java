package com.greenTechnology.InvoiceManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.greenTechnology.DBOperations.MainClass;

public class CreateInvoice {
	
	public void create() {
		try {
			Connection conn = MainClass.DbConnect();
			String query = "insert into invoice values (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 104);
			pst.setString(2,"INV-20251108-010");
			pst.setInt(3, 1223);
		
			
			int i = pst.executeUpdate();
			if(i>0) {
			System.out.println("data inserted");
			}
			
			conn.close();
			pst.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
