package com.codewithluck.model;

public class Accept {
	private int id;
	private String fullName;
	private String consultername;	
	private String appoinDate;
	private String email;
	private String phNo;
	private String location;
	private String session;
	private String address;
	


	public Accept() {
		// TODO Auto-generated constructor stub
	}



	public Accept(int id, String fullName, String consultername, String appoinDate, String email, String phNo,
			String location, String session, String address) {
	
		this.id = id;
		this.fullName = fullName;
		this.consultername = consultername;
		this.appoinDate = appoinDate;
		this.email = email;
		this.phNo = phNo;
		this.location = location;
		this.session = session;
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getConsultername() {
		return consultername;
	}



	public void setConsultername(String consultername) {
		this.consultername = consultername;
	}



	public String getAppoinDate() {
		return appoinDate;
	}



	public void setAppoinDate(String appoinDate) {
		this.appoinDate = appoinDate;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhNo() {
		return phNo;
	}



	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getSession() {
		return session;
	}



	public void setSession(String session) {
		this.session = session;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
