package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
