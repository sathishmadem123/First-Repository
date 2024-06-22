<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Bus Entry Form</title>
	</head>
	<body>
		<h2>Please enter the Bus details</h2>
		<form:form method="POST" action = "addbus" modelAttribute = "bus">
			<table>
				<tr>
					<td><form:label path = "busName">Bus name</form:label></td>
					<td><form:input path = "busName"/></td>
				</tr>
				<tr>
					<td><form:label path = "location">Location</form:label></td>
					<td><form:input path = "location"></form:input></td>
				</tr>
				
				<tr>
					<td><form:label path = "ticketPrice">Ticket price</form:label></td>
					<td><form:input path = "ticketPrice"></form:input></td>
				</tr>
				
				<tr>
					<td><input type ="submit" value = "Submit"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>