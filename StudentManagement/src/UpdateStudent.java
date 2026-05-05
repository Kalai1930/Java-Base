import java.sql.*;
public class UpdateStudent {
	
	public void update() {
	try {
		
		
		String query = "update student set name=?,age=? where id=?"; 
		
		Connection conn = MainClass.connect();
		PreparedStatement pst = conn.prepareStatement(query);
		
		pst.setString(1, "Barathi");
		pst.setInt(2, 23);
		pst.setInt(3, 103);
		
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
