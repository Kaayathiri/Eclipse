package nationwide.db;
import java.sql.*;

public class jdbc {

public static void main(String[] args) {
	Connection conn= null;
	Statement stmt=null;
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost/nationwide","root","Lojinie1995.");
	stmt = conn.createStatement();
	stmt.executeUpdate("insert into school values (2, 'Peter', 45)");
	

	}
	catch (Exception se) {
		System.out.println(se.toString());
	}
	}
}


