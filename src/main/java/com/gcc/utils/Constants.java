package com.gcc.utils;

public class Constants {
    public static final String URL = "jdbc:mysql://localhost:3306/gated_community";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Y@gne&h_2911";

    // User queries
    public static final String INSERT_USER = "INSERT INTO users (name, email, flat_no, password, role) VALUES (?, ?, ?, ?, ?)";
    public static final String GET_USER_BY_EMAIL = "SELECT * FROM users WHERE email=?";

    // Complaint queries
    public static final String INSERT_COMPLAINT = "INSERT INTO complaints (user_id, category, description, date, status) VALUES (?, ?, ?, ?, ?)";
    public static final String GET_COMPLAINTS_BY_USER = "SELECT * FROM complaints WHERE user_id=?";
    public static final String GET_ALL_COMPLAINTS = "SELECT c.id, c.user_id, c.category, c.description, c.date, c.status, u.name, u.email, u.flat_no FROM complaints c JOIN users u ON c.user_id = u.id ORDER BY c.date DESC";
    public static final String UPDATE_COMPLAINT_STATUS = "UPDATE complaints SET status=? WHERE id=?";
    public static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id=?";
}
