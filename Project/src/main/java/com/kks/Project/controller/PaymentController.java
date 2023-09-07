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

import com.kks.Project.entity.Payment;
import com.kks.Project.service.PaymentService;





@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping
	public ResponseEntity<List<Payment>> getAllPayments()
	{
		List<Payment> blist = paymentService.getAllPayments();
		if(blist.size() != 0)
			return new ResponseEntity<List<Payment>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Payment>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{paymentId}", produces="application/json")
	public ResponseEntity<Payment> getTrainByTrainId(@PathVariable int paymentId)
	{
		Payment a = paymentService.getPaymentByPaymentId(paymentId);
		if(a!=null)
			return new ResponseEntity<Payment>(a, HttpStatus.OK);
		return new ResponseEntity<Payment>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertPayment(@RequestBody Payment payment)
	{
		paymentService.insertOrModifyPayment(payment);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyPayment(@RequestBody Payment payment)
	{
		paymentService.insertOrModifyPayment(payment);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{paymentId}")
	public HttpStatus deletepayment(@PathVariable int paymentId)
	{
		if(paymentService.deletePaymentByPaymentId(paymentId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
