package com.kks.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.Project.entity.Coupon;
import com.kks.Project.repository.CouponRepo;



@Service

public class CouponService {
	@Autowired
	private CouponRepo couponRepo;

	@Transactional(readOnly=true)
	public List<Coupon> getAllCoupons()
	{
		return couponRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Coupon getCouponByCouponId(int couponId)
	{
		Optional<Coupon> ot = couponRepo.findById(couponId);
		if(ot.isPresent())
			return ot.get();
		return new Coupon();
	}
	
	@Transactional
	public boolean insertOrModifyCoupon(Coupon coupon)
	{
		if(couponRepo.save(coupon) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteCouponByCouponId(int couponId)
	{
		long count = couponRepo.count();
		couponRepo.deleteById(couponId);
		if(count > couponRepo.count())
			return true;
		return false;
	}
}
