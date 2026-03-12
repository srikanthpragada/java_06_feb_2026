package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		try (Connection con = Database.getConnection()) {
			System.out.println("Connected Successfully!");
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());
		}
	}

}
