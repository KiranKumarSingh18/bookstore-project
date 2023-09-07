package com.kks.Project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kks.Project.entity.Book;

public interface BookRepo  extends JpaRepository<Book, Integer>{
	
	Optional<Book> findByTitle(String title);
	
	@Query("SELECT b FROM Book b WHERE b.title  like :name or b.category LIKE  :name")
    List<Book> searchBook(
        @Param("name") String name
    );	
}
