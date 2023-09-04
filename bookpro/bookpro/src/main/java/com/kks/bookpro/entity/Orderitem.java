package com.kks.bookpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orderitem 
{
	@Id
    @Column(name="order_Item_Id")
    private int order_Item_ID;

    @Column(name="order_id")
    private int order_id;

    private int cust_id;
    private int book_id;
    private int quantity;
    private double amount;

    public Orderitem() {}

 

    public Orderitem(int order_Item_ID, int order_id, int cust_id, int book_id, int quantity, double amount) 
    {
        this.order_Item_ID = order_Item_ID;
        this.order_id = order_id;
        this.cust_id = cust_id;
        this.book_id = book_id;
        this.quantity = quantity;
        this.amount = amount;
    }

 

    public int getOrder_Item_ID() {
        return order_Item_ID;
    }

 

    public void setOrder_Item_ID(int order_Item_ID) {
        this.order_Item_ID = order_Item_ID;
    }

 

    public int getOrder_id() {
        return order_id;
    }

 

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

 

    public int getCust_id() {
        return cust_id;
    }

 

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
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

 

    public double getAmount() {
        return amount;
    }

 

    public void setAmount(double amount) {
        this.amount = amount;
    }
}    

 

