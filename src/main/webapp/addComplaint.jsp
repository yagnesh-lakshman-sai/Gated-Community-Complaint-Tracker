<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Submit Complaint</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<header>
    <h1>Gated Community</h1>
</header>

<div class="container">
    <h3>Submit Complaint</h3>
    
    <form action="addComplaint" method="post">
        <label for="category">Category</label>
        <select id="category" name="category" required>
            <option value="Plumbing">Plumbing</option>
            <option value="Electricity">Electricity</option>
            <option value="Security">Security</option>
            <option value="Maintenance">Maintenance</option>
        </select>

        <label for="description">Description</label>
        <textarea id="description" name="description" rows="5" required placeholder="Describe your complaint..."></textarea>

        <button type="submit">Submit</button>
    </form>

    <p><a href="residentDashboard.jsp"> Back to Dashboard</a></p>
</div>

</body>
</html>
