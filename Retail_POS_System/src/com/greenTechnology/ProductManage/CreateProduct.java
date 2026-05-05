package com.greenTechnology.ProductManage;

import java.sql.*;

import com.greenTechnology.DBOperations.MainClass;

public class CreateProduct {

	public void create() {
		try {
			Connection conn = MainClass.DbConnect();
			String query = "insert into product values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setInt(1, 003);
			pst.setString(2,"Fan");
			pst.setString(3, "Havells");
			pst.setInt(4, 1500);
			pst.setInt(5,60);
			
			int i = pst.executeUpdate();
			
			System.out.println("data inserted");
			
			conn.close();
			pst.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
