package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.PaymentRepo;
import com.kkk.bookstore.entity.Payment;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepo paymentRepo;

	@Transactional(readOnly=true)
	public List<Payment> getAllPayments()
	{
		return paymentRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Payment getPaymentByPaymentId(int paymentId)
	{
		Optional<Payment> ot = paymentRepo.findById(paymentId);
		if(ot.isPresent())
			return ot.get();
		return new Payment();
	}
	
	@Transactional
	public boolean insertOrModifyPayment(Payment payment)
	{
		if(paymentRepo.save(payment) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deletePaymentByPaymentId(int paymentId)
	{
		long count = paymentRepo.count();
		paymentRepo.deleteById(paymentId);
		if(count > paymentRepo.count())
			return true;
		return false;
	}
}
