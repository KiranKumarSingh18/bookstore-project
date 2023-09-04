package com.kks.bookpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon 
{
	@Id
    @Column(name="coupon_id")
    private int coupon_ID;

    private String coupon_code;

    @Column(name="dis_amount")
    private double discount_amount;

    public Coupon() {}

 

    public Coupon(int coupon_ID, String coupon_code, double discount_amount) 
    {
        this.coupon_ID = coupon_ID;
        this.coupon_code = coupon_code;
        this.discount_amount = discount_amount;
    }

 

    public int getCoupon_ID() {
        return coupon_ID;
    }

 

    public void setCoupon_ID(int coupon_ID) {
        this.coupon_ID = coupon_ID;
    }

 

    public String getCoupon_code() {
        return coupon_code;
    }

 

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

 

    public double getDiscount_amount() {
        return discount_amount;
    }

 

    public void setDiscount_amount(double discount_amount) {
        this.discount_amount = discount_amount;
    }
}


