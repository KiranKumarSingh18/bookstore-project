package com.kks.Project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kks.Project.entity.Cart;
import com.kks.Project.entity.Customer;
import com.kks.Project.service.CartService;

import jakarta.servlet.http.HttpSession;




@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@GetMapping
	public ResponseEntity<List<Cart>> getAllCarts()
	{
		List<Cart> blist = cartService.getAllCarts();
		if(blist.size() != 0)
			return new ResponseEntity<List<Cart>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Cart>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{cartId}", produces="application/json")
	public ResponseEntity<Cart> getTrainByTrainId(@PathVariable int cartId)
	{
		Cart a = cartService.getCartByCartId(cartId);
		if(a!=null)
			return new ResponseEntity<Cart>(a, HttpStatus.OK);
		return new ResponseEntity<Cart>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertCart(@RequestBody Cart cart,HttpSession session)
	{
		
		if(session.getAttribute("id")!= null) {
			Customer cust = new Customer();
			cust.setCustomerID((int)session.getAttribute("id"));
			cart.setCustomerId(cust);
			cart.setBook_id(cart.getBook_id());
			cart.setQuantity(1);
			cartService.insertOrModifyCart(cart);
			return HttpStatus.OK;
		}
		return HttpStatus.NOT_MODIFIED;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyCart(@RequestBody Cart cart)
	{
		cartService.insertOrModifyCart(cart);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{cartId}")
	public HttpStatus deletecart(@PathVariable int cartId)
	{
		if(cartService.deleteCartByCartId(cartId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
