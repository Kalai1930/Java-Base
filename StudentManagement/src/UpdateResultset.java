import java.sql.*;

public class UpdateResultset {
	
	public void ressultSet() {
		try {
			Connection conn = MainClass.connect();
			PreparedStatement pst = conn.prepareStatement(
					"select * from student",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE
					);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				//rs.deleteRow();
				rs.updateString("dept", "math");
				rs.updateRow();
			}
			System.out.println("Records update using result set");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
