<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Resident Dashboard</title>
<link rel="stylesheet" href="style.css">
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: "Segoe UI", Tahoma, sans-serif;
        background-color: #f5f7fa;
        color: #333;
    }

    /* Header */
    header {
        background-color: #0056b3;
        color: white;
        padding: 15px 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        box-shadow: 0 2px 6px rgba(0,0,0,0.1);
    }

    header h1 {
        font-size: 22px;
        font-weight: 600;
    }

    /* Logout link */
    .logout-link {
        text-decoration: none;
        color: white;
        font-weight: 500;
        background-color: #d9534f;
        padding: 8px 14px;
        border-radius: 5px;
        transition: all 0.3s ease;
    }

    .logout-link:hover {
        background-color: #c9302c;
    }

    /* Dashboard Card */
    .dashboard-card {
        background: white;
        border-radius: 10px;
        box-shadow: 0 4px 15px rgba(0,0,0,0.06);
        max-width: 500px;
        margin: 50px auto;
        padding: 30px;
        text-align: center;
        transition: transform 0.2s ease;
    }

    .dashboard-card:hover {
        transform: translateY(-2px);
    }

    /* Welcome Text */
    .welcome-text {
        font-size: 20px;
        font-weight: 500;
        color: #0056b3;
        margin-bottom: 25px;
    }

    /* Navigation Links */
    .nav-links {
        display: flex;
        justify-content: space-around;
        gap: 10px;
    }

    .nav-links a {
        text-decoration: none;
        font-weight: 500;
        color: #0056b3;
        padding: 10px 16px;
        border-radius: 6px;
        background-color: #e9f2ff;
        transition: all 0.3s ease;
    }

    .nav-links a:hover {
        background-color: #0056b3;
        color: white;
    }
</style>
</head>
<body>

<header>
    <h1>Gated Community - Resident Dashboard</h1>
    <a href="logout" class="logout-link">Logout</a>
</header>

<div class="dashboard-card">
    <div class="welcome-text">
        Welcome, <%= session.getAttribute("name") %>
    </div>

    <div class="nav-links">
        <a href="addComplaint.jsp">Submit New Complaint</a>
        <a href="viewComplaints">My Complaints</a>
    </div>
</div>

</body>
</html>
