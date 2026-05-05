import java.sql.*;


public class CreateStudent {
	
	
	public void create() {
		
		
	try {
		
		String query = "insert into student values(?,?,?,?,?)";
		
		Connection conn = MainClass.connect();
		PreparedStatement pst = conn.prepareStatement(query);
		
		pst.setInt(1, 103);
		pst.setString(2,"bharati");
		pst.setInt(3, 25);
		pst.setString(4, "test3@gmail.com");
		pst.setString(5, "eee");
		
		int i = pst.executeUpdate();
		conn.close();
		System.out.println(i);
		if(i > 0) {
			System.out.println("data inserted");
		}
		else {
			System.out.println("data not inserted");
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	
}
