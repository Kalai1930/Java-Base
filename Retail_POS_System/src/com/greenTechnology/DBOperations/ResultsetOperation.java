package com.greenTechnology.DBOperations;

import java.sql.*;

public class ResultsetOperation {
	
	public void resultset() {
		try {
			Connection conn = MainClass.DbConnect();
			PreparedStatement pst = conn.prepareStatement(
					"select * from product",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				rs.updateInt("price", 50);
				rs.updateRow();
			}
			System.out.println("Records update using result set");
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
