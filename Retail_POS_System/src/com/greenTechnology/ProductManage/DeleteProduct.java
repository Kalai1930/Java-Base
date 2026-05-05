package com.greenTechnology.ProductManage;

import java.sql.*;

import com.greenTechnology.DBOperations.MainClass;

public class DeleteProduct {
	
	public void delete() {
		
		try {
			
			Connection conn = MainClass.DbConnect();
			String query = "delete from product where pro_id=?";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 2);
			
			pst.executeUpdate();
			
			conn.close();
			pst.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
