package com.codewithluck.model;

public class AdminConsulter {
	
	private int id;
	private String firstName;
	private String lastName;
	private String country;
	private String email;
	private String jobField;
	private String date;
	private String time;

	public AdminConsulter() {
		// TODO Auto-generated constructor stub
	}

	public AdminConsulter(int id, String firstName, String lastName, String country, String email, String jobField,
			String date, String time) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.email = email;
		this.jobField = jobField;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobField() {
		return jobField;
	}

	public void setJobField(String jobField) {
		this.jobField = jobField;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
