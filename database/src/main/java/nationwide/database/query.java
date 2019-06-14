package nationwide.database;
import java.sql.*;

public class query {

	public static void main(String[] args) {
		Connection conn= null;
		Statement stmt=null;
		
try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/nationwide","root","Lojinie1995.");
		stmt = conn.createStatement();
		stmt.executeUpdate("insert into school2 values (1, 'Peter', 45)");
		stmt.executeUpdate("insert into school2 values (2 ,'John', 60)");
		stmt.executeUpdate("insert into school2 values (3, 'Bob', 90)");
		ResultSet RS= stmt.executeQuery("Select * from school2");
		while (RS.next()) {
			System.out.println(RS.getInt("regno") + "..."+RS.getString("name") +"..."+RS.getInt("marks"));
		}
		

	}
catch(Exception se) {
		System.out.println(se.toString());
	}
	}
}
