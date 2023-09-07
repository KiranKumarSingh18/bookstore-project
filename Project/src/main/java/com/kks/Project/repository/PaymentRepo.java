package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer>{

}
