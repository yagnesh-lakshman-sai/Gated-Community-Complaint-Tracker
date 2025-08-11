<%@ page import="java.sql.*, com.gcc.utils.DBConnection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String complaintId = request.getParameter("id");
    String currentStatus = "";
    String description = "";

    try {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT status, description FROM complaints WHERE id=?");
        ps.setInt(1, Integer.parseInt(complaintId));
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            currentStatus = rs.getString("status");
            description = rs.getString("description");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Complaint Status</title>
</head>
<body>
<h2>Update Complaint Status</h2>
<p><strong>Complaint ID:</strong> <%= complaintId %></p>
<p><strong>Description:</strong> <%= description %></p>
<form action="updateComplaintStatus" method="post">
    <input type="hidden" name="id" value="<%= complaintId %>">
    <label for="status">Status:</label>
    <select name="status" id="status">
        <option value="Pending" <%= "Pending".equals(currentStatus) ? "selected" : "" %>>Pending</option>
        <option value="In Progress" <%= "In Progress".equals(currentStatus) ? "selected" : "" %>>In Progress</option>
        <option value="Resolved" <%= "Resolved".equals(currentStatus) ? "selected" : "" %>>Resolved</option>
    </select>
    <br><br>
    <input type="submit" value="Update">
</form>
<br>
<a href="viewComplaints">Back to Complaints</a>
</body>
</html>
