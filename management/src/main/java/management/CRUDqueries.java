package management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDqueries {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	// open connection in the constructor - initialises everything
	public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
			this.stmt = conn.createStatement();// create a statement object to execute sql queries
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			System.out.println("Incorrect credentials");
			e.printStackTrace();
		}
	}

	
		// TODO Auto-generated method stub
		
	

	public void create(management man) {
		// TODO Auto-generated method stub
		String createStmt = "INSERT INTO staff( first_name, last_name, position, dob, pay) VALUES('" + man.getfirstName() +
				"','" + man.getlastName() + "','" + man.getposition()+ "','" + man.getdob() + "'," + man.getpay()+");";
		
try {
	stmt.executeUpdate(createStmt);
	System.out.println("Create statement executed");
} catch (SQLException e) {
	System.out.println("Bad query");
	e.printStackTrace();
}
	}
 
	public void read() {
		management m = null;
		
		// TODO Auto-generated method stub
		String readStmt = "SELECT * FROM staff;"; 
		try {
			rs = stmt.executeQuery(readStmt);
			while (rs.next()) { 
				
				System.out.println("staff_id: " + rs.getInt("staff_id"));
				System.out.println("first_name " + rs.getString("first_name"));
				System.out.println("last_name " + rs.getString("last_name"));
				System.out.println("position " + rs.getString("position"));
				System.out.println("dob " + rs.getString("dob"));
				System.out.println("pay " + rs.getInt("pay"));
			}

		} catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}

	public void update(int id, String updateIt) {
		String updateStmt = "UPDATE staff Set pay = '" + updateIt+ "' WHERE staff_id = " + id + ";";
		try {
			stmt.executeUpdate(updateStmt);
			System.out.println("Update statement executed");
			
		}catch (SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}
	public void closeConn() {
		// TODO Auto-generated method stub
		
	}
}
