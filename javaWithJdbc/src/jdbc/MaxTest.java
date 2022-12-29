package jdbc;

import jdbc.ConnectionInform;
import java.sql.*;

public class MaxTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			System.out.println("CONNECTING SUCCESS");
			System.out.println(con.getAutoCommit());
			st = con.createStatement();

			String sql = "CREATE TABLE maxtest (a int);";
			int rowCount = st.executeUpdate(sql);
			System.out.println(rowCount);

			con.close();
			System.out.println("CONNECT CLOSE");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("CLASS NOT FOUND");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("====" + e.getLocalizedMessage() + "=====");
//			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			try {
				
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getLocalizedMessage() + "SQL PROBLEM");
				e.printStackTrace();
			}
		}

	}

}
