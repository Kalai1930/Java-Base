import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetStudents {
	public void retrive() {
		try {
			
			
			String query = "select * from student"; 
			
			Connection conn = MainClass.connect();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String email = rs.getString(4);
				String dept = rs.getString(5);
				
				System.out.println("ID: " + id
									+" Name: "+name
									+" Age: "+age
									+" email: "+email
									+" dept: "+dept);
				
			}
			rs.close();
			pst.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
		

}
