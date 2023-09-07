package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kks.Project.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

//    @Query("FROM Author WHERE firstName = ?1")
//    List<Author> findByFirstName(String firstName);
//	@Query("SELECT c.cust_id FROM Customer c WHERE c.email = :emailId AND c.password = :password")
//	    Integer validateLogin(
//	        @Param("emailId") String email,
//	        @Param("password") String password
//	    );	
	
//	Integer findByEmailAndPassword(String email, String password);
//	 @Query("SELECT c.cust_id FROM Customer c WHERE c.email = :email AND c.password = :password")
//	    Integer findCustomerIdByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
	Customer findCustomerIdByEmailAndPassword(String email, String password);
}
