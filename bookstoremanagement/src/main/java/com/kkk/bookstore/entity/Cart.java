package com.kkk.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cart {
	@Id
    @Column(name="cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartID;

    @Column(name="cust_id")
    private int customerId;

    @ManyToOne()
    @JoinColumn(name="book_id")
    private Book bookId;
    private int quantity;
    private double price;

    public Cart() {}

	public Cart(int cartID, int customerId, Book bookId, int quantity, double price) {
		super();
		this.cartID = cartID;
		this.customerId = customerId;
		this.bookId = bookId;
		this.quantity = quantity;
		this.price = price;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Book getBook_id() {
		return bookId;
	}

	public void setBook_id(Book book_id) {
		this.bookId = book_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

 
}
