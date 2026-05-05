package com.greenTechnology.SalesManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.greenTechnology.DBOperations.MainClass;

public class DeleteSale {
	
public void delete() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "delete from sales where sale_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 1006);
			
			pst.executeUpdate();
			
			conn.close();
			pst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}
