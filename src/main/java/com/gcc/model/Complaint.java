package com.gcc.model;

import java.sql.Date;

public class Complaint {
    private int id;
    private int userId;
    private String category;
    private String description;
    private Date date;
    private String status;

    // Additional helper fields for display
    private String userName;
    private String userEmail;
    private String userFlat;

    public Complaint() {}

    public Complaint(int userId, String category, String description, Date date, String status) {
        this.userId = userId;
        this.category = category;
        this.description = description;
        this.date = date;
        this.status = status;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFlat() {
		return userFlat;
	}

	public void setUserFlat(String userFlat) {
		this.userFlat = userFlat;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", userId=" + userId + ", category=" + category + ", description=" + description
				+ ", date=" + date + ", status=" + status + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userFlat=" + userFlat + "]";
	}
	}


