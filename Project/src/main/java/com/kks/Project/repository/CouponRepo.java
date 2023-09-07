package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Cart;
import com.kks.Project.entity.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer>{

}
