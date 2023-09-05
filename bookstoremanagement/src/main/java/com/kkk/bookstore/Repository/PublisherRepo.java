package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kkk.bookstore.entity.Publisher;

public interface PublisherRepo extends JpaRepository<Publisher, Integer>{

}
