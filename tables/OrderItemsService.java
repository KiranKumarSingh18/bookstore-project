package com.kkk.bookstore.service;

import org.springframework.stereotype.Service;

@Service
public class OrderItemsService {
	@Autowired
	private OrderItemsRepo orderItemsRepo;

	@Transactional(readOnly=true)
	public List<OrderItems> getAllOrderItemss()
	{
		return orderItemsRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public OrderItems getOrderItemsByOrderItemsId(int orderItemsId)
	{
		Optional<OrderItems> ot = orderItemsRepo.findById(orderItemsId);
		if(ot.isPresent())
			return ot.get();
		return new OrderItems();
	}
	
	@Transactional
	public boolean insertOrModifyOrderItems(OrderItems orderItems)
	{
		if(orderItemsRepo.save(orderItems) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteOrderItemsByOrderItemsId(int orderItemsId)
	{
		long count = orderItemsRepo.count();
		orderItemsRepo.deleteById(orderItemsId);
		if(count > orderItemsRepo.count())
			return true;
		return false;
	}
}
