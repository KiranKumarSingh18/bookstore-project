package com.kks.bookpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart 
{
	@Id
    @Column(name="cart_id")
    private int cart_ID;

    @Column(name="cust_id")
    private int customer_id;

    private int book_id;
    private int quantity;
    private double price;

    public Cart() {}

 

    public Cart(int cart_ID, int customer_id, int book_id, int quantity, double price) 
    {
        this.cart_ID = cart_ID;
        this.customer_id = customer_id;
        this.book_id = book_id;
        this.quantity = quantity;
        this.price = price;
    }

 

    public int getCart_ID() {
        return cart_ID;
    }

 

    public void setCart_ID(int cart_ID) {
        this.cart_ID = cart_ID;
    }

 

    public int getCustomer_id() {
        return customer_id;
    }

 

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

 

    public int getBook_id() {
        return book_id;
    }

 

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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


