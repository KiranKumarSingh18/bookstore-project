package com.kks.Project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kks.Project.entity.Coupon;
import com.kks.Project.service.CouponService;





@RestController
@RequestMapping("/coupon")
public class CouponController {
	@Autowired
	private CouponService couponService;
	
	@GetMapping
	public ResponseEntity<List<Coupon>> getAllCoupons()
	{
		List<Coupon> blist = couponService.getAllCoupons();
		if(blist.size() != 0)
			return new ResponseEntity<List<Coupon>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Coupon>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{couponId}", produces="application/json")
	public ResponseEntity<Coupon> getTrainByTrainId(@PathVariable int couponId)
	{
		Coupon a = couponService.getCouponByCouponId(couponId);
		if(a!=null)
			return new ResponseEntity<Coupon>(a, HttpStatus.OK);
		return new ResponseEntity<Coupon>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertCoupon(@RequestBody Coupon coupon)
	{
		couponService.insertOrModifyCoupon(coupon);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyCoupon(@RequestBody Coupon coupon)
	{
		couponService.insertOrModifyCoupon(coupon);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{couponId}")
	public HttpStatus deletecoupon(@PathVariable int couponId)
	{
		if(couponService.deleteCouponByCouponId(couponId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
}
