package com.ovs.bean;

import java.sql.Date;

public class Person {

	private String id;
	private String name;
	private Date dob;
	private String contactNo;
	private String emailId;
	private String password;
	private Address address;
	public Person() {
	}
	public Person(String id, String name, Date dob, String contactNo, String emailId, String password,
			Address address) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + ", contactNo=" + contactNo + ", emailId="
				+ emailId + ", password=" + password + ", address=" + address + "]";
	}
	
}
