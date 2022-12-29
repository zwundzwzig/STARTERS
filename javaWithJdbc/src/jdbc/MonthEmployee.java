package jdbc;

import jdbc.ConnectionInform;
import java.util.*;
import java.sql.*;

public class MonthEmployee {

	ArrayList<String> getEmployees(String sql) throws ClassNotFoundException, SQLException {
		try (Scanner key = new Scanner(System.in)) {
			ArrayList<String> list = new ArrayList<>();
			System.out.print("except month : ");
			int inputMonth = key.nextInt();

			Class.forName(ConnectionInform.DRIVER_CLASS);
			Connection con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);

			PreparedStatement pt = con.prepareStatement(sql);
			pt.setInt(1, inputMonth);
			ResultSet rs = pt.executeQuery();

			while (rs.next()) {
				int outputMonth = rs.getInt("입사월");
				double avg = rs.getDouble("급여총합");
				list.add(outputMonth + "\t" + avg);
			}

			rs.close();
			pt.close();
			con.close();
			return list;
		}
	}

	public static void main(String[] args) {

		try {
			String sql = "select substr(hire_date, 6, 2) 입사월, sum(salary) 급여총합" + " from employees e"
					+ " where date_format(hire_date, '%m') != ?" + " group by 입사월" + " order by 입사월;";

			ArrayList<String> list = new MonthEmployee().getEmployees(sql);
			for (String o : list) {
				System.out.println(o);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
