package com.kkk.bookstore.controller;

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

import com.kkk.bookstore.entity.Inventory;
import com.kkk.bookstore.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping
	public ResponseEntity<List<Inventory>> getAllInventorys()
	{
		List<Inventory> blist = inventoryService.getAllInventorys();
		if(blist.size() != 0)
			return new ResponseEntity<List<Inventory>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Inventory>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{inventoryId}", produces="application/json")
	public ResponseEntity<Inventory> getTrainByTrainId(@PathVariable int inventoryId)
	{
		Inventory a = inventoryService.getInventoryByInventoryId(inventoryId);
		if(a!=null)
			return new ResponseEntity<Inventory>(a, HttpStatus.OK);
		return new ResponseEntity<Inventory>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertInventory(@RequestBody Inventory inventory)
	{
		inventoryService.insertOrModifyInventory(inventory);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyInventory(@RequestBody Inventory inventory)
	{
		inventoryService.insertOrModifyInventory(inventory);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{inventoryId}")
	public HttpStatus deleteinventory(@PathVariable int inventoryId)
	{
		if(inventoryService.deleteInventoryByInventoryId(inventoryId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
