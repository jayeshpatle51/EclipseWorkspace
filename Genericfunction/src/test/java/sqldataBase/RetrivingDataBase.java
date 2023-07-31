package sqldataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetrivingDataBase {

	String uname = "";
	String password = "1234";
	String host = "localhost";
	String port = "";

	public static List<List<String>> dataFromDatabase(String query, String port, String host, String password,
			String table, String[] col) {
		List<List<String>> st = new ArrayList<>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + table, "root",
					password);

			ResultSet rs = null;

			Statement st1 = con.createStatement();
			rs = st1.executeQuery(query);

			System.out.println(col.length);

			while (rs.next()) {

				List<String> list = new ArrayList<>();
				for (int i = 0; i < col.length; i++) {
					list.add(rs.getString(col[i]));
				}
				st.add(list);

			}

			return st;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;

	}

	@Test(dataProvider = "data")
	public void getData(String[] name) {
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
	}

	@DataProvider(name = "data")
	public String[][] dataProvider() {

		List<List<String>> list = dataFromDatabase("select * from Student", "3306", "localhost", "1234", "student",
				new String[] { "SNO", "FNAME", "MARKS" });
		String[][] arr = new String[list.size()][];

		int i = 0;
		for (List<String> l : list) {
			arr[i++] = l.toArray(new String[l.size()]);
		}

		return arr;

	}
}
