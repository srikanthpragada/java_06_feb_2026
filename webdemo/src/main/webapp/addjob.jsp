<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.sql.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Job</title>

</head>
<body>
<h1>Add Job</h1>
	<form action="addjob.jsp">
		Job Id <br /> <input type="text" name="jobid" style="width: 150px"
			required />
		<p></p>
		Job Title <br /> <input type="text" name="jobtitle"
			style="width: 150px" required />
		<p></p>
		Min Salary<br /> <input type="number" name="minsal"
			style="width: 150px" />
		<p></p>
		Max Salary <br /> <input type="number" name="maxsal"
			style="width: 150px" />
		<p></p>
		<input type="submit" value="Submit" />
	</form>

	<%
	String id = request.getParameter("jobid");
	if (id == null)
		return;
	
	String title = request.getParameter("jobtitle");
	String minSal = request.getParameter("minsal");
	String maxSal = request.getParameter("maxsal");

	Class.forName("com.mysql.cj.jdbc.Driver");
	try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fg", "root", "mysql")) {
		PreparedStatement ps = con.prepareStatement("insert into jobs values(?,?,?,?)");
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setInt(3, Integer.parseInt(minSal));
		//ps.setNull(3, Types.NUMERIC); // set parameter to null 
		ps.setInt(4, Integer.parseInt(maxSal));
	    ps.executeUpdate(); // Execute DML 
		ps.close();
		out.println("<h3>Job Added Successfully!!</h3>");
	} // try
	catch (Exception ex) {
		System.out.println(ex.getMessage());
		out.println("<h4>Sorry! Could not add job due to error!</h4");
	}
	%>
</body>
</html>