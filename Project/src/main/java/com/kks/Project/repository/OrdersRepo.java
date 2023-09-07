package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
