import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class BatchProcess {
	
	public void batch() {
		try {
	Connection conn = MainClass.connect();
	String query = "insert into student values(?,?,?,?,?)";
	PreparedStatement pst = conn.prepareStatement(query);
	
	pst.setInt(1, 112);
	pst.setString(2,"karpagam");
	pst.setInt(3, 31);
	pst.setString(4, "test12@gmail.com");
	pst.setString(5, "Tamil");
	pst.addBatch();
	
	pst.setInt(1, 113);
	pst.setString(2,"Kanmani");
	pst.setInt(3, 25);
	pst.setString(4, "test13@gmail.com");
	pst.setString(5, "bcom");
	pst.addBatch();
	
	pst.setInt(1, 114);
	pst.setString(2,"Pathu");
	pst.setInt(3, 22);
	pst.setString(4, "test14@gmail.com");
	pst.setString(5, "iti");
	pst.addBatch();
	
	int[] result = pst.executeBatch();
	System.out.println(Arrays.toString(result));
	conn.close();
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
