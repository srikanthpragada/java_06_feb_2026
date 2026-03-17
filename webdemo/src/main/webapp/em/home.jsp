<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="menu.jsp" %>

<body>
  <h1>Summary</h1>
  <%
    int employeeCount = 5;
    int avgSalary = 2000000;
  %>
  
  <table cellpadding="5pt">
    <tr>
    <th style="text-align:left">Number of Employees </th>
    <td style="text-align:right"><%=employeeCount%>
    </td>
    </tr>
    <tr>
    <th style="text-align:left">Average Salary</th>
    <td style="text-align:right"><%=avgSalary%>
    </td>
    
  </table>
  
</body>
</html>