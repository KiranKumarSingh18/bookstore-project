package com.kks.bookpro.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders 
{
	@Id
    @Column(name="order_id")
    private int order_ID;

    private int cust_id;
    private double total_amount;
    private LocalDateTime order_date;

    public Orders() {}

 

    public Orders(int order_ID, int cust_id, double total_amount, LocalDateTime order_date) 
    {
        this.order_ID = order_ID;
        this.cust_id = cust_id;
        this.total_amount = total_amount;
        this.order_date = order_date;
    }

 

    public int getOrder_ID() {
        return order_ID;
    }

 

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

 

    public int getCust_id() {
        return cust_id;
    }

 

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

 

    public double getTotal_amount() {
        return total_amount;
    }

 

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

 

    public LocalDateTime getOrder_date() {
        return order_date;
    }

 

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }
}


