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

import com.kks.Project.entity.Orders;
import com.kks.Project.service.OrdersService;





@RestController
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping
	public ResponseEntity<List<Orders>> getAllOrderss()
	{
		List<Orders> blist = ordersService.getAllOrderss();
		if(blist.size() != 0)
			return new ResponseEntity<List<Orders>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Orders>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{ordersId}", produces="application/json")
	public ResponseEntity<Orders> getTrainByTrainId(@PathVariable int ordersId)
	{
		Orders a = ordersService.getOrdersByOrdersId(ordersId);
		if(a!=null)
			return new ResponseEntity<Orders>(a, HttpStatus.OK);
		return new ResponseEntity<Orders>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertOrders(@RequestBody Orders orders)
	{
		ordersService.insertOrModifyOrders(orders);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyOrders(@RequestBody Orders orders)
	{
		ordersService.insertOrModifyOrders(orders);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{ordersId}")
	public HttpStatus deleteorders(@PathVariable int ordersId)
	{
		if(ordersService.deleteOrdersByOrdersId(ordersId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
