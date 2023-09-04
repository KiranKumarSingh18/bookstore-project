package com.kkk.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @Id
    @Column(name="coupon_id")
    private int couponID;
    
    
    @Column(name="coupon_code")
    private String couponCode;

    @Column(name="dis_amount")
    private double discountAmount;

    public Coupon() {}

	public Coupon(int couponID, String couponCode, double discountAmount) {
		super();
		this.couponID = couponID;
		this.couponCode = couponCode;
		this.discountAmount = discountAmount;
	}

	public int getCouponID() {
		return couponID;
	}

	public void setCouponID(int couponID) {
		this.couponID = couponID;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

 
}
