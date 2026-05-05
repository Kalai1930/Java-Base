import java.sql.*;

public class MainClass {
	
	public static Connection connect() {
		Connection conn = null;
		try {
		String url ="jdbc:mysql://127.0.0.1:3306/college";
		String username = "root";
		String password = "Mysql@123";
		
		conn = DriverManager.getConnection(url,username,password);
		/*
		 DatabaseMetaData db = conn.getMetaData(); System.out.println("DB Name : "+
		  db.getDatabaseProductName()); System.out.println("DB version : "+
		  db.getDatabaseProductVersion());
		  System.out.println("DriverName : "+db.getDriverName());
		  System.out.println("DriverVersion : "+db.getDriverVersion());
		  System.out.println("URL : "+db.getURL());
		  System.out.println("User : "+db.getUserName());
		 */
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		//CreateStudent obj = new CreateStudent();
		//obj.create();
		
		//UpdateStudent obj1 = new UpdateStudent();
		//obj1.update();
		
		//DeleteStudent obj2 = new DeleteStudent();
		//obj2.delete();
		
		//BatchProcess obj3 = new BatchProcess();
		//obj3.batch();
		
		//UpdateResultset obj4 = new UpdateResultset();
		//obj4.ressultSet();
		
		//connect();
		
		//Transaction obj5 = new Transaction();
		//obj5.trans();
		
		GetStudents obj6 = new GetStudents();
		obj6.retrive();
	}

}
