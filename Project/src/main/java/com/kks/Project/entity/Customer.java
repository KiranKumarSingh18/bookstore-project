package com.kks.Project.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity 

public class Customer {
	@Id

    @Column(name="cust_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;
	
    @Column(name="cust_name")
    private String customerName;
    
    @Column(unique = true)
    private String email;
    private String password;
    private char gender;

    @Column(name="mobile_no")
    private long mobileNumber;

   // private Date dob;

    @Column(name="address")

    private String address;

    public Customer() {}

	public Customer(int customerID, String customerName, String email, String password, char gender, long mobileNumber,
			String address) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
