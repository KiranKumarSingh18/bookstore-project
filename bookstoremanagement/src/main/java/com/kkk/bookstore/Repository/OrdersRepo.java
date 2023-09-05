package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
