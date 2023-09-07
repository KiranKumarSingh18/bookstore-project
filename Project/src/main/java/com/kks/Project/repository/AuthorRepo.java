package com.kks.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kks.Project.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
