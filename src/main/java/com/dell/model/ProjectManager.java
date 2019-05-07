package com.dell.model;

public class ProjectManager {
	private int id;
	private String name;
	private String email;
	private String contactNumber;

	@Override
	public String toString() {
		return "ProjectManager [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ "]";
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
