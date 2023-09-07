package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer>{

}
