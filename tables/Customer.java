package com.kkk.bookstore.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id

    @Column(name="cust_id")

    private int customerID;

    

    @Column(name="cust_name")

    private String customerName;

    


    private String email;

    

    

    private String password;

    

    

    private char gender;

    

    @Column(name="mobile_no")

    private long mobileNumber;

    

    

    private Date dob;

    

    @Column(name="house_no")

    private int houseNo;

    

    @Column(name="street_name")

    private String streetName;

    

    

    private String city;

    


    private String state;

    

    @Column(name="pin_code")

    private int pinCode;

    


    private String country;

    

    public Customer() {}



	public Customer(int customerID, String customerName, String email, String password, char gender, long mobileNumber,
			Date dob, int houseNo, String streetName, String city, String state, int pinCode, String country) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}



	public int getCustomerID() {
		return customerID;
	}



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public int getHouseNo() {
		return houseNo;
	}



	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}



	public String getStreetName() {
		return streetName;
	}



	public void setStreetName(String streetName) {
		this.streetName = streetName;
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



	public int getPinCode() {
		return pinCode;
	}



	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

 
}
