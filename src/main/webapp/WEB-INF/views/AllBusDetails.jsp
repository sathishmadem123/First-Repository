<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.springwebapp.Bus" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Bus Details</title>
</head>
<body>
    <h1>Bus Details</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Bus Name</th>
                <th>Location</th>
                <th>Ticket Price</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Bus> buses = (List<Bus>) request.getAttribute("buses");
                if (buses != null) {
                    for (Bus bus : buses) {
            %>
            <tr>
            	<td><%= bus.getBusName() %></td>
                <td><%= bus.getLocation() %></td>
                <td><%= bus.getTicketPrice() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="4">No buses found</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
