package com.kks.bookpro.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	@Id

    @Column(name="cust_id")

    private int customer_ID;

    

    @Column(name="cust_name")

    private String customer_Name;

    

    @Column(name="email")

    private String email;

    

    @Column(name="password")

    private String password;

    

    @Column(name="gender")

    private char gender;

    

    @Column(name="mobile_no")

    private long mobile_Number;

    

    @Column(name="dob")

    private Date birth_date;

    

    @Column(name="house_no")

    private int house_No;

    

    @Column(name="street_name")

    private String street_Name;

    

    @Column(name="cust_id")

    private String city;

    

    @Column(name="state")

    private String state;

    

    @Column(name="zip")

    private int pin_code;

    

    @Column(name="country")

    private String country;

    

    public Customer() {}

 

    public Customer(int customer_ID, String customer_Name, String email, String password, char gender, long mobile_Number, Date birth_date, int house_No, String street_Name, String city, String state, int pin_code, String country)

    {

        this.customer_ID = customer_ID;

        this.customer_Name = customer_Name;

        this.email = email;

        this.password = password;

        this.gender = gender;

        this.mobile_Number = mobile_Number;

        this.birth_date = birth_date;

        this.house_No = house_No;

        this.street_Name = street_Name;

        this.city = city;

        this.state = state;

        this.pin_code = pin_code;

        this.country = country;

    }

 

    public int getCustomer_ID() {

        return customer_ID;

    }

 

    public void setCustomer_ID(int customer_ID) {

        this.customer_ID = customer_ID;

    }

 

    public String getCustomer_Name() {

        return customer_Name;

    }

 

    public void setCustomer_Name(String customer_Name) {

        this.customer_Name = customer_Name;

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

 

    public long getMobile_Number() {

        return mobile_Number;

    }

 

    public void setMobile_Number(long mobile_Number) {

        this.mobile_Number = mobile_Number;

    }

 

    public Date getBirth_date() {

        return birth_date;

    }

 

    public void setBirth_date(Date birth_date) {

        this.birth_date = birth_date;

    }

 

    public int getHouse_No() {

        return house_No;

    }

 

    public void setHouse_No(int house_No) {

        this.house_No = house_No;

    }

 

    public String getStreet_Name() {

        return street_Name;

    }

 

    public void setStreet_Name(String street_Name) {

        this.street_Name = street_Name;

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

 

    public int getPin_code() {

        return pin_code;

    }

 

    public void setPin_code(int pin_code) {

        this.pin_code = pin_code;

    }

 

    public String getCountry() {

        return country;

    }

 

    public void setCountry(String country) {

        this.country = country;

    }

 

}

 


