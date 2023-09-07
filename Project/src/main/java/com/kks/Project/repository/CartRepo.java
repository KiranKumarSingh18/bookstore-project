package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
