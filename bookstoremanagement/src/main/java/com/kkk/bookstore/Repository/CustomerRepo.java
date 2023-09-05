package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
