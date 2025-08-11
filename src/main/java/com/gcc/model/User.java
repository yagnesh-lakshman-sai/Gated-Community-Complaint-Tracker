package com.gcc.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String flatNo;
    private String password;
    private String role;

    public User() {}

    public User(String name, String email, String flatNo, String password, String role) {
        this.name = name;
        this.email = email;
        this.flatNo = flatNo;
        this.password = password;
        this.role = role;
    }
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", flatNo=" + flatNo + ", password="
				+ password + ", role=" + role + "]";
	}
}

   