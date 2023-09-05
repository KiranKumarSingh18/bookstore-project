package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.InventoryRepo;
import com.kkk.bookstore.entity.Inventory;

@Service
public class InventoryService {
	@Autowired
	private InventoryRepo inventoryRepo;

	@Transactional(readOnly=true)
	public List<Inventory> getAllInventorys()
	{
		return inventoryRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Inventory getInventoryByInventoryId(int inventoryId)
	{
		Optional<Inventory> ot = inventoryRepo.findById(inventoryId);
		if(ot.isPresent())
			return ot.get();
		return new Inventory();
	}
	
	@Transactional
	public boolean insertOrModifyInventory(Inventory inventory)
	{
		if(inventoryRepo.save(inventory) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteInventoryByInventoryId(int inventoryId)
	{
		long count = inventoryRepo.count();
		inventoryRepo.deleteById(inventoryId);
		if(count > inventoryRepo.count())
			return true;
		return false;
	}
}
