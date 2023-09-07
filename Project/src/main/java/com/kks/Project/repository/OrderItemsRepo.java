package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.OrderItems;

public interface OrderItemsRepo extends JpaRepository<OrderItems, Integer>{

}
