package com.kks.bookpro.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment 
{


	
	    @Id

	    @Column(name="payment_id")

	    private int payment_Id;


	    @Column(name="cust_id")

	    private int customer_Id;


	    private Timestamp transaction_no;

	    private double cart_value;

	    private double discount;

	    private double tax;

	    private double total_amount_money;

	    private LocalDateTime payment_date;


	    public Payment() {}

	 

	    public Payment(int payment_Id, int customer_Id, Timestamp transaction_no, double cart_value, double discount,

	            double tax, double total_amount_money, LocalDateTime payment_date) 

	    {

	        this.payment_Id = payment_Id;

	        this.customer_Id = customer_Id;

	        this.transaction_no = transaction_no;

	        this.cart_value = cart_value;

	        this.discount = discount;

	        this.tax = tax;

	        this.total_amount_money = total_amount_money;

	        this.payment_date = payment_date;

	    }

	 

	    public int getPayment_Id() {

	        return payment_Id;

	    }

	 

	    public void setPayment_Id(int payment_Id) {

	        this.payment_Id = payment_Id;

	    }

	 

	    public int getCustomer_Id() {

	        return customer_Id;

	    }

	 

	    public void setCustomer_Id(int customer_Id) {

	        this.customer_Id = customer_Id;

	    }

	 

	    public Timestamp getTransaction_no() {

	        return transaction_no;

	    }

	 

	    public void setTransaction_no(Timestamp transaction_no) {

	        this.transaction_no = transaction_no;

	    }

	 

	    public double getCart_value() {

	        return cart_value;

	    }

	 

	    public void setCart_value(double cart_value) {

	        this.cart_value = cart_value;

	    }

	 

	    public double getDiscount() {

	        return discount;

	    }

	 

	    public void setDiscount(double discount) {

	        this.discount = discount;

	    }

	 

	    public double getTax() {

	        return tax;

	    }

	 

	    public void setTax(double tax) {

	        this.tax = tax;

	    }

	 

	    public double getTotal_amount_money() {

	        return total_amount_money;

	    }

	 

	    public void setTotal_amount_money(double total_amount_money) {

	        this.total_amount_money = total_amount_money;

	    }

	 

	    public LocalDateTime getPayment_date() {

	        return payment_date;

	    }

	 

	    public void setPayment_date(LocalDateTime payment_date) {

	        this.payment_date = payment_date;

	    }

	}

