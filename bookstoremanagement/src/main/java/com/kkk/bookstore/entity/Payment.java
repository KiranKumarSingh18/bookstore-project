package com.kkk.bookstore.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
    @Column(name="payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

	@ManyToOne()
    @JoinColumn(name="cust_id")
    private Customer customerId;

    @Column(name="transaction_no")
    private Timestamp transactionNo;
    
    @Column(name="cart_value")
    private double cartValue;
    private double discount;
    private double tax;
    @Column(name="total_amount")
    private double totalAmount;
    
    @Column(name="payment_date")
    private LocalDateTime paymentDate;

    public Payment() {}

	public Payment(int paymentId, Customer customerId, Timestamp transactionNo, double cartValue, double discount,
			double tax, double totalAmount, LocalDateTime paymentDate) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.transactionNo = transactionNo;
		this.cartValue = cartValue;
		this.discount = discount;
		this.tax = tax;
		this.totalAmount = totalAmount;
		this.paymentDate = paymentDate;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Timestamp getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(Timestamp transactionNo) {
		this.transactionNo = transactionNo;
	}

	public double getCartValue() {
		return cartValue;
	}

	public void setCartValue(double cartValue) {
		this.cartValue = cartValue;
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

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

 

}
