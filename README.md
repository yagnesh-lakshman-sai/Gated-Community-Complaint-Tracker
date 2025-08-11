# 🏢 Gated Community Complaint Tracker

A web-based Java application designed to help apartment residents submit, track, and manage complaints efficiently. Built using Java Servlets, JSP, and MySQL, the system provides separate interfaces for residents and administrators.

---

## 🚀 Features

### 👤 Resident
- Register and log in securely.
- Submit new complaints with category & description.
- View all submitted complaints and their status.

### 🛠️ Admin
- View all complaints from residents.
- Update complaint status (Pending, In Progress, Resolved).
- Manage user complaints efficiently.

---

## 🧑‍💻 Tech Stack

| Layer        | Technology                |
|--------------|---------------------------|
| Backend      | Java Servlets, JSP        |
| Frontend     | HTML5, CSS3 (Bootstrap)   |
| Database     | MySQL                     |
| Web Server   | Apache Tomcat             |
| Connectivity | JDBC                      |

---

## 🗃️ Project Folder Structure

'''GatedCommunityProject/
│
├── src/
│   └── com/flm/
│       ├── model/
│       │   ├── User.java
│       │   └── Complaint.java
│       ├── dao/
│       │   ├── UserDao.java
│       │   └── ComplaintDao.java
│       ├── servlet/
│       │   ├── LoginServlet.java
│       │   ├── LogoutServlet.java
│       │   ├── RegisterServlet.java
│       │   ├── AddComplaintServlet.java
│       │   ├── ViewComplaintsServlet.java
│       │   └── UpdateComplaintStatusServlet.java
│       └── utils/
│           ├── DBConnection.java
│           └── Constants.java
│
├── WebContent/
│   ├── index.html                  # Login Page
│   ├── register.html               # Registration Page
│   ├── adminDashboard.jsp          # Admin Home
│   ├── residentDashboard.jsp       # Resident Home
│   ├── addComplaint.jsp            # Complaint Submission
│   ├── viewComplaints.jsp          # Complaint Listing
│   ├── updateComplaintStatus.jsp   # Status Update
│   ├── style.css                   # Styling
│   │                  
│   └── images/                     # images
│
├── README.md
└── .gitignore'''


---

## ⚙️ Setup Instructions

### 1. Clone the Repository

git clone https://github.com/yagnesh-lakshman-sai/Gated-Community-Complaint-Tracker.git
2. Database Setup (MySQL)
Create a database named gated_community

Run DB/schema.sql to initialize tables

3. Configure Database Credentials
Update DB connection in UserDAO.java and ComplaintDAO.java:

String url = "jdbc:mysql://localhost:3306/gated_community";
String user = "root";
String password = "your_mysql_password";
4. Import Project to Eclipse/IntelliJ
As a Dynamic Web Project

Add JDBC jar to the classpath (lib/ folder)

5. Run on Apache Tomcat
Right-click → Run on Server → Tomcat

🧪 Demo Credentials
Admin 

Email: admin@gated.com

Password: admin123

(Insert into DB manually or via script)

📌 Use Cases
👨‍👩‍👧‍👦 Residents can raise and track their issues conveniently

👷 Admins can prioritize and resolve complaints efficiently

🔐 Secure login and session handling

📂 Organized complaint tracking for transparency


