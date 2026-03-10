package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
public class UpdateEmployeeSalary {
 	public static void main(String[] args) {
		String url = "jdbc:sqlite:c:/courses/java/hr.db";
		try (Connection conn = DriverManager.getConnection(url)) {
			var employeeId = 1;
			var newSalary = 2000000;
			var ps = conn.prepareStatement("update employees set emp_salary = ? where emp_id = ?");
			ps.setInt(1, newSalary);
			ps.setInt(2, employeeId);
			
			int count = ps.executeUpdate();
			if(count == 1)
				System.out.println("Updated Successfully!");
			else
				System.out.println("Employee Id Not Found!");
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
