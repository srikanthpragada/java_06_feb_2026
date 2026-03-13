<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area</title>
</head>
<body>
	<h2>Area :
		<%
        double radius = Double.parseDouble(request.getParameter("radius"));
        double area = Math.PI * radius * radius;
        out.println(String.format("%6.2f",area));
        %>
	</h2>
</body>
</html>