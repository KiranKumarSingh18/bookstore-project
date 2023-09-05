package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer>{

}
