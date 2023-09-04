package com.kkk.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderitems")
public class OrderItemsController {
	@Autowired
	private OrderItemsService orderItemsService;
	
	@GetMapping
	public ResponseEntity<List<OrderItems>> getAllOrderItemss()
	{
		List<OrderItems> blist = orderItemsService.getAllOrderItemss();
		if(blist.size() != 0)
			return new ResponseEntity<List<OrderItems>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<OrderItems>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{orderItemsId}", produces="application/json")
	public ResponseEntity<OrderItems> getTrainByTrainId(@PathVariable int orderItemsId)
	{
		OrderItems a = orderItemsService.getOrderItemsByOrderItemsId(orderItemsId);
		if(a!=null)
			return new ResponseEntity<OrderItems>(a, HttpStatus.OK);
		return new ResponseEntity<OrderItems>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertOrderItems(@RequestBody OrderItems orderItems)
	{
		orderItemsService.insertOrModifyOrderItems(orderItems);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyOrderItems(@RequestBody OrderItems orderItems)
	{
		orderItemsService.insertOrModifyOrderItems(orderItems);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{orderItemsId}")
	public HttpStatus deleteorderItems(@PathVariable int orderItemsId)
	{
		if(orderItemsService.deleteOrderItemsByOrderItemsId(orderItemsId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
