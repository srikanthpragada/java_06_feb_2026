<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interest</title>
</head>
<body>
	<form>
		<h1>Interest Calculation</h1>
		Amount <br /> <input type="number" name="amount"
			value="${param.amount}" required />
		<p></p>
		Interest Rate <br /> <input type="number" name="rate"
			value="${param.rate}" required />
		<p></p>
		<input type="submit" value="Calculate" />
	</form>

	<%
	String samount = request.getParameter("amount");
	if (samount == null) // first request - no data and no process
		return; // Stop JSP's execution 

	String srate = request.getParameter("rate");

	int amount = Integer.parseInt(samount);
	int rate = Integer.parseInt(srate);

	int interest = amount * rate / 100;
	out.println("<h2>" + interest + "</h2>");
	%>
</body>
</html>