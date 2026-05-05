package com.greenTechnology.DBOperations;

import java.sql.*;
import java.util.Arrays;

public class BatchProcess {
	
	//Batch: Add multiple items to a sale at once.
	public void batch() {
		Connection conn = null;
		try {
			conn = MainClass.DbConnect();
			String query = "insert into sales values (?,?,?,?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 1004);
			pst.setInt(2, 1);
			pst.setInt(3, 101);
			pst.setInt(4, 5);
			pst.setDate(6, Date.valueOf("2024-05-03"));
			pst.setInt(5, 300);
			pst.addBatch();
			
			pst.setInt(1, 1005);
			pst.setInt(2, 3);
			pst.setInt(3, 102);
			pst.setInt(4, 2);
			pst.setDate(6, Date.valueOf("2026-01-12"));
			pst.setInt(5, 3000);
			pst.addBatch();
			
			pst.setInt(1, 1006);
			pst.setInt(2, 4);
			pst.setInt(3, 104);
			pst.setInt(4, 10);
			pst.setDate(6, Date.valueOf("2025-08-23"));
			pst.setInt(5, 50);
			pst.addBatch();
			
			int[] i = pst.executeBatch();
			System.out.println(Arrays.toString(i));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
