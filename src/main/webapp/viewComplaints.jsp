<%@ page import="java.util.*, com.gcc.model.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Complaints</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<header>
    <h1>Gated Community - My Complaints</h1>
</header>

<div class="container">
    <p>
        <a href="residentDashboard.jsp">Back to Dashboard</a> | 
        <a href="logout">Logout</a>
    </p>

    <h2>Complaint List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Category</th>
            <th>Description</th>
            <th>Date</th>
            <th>Status</th>
        </tr>
        <%
            List<Complaint> complaints = (List<Complaint>) request.getAttribute("complaints");
            if (complaints != null && !complaints.isEmpty()) {
                for (Complaint c : complaints) {
        %>
        <tr>
            <td><%= c.getId() %></td>
            <td><%= c.getCategory() %></td>
            <td><%= c.getDescription() %></td>
            <td><%= c.getDate() %></td>
            <td><%= c.getStatus() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">No complaints found.</td>
        </tr>
        <% } %>
    </table>
</div>

</body>
</html>
