package com.kks.Project.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.Project.entity.OrderItems;
import com.kks.Project.repository.OrderItemsRepo;



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
