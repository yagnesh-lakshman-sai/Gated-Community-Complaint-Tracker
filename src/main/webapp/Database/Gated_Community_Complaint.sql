CREATE DATABASE gated_community;
USE gated_community;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    flat_no VARCHAR(50),
    password VARCHAR(100) NOT NULL,
    role ENUM('admin', 'resident') NOT NULL DEFAULT 'resident'
);


CREATE TABLE complaints (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    category VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    date DATE NOT NULL,
    status ENUM('Pending', 'In Progress', 'Resolved') DEFAULT 'Pending',
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);


INSERT INTO users (name, email, flat_no, password, role) VALUES
('Yagnesh Admin', 'yagnesh.admin@gated.com', NULL, 'Y@gne&h_2911', 'admin'),
('Rahul Sharma', 'rahul.sharma@example.com', 'C-101', 'rahul123', 'resident'),
('Priya Verma', 'priya.verma@example.com', 'D-202', 'priya123', 'resident');



INSERT INTO complaints (user_id, category, description, date, status) VALUES
(2, 'Plumbing', 'Water leakage in kitchen sink', '2025-08-01', 'Pending'),
(2, 'Security', 'Unauthorized visitor entry', '2025-08-05', 'In Progress'),
(3, 'Electricity', 'Frequent power cuts in evening', '2025-08-07', 'Resolved');
