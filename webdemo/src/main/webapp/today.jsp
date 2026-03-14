<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Today is :
		<%
	       out.println(java.time.LocalDate.now().toString());
	    %>
	</h1>
	
	<h2>
	  Current Time is : 
	   <%=java.time.LocalTime.now().toString() %>
	</h2>

</body>
</html>