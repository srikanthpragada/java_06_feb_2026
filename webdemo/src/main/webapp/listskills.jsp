<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Skills</title>
</head>
<body> 
	<h1>Skills</h1>

	<ul>
		<%
		TreeSet<String> skills = (TreeSet<String>) session.getAttribute("skills");

		for (String skill : skills) {
			out.println("<li>"  + skill + "</li>");
		}
		%>
	</ul>
</body>
</html>