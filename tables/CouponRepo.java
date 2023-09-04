package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer>{

}
