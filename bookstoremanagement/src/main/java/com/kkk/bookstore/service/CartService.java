package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.CartRepo;
import com.kkk.bookstore.entity.Cart;

@Service
public class CartService {
	@Autowired
	private CartRepo cartRepo;

	@Transactional(readOnly=true)
	public List<Cart> getAllCarts()
	{
		return cartRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Cart getCartByCartId(int cartId)
	{
		Optional<Cart> ot = cartRepo.findById(cartId);
		if(ot.isPresent())
			return ot.get();
		return new Cart();
	}
	
	@Transactional
	public boolean insertOrModifyCart(Cart cart)
	{
		if(cartRepo.save(cart) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteCartByCartId(int cartId)
	{
		long count = cartRepo.count();
		cartRepo.deleteById(cartId);
		if(count > cartRepo.count())
			return true;
		return false;
	}
}
