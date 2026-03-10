package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		String url = "jdbc:sqlite:c:/classroom/feb6/hr.db";

		try (Connection con = DriverManager.getConnection(url)) {
			System.out.println("Connected Successfully!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
