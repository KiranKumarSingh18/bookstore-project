package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
