package com.greenTechnology.InvoiceManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.greenTechnology.DBOperations.MainClass;

public class DeleteInvoice {
	
public void delete() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "delete from invoice where invoice_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 104);
			
			pst.executeUpdate();
			
			conn.close();
			pst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
