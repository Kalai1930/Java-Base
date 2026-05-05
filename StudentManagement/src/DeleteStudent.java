import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

	public void delete() {
		try {
			String query = "delete from student where id=?"; 
			
			Connection conn = MainClass.connect();
			PreparedStatement pst = conn.prepareStatement(query);
			
			
			pst.setInt(1, 101);
			
			
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
			
		}
	}
}
