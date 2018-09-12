package com.cg.bean;

public class Customer {
	private String name;
	private String city ;
	private String mobile;
	private String email ;
	private String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(String name, String city, String mobile, String email,
			String address) {
		super();
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
