package com.kks.Project.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
public class Orders {
	@Id
    @Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
	
	@ManyToOne()
	@JoinColumn (name="cust_id")
    private Customer custId;
	
	@Column(name="total_amount")
    private double totalAmount;
	
	@Column(name="order_date")
    private LocalDateTime orderDate;

    public Orders() {}

	public Orders(int orderID, Customer custId, double totalAmount, LocalDateTime orderDate) {
		super();
		this.orderID = orderID;
		this.custId = custId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

}
