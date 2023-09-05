package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.OrderItems;

public interface OrderItemsRepo extends JpaRepository<OrderItems, Integer>{

}
