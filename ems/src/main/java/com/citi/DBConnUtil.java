import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnUtil {
public static void main(String[] args) throws Exception{
	try {
		Class.forName("org.h2.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection conn = null;
	try {
		conn = DriverManager.getConnection("jdbc:h2:~/employeedb","sa","");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(conn);
	Statement statement = null;
	try {
statement	 = conn.createStatement();

		int i = statement.executeUpdate("INSERT INTO tutorials_tbl  VALUES (2, 'spring', 'prasad')");
		//System.out.println(i);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	statement.close();
	statement = conn.createStatement();
	ResultSet re = statement.executeQuery("select * from tutorials_tbl");
	
	while(re.next()) {
		System.out.println(re.getInt(1));
		System.out.println(re.getString(2));
		System.out.println(re.getString(3));
	}
	
	}
}
