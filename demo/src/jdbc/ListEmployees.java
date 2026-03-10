package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class ListEmployees {

	public static void main(String[] args) {
		String url = "jdbc:sqlite:c:/courses/java/hr.db";

		try (Connection conn = DriverManager.getConnection(url)) {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setCommand("select * from employees");
			rowSet.execute(conn);
			
			while (rowSet.next()) {
	            int id = rowSet.getInt("emp_id");
	            String name = rowSet.getString("emp_name");
	            System.out.printf("%2d  %-20s\n", id, name);
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
