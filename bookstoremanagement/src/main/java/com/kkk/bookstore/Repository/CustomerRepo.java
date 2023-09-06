package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
@Query("SELECT CASE WHEN COUNT(c) = 1 THEN true ELSE false END FROM Customer c WHERE c.email = :emailId AND c.password = :password")
	    boolean validateLogin(
	        @Param("emailId") String email,
	        @Param("password") String password
	    );
	

}
