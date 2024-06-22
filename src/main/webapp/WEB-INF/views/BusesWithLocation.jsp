<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<%@ page import="com.springwebapp.Bus"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buses</title>
</head>
<body>
	<h2>Buses Available at Location: ${location}</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Bus Name</th>
				<th>Ticket Price</th>
			</tr>
		</thead>
		<tbody>
			<% List<Bus> buses = (List<Bus>) request.getAttribute("buses");
			if (buses != null) {
				for (Bus bus : buses) { %>
			<tr>
				<td><%=bus.getBusName()%></td>
				<td><%=bus.getTicketPrice()%></td>
			</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td colspan="4">No buses found</td>
			</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>