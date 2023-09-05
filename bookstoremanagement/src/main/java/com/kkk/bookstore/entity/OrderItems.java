package com.kkk.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="Order_Items")
public class OrderItems {
	@Id
    @Column(name="order_Item_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemID;

    @Column(name="order_id")
    private int orderId;

    @ManyToOne()
    @JoinColumn(name="cust_id")
    private Customer custId;
    
    @ManyToOne()
    @JoinColumn(name="book_id")
    private Book book_id;
    
    private int quantity;
    private double amount;

    public OrderItems() {}

	public OrderItems(int orderItemID, int orderId, Customer custId, Book book_id, int quantity, double amount) {
		super();
		this.orderItemID = orderItemID;
		this.orderId = orderId;
		this.custId = custId;
		this.book_id = book_id;
		this.quantity = quantity;
		this.amount = amount;
	}

	public int getOrderItemID() {
		return orderItemID;
	}

	public void setOrderItemID(int orderItemID) {
		this.orderItemID = orderItemID;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public Book getBook_id() {
		return book_id;
	}

	public void setBook_id(Book book_id) {
		this.book_id = book_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

 

}
