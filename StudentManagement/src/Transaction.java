import java.sql.Connection;
import java.sql.PreparedStatement;

public class Transaction {
	
	public void trans() {
		Connection conn = MainClass.connect();
		try {
			String query1 = "insert into student values(?,?,?,?,?)";
			String query2 = "update student set age = ? where id = ?";
			conn.setAutoCommit(false);
			PreparedStatement insert = conn.prepareStatement(query1);
			insert.setInt(1,115);
			insert.setString(2, "Manimaran");
			insert.setInt(3, 25);
			insert.setString(4,"test15@gmail.com");
			insert.setString(5, "iti");
			
		insert.executeUpdate();
		
			PreparedStatement update = conn.prepareStatement(query2);
			update.setInt(1, 23);
			update.setInt(2, 115);
			update.executeUpdate();
			
			conn.commit();
			System.out.println("committed successfully");
		}
		
		catch(Exception e) {
			try {
				if(conn != null) {
					conn.rollback();
					System.out.println("Transaction failed");
				}
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}
			catch(Exception er) {
				er.printStackTrace();
			}
		}
	}

}
