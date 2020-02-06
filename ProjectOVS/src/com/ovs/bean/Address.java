package com.ovs.bean;

public class Address {

	private String houseNo;
	private String street;
	private String block;
	private String district;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
	}
	public Address(String houseNo, String street, String block, String district, String city, String state,
			String country) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.block = block;
		this.district = district;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return "Address [houseNo=" + houseNo + ", Street=" + street + ", block=" + block + ", district=" + district
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
