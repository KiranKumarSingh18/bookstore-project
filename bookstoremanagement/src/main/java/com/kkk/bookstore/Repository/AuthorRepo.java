package com.kkk.bookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkk.bookstore.entity.Author;


public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
