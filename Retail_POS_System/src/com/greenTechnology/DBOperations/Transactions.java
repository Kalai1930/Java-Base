package com.greenTechnology.DBOperations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {
	//Transactions: Checkout = insert into sales + reduce inventory + insert into invoice.
	public void transaction() {
		Connection conn = null;
		try {
			conn = MainClass.DbConnect();
			conn.setAutoCommit(false);
			String query1 = "insert into sales values (?,?,?,?,?,?)";
			String query2 = "delete from invoice where invoice_id=?";
			String query3 = "insert into invoice values (?,?,?)";
			
			PreparedStatement insSal = conn.prepareStatement(query1);
			insSal.setInt(1, 1003);
			insSal.setInt(2, 1);
			insSal.setInt(3, 101);
			insSal.setInt(4, 5);
			insSal.setDate(6, Date.valueOf("2024-05-03"));
			insSal.setInt(5, 300);
			
			insSal.executeUpdate();
			
			PreparedStatement delInv = conn.prepareStatement(query2);
			delInv.setInt(1, 103);
			
			delInv.executeUpdate();
			
			PreparedStatement insInv = conn.prepareStatement(query3);
			insInv.setInt(1, 104);
			insInv.setString(2, "INV-20250823-012");
			insInv.setInt(3, 3000);
			
			insInv.executeUpdate();
			
			conn.commit();
			System.out.println("commited successfully");
		}
		catch(Exception e) {
			try {
			if(conn !=null) {
				conn.rollback();
				System.out.println("Transaction failed");
				conn.close();	
			}
			
		}
		 catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	}

}
