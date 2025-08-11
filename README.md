# 🏢 Gated Community Complaint Tracker

A web-based Java application designed to help apartment residents submit, track, and manage complaints efficiently. Built using Java Servlets, JSP, and MySQL, the system provides separate interfaces for residents and administrators.

---

## 🚀 Features

### 👥 Resident Module
- 🔐 **Register / Login** securely
- 📝 **Submit complaints** (water, electricity, security, etc.)
- 🔄 **Update or cancel** submitted complaints
- 📊 **Track status** (Pending / In Progress / Resolved)
- 📜 **View complaint history**

### 🛠 Admin Module
- 🔐 **Admin Login**
- 📋 **View all complaints**
- ✅ **Update complaint statuses**

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

GatedComplaintTracker/
│
├── src/main/java/
│   └── com/flm/
│       ├── model/
│       │   ├── User.java
│       │   └── Complaint.java
│       │
│       ├── dao/
│       │   ├── UserDao.java
│       │   └── ComplaintDao.java
│       │
│       ├── servlet/
│       │   ├── LoginServlet.java
│       │   ├── LogoutServlet.java
│       │   ├── RegisterServlet.java
│       │   ├── AddComplaintServlet.java
│       │   ├── ViewComplaintsServlet.java
│       │   └── UpdateComplaintStatusServlet.java
│       │
│       └── utils/
│           ├── DBConnection.java
│           └── Constants.java
│
├── src/main/webapp/
│   ├── index.html                  // Login page
│   ├── register.html               // Registration page
│   ├── adminDashboard.jsp          // Admin homepage
│   ├── residentDashboard.jsp       // Resident homepage
│   ├── addComplaint.jsp            // Form for residents to submit complaint
│   ├── viewComplaints.jsp          // List complaints – shared for both roles
│   ├── updateComplaintStatus.jsp   // Form for admin to change status
│   └── WEB-INF/                     // Deployment descriptor
|
│        └── web.xml
│                        │
├── database/
│   └── schema.sql                  // DB creation & table script
│
├── lib/
│   └── mysql-connector-java.jar    // JDBC driver
│
├── .gitignore
└── README.md

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


