package com.greenTechnology.DBOperations;

import java.sql.*;


public class MainClass {
	
	public static Connection DbConnect() {
		Connection conn = null;
		try {
		String url = "jdbc:mysql://127.0.0.1:3306/retail";
		String username = "root";
		String password = "Mysql@123";
		
		conn = DriverManager.getConnection(url,username,password);
		
		if(conn != null) {
			System.out.println("successfully DB connected");
		}
		else{
			System.out.println("error while connecting DB");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//Metadata: Show sales table metadata
	public void salesTable() {
		Connection conn = DbConnect();
		try {
		DatabaseMetaData dbMeta = conn.getMetaData();
		ResultSet rs = dbMeta.getTables(null, null, "Sales", new String[] {"TABLE"});
		ResultSet col = dbMeta.getColumns(null, null, "Sales", null);
		ResultSet pk = dbMeta.getPrimaryKeys(null, null, "Sales");
		//Foriegn keys
		ResultSet fk = dbMeta.getImportedKeys(null, null, "Sales");
		if(rs.next()) {
			String tableName = rs.getString("TABLE_NAME");
			System.out.println("Table name: "+tableName);
			
			while(col.next()) {
				String colName = col.getString("COLUMN_NAME");
				String colType = col.getString("TYPE_NAME");
				
				System.out.println("Column_Name: "+colName+" Column_Type: "
						+colType);
			}
			while(pk.next()) {
				String pkey = pk.getString("COLUMN_NAME");
				System.out.println("Primary Key: "+pkey);
			}
			while(fk.next()) {
				String fkey = fk.getString("FKCOLUMN_NAME");
				String pkeyfk = fk.getString("PKTABLE_NAME");
				String pktable = fk.getString("PKCOLUMN_NAME");
				System.out.println("Foriegn Key: "+fkey+
						" ForiegnKey_pkTable: "+pktable+
						" Foriegnkey_pk: "+pkeyfk);
			}
			
		}
		else {
			System.out.println("Table does not exist");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DbConnect();
		
		//CRUD: Manage products, sales, invoices.
		
		//CreateSales obj1 = new CreateSales();
		//obj1.create();
		
		//DeleteSale obj2 = new DeleteSale();
		//obj2.delete();
		
		//UpdateInvoice obj3 = new UpdateInvoice();
		//obj3.update();
		
		//RetriveSale obj4 = new RetriveSale();
		//obj4.getvalues();
		
		//CreateInvoice in = new CreateInvoice();
		//in.create();
		
		//Transactions tran = new Transactions();
		//tran.transaction();
		
		//BatchProcess bat = new BatchProcess();
		//bat.batch();
		
		//ResultsetOperation rs = new ResultsetOperation();
		//rs.resultset();
		
		MainClass obj = new MainClass();
		obj.salesTable();
		
		
	}

}
