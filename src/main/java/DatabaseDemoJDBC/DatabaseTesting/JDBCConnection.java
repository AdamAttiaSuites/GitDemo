package DatabaseDemoJDBC.DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/Qadbt", "root",
				"Loloissa20@");

		 Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery("select * from EmployeeInfo where id = 22");

		while (rs.next()) {

			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("location"));
		}
	}

}
