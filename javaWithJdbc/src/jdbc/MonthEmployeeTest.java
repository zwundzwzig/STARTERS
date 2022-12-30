package jdbc;

import jdbc.ConnectionInform;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonthEmployeeTest {

	String getEmployees(int[] al) {
		return Arrays.toString(al);
	}

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			System.out.println("CONNECTING SUCCESS");
			System.out.println(con.getAutoCommit());

			System.out.print("Month : ");
			int month = new Scanner(System.in).nextInt();
			String sql = "SELECT MONTH(hire_date) month, avg(salary) avg from employees where month(hire_date) != ? GROUP BY MONTH(hire_date) order by 1;";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setInt(1, month);
			ResultSet rs = pt.executeQuery();

			ArrayList<int[]> al = new ArrayList<>();

			while (rs.next()) {
				int l = 0;
				int resultMonth = rs.getInt(1);
				double salary = rs.getDouble("avg");
				int[] o = { resultMonth, (int) salary };
				al.add(o);
				System.out.println(new MonthEmployeeTest().getEmployees(al.get(l)));
				l++;
				al.clear();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}
