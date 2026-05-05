package com.greenTechnology.SalesManage;

import java.sql.*;

import com.greenTechnology.DBOperations.MainClass;

public class CreateSales {
	
	public void create() {
		try {
			Connection conn = MainClass.DbConnect();
			String query = "insert into sales values (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 1003);
			pst.setInt(2, 1);
			pst.setInt(3, 101);
			pst.setInt(4, 5);
			pst.setDate(6, Date.valueOf("2024-05-03"));
			pst.setInt(5, 300);
		
			
			int i = pst.executeUpdate();
			if(i>0)
			System.out.println("data inserted");
			
			conn.close();
			pst.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
