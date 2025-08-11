<%@ page import="java.util.*, com.gcc.model.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="style.css">

<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        background-color: #f4f6f9;
        color: #333;
    }

    /* Header */
    header {
        background-color: #2c3e50;
        color: white;
        padding: 15px 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    header h1 {
        font-size: 20px;
        margin: 0;
    }

    .logout-btn {
        background-color: #e74c3c;
        color: white;
        padding: 8px 15px;
        border-radius: 5px;
        text-decoration: none;
        font-weight: bold;
        transition: 0.3s;
    }
    .logout-btn:hover {
        background-color: #c0392b;
    }

    /* Container */
    .container {
        max-width: 1200px;
        margin: 20px auto;
        padding: 20px;
        background: white;
        border-radius: 8px;
        box-shadow: 0 2px 6px rgba(0,0,0,0.1);
    }

    /* Table styling */
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 15px;
    }
    th, td {
        padding: 10px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #34495e;
        color: white;
    }
    tr:hover {
        background-color: #f1f1f1;
    }

    /* Buttons & Select */
    select {
        padding: 5px;
        border-radius: 4px;
        border: 1px solid #ccc;
    }
    button {
        background-color: #2980b9;
        color: white;
        border: none;
        padding: 6px 12px;
        border-radius: 4px;
        cursor: pointer;
    }
    button:hover {
        background-color: #1f6391;
    }

    /* Refresh link */
    .refresh-link {
        display: inline-block;
        margin-bottom: 10px;
        background-color: #27ae60;
        color: white;
        padding: 8px 12px;
        border-radius: 5px;
        text-decoration: none;
        font-weight: bold;
    }
    .refresh-link:hover {
        background-color: #1e8449;
    }
</style>
</head>
<body>

<header>
    <h1>Welcome Admin, <%= session.getAttribute("name") %></h1>
    <a href="logout" class="logout-btn">Logout</a>
</header>

<div class="container">
    <a href="viewComplaints" class="refresh-link">Refresh</a>

    <table>
        <tr>
            <th>ID</th>
            <th>User</th>
            <th>Flat</th>
            <th>Email</th>
            <th>Category</th>
            <th>Description</th>
            <th>Date</th>
            <th>Status</th>
            <th>Update</th>
        </tr>
        <% 
            List<Complaint> complaints = (List<Complaint>) request.getAttribute("complaints");
            if (complaints != null && !complaints.isEmpty()) {
                for (Complaint c : complaints) {
        %>
        <tr>
            <td><%= c.getId() %></td>
            <td><%= c.getUserName() %></td>
            <td><%= c.getUserFlat() %></td>
            <td><%= c.getUserEmail() %></td>
            <td><%= c.getCategory() %></td>
            <td><%= c.getDescription() %></td>
            <td><%= c.getDate() %></td>
            <td><%= c.getStatus() %></td>
            <td>
                <form action="updateStatus" method="post" style="margin:0;">
                    <input type="hidden" name="id" value="<%= c.getId() %>" />
                    <select name="status">
                        <option <%= "Pending".equals(c.getStatus()) ? "selected" : "" %>>Pending</option>
                        <option <%= "In Progress".equals(c.getStatus()) ? "selected" : "" %>>In Progress</option>
                        <option <%= "Resolved".equals(c.getStatus()) ? "selected" : "" %>>Resolved</option>
                    </select>
                    <button type="submit">Update</button>
                </form>
            </td>
        </tr>
        <% 
                }
            } else { 
        %>
        <tr>
            <td colspan="9" style="text-align:center;">No complaints found.</td>
        </tr>
        <% } %>
    </table>
</div>

</body>
</html>
