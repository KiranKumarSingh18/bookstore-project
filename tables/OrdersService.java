package com.kkk.bookstore.service;

import org.springframework.stereotype.Service;

@Service
public class OrdersService {
	@Autowired
	private OrdersRepo ordersRepo;

	@Transactional(readOnly=true)
	public List<Orders> getAllOrderss()
	{
		return ordersRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Orders getOrdersByOrdersId(int ordersId)
	{
		Optional<Orders> ot = ordersRepo.findById(ordersId);
		if(ot.isPresent())
			return ot.get();
		return new Orders();
	}
	
	@Transactional
	public boolean insertOrModifyOrders(Orders orders)
	{
		if(ordersRepo.save(orders) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteOrdersByOrdersId(int ordersId)
	{
		long count = ordersRepo.count();
		ordersRepo.deleteById(ordersId);
		if(count > ordersRepo.count())
			return true;
		return false;
	}
}
