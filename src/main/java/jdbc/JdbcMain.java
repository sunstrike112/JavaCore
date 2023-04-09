package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {

	static final String DB_URL = "jdbc:mysql://localhost/javacore102022";
	static final String USER = "root";
	static final String PASS = "123456";
	static final String QUERY = "SELECT *FROM building";

		public static void main(String[] args) {
//		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(QUERY);) {
//			while (rs.next()) {
//				System.out.print("Name: " + rs.getString("name"));
//				System.out.print(", Street: " + rs.getString("street"));
//				System.out.print(", District: " + rs.getString("district"));
//				System.out.print(", Ward: " + rs.getString("ward"));
//				System.out.println(", FloorArea: " + rs.getString("floorarea"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

//		try {
//			System.out.println("1");
//			System.out.println("2");
//			System.out.println("3");
//			System.out.println(10/0);
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Lỗi thiếu file JAR driver");
//		} catch (Exception e) {
//			System.out.println("Lỗi exception");
//		}

			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				System.out.print("Name: " + rs.getString("name"));
				System.out.print(", Street: " + rs.getString("street"));
				System.out.print(", District: " + rs.getString("district"));
				System.out.print(", Ward: " + rs.getString("ward"));
				System.out.println(", FloorArea: " + rs.getString("floorarea"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
