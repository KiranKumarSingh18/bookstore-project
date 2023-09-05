package com.kkk.bookstore.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="author_name",nullable=false)
	private String authorName;
	
	
//	private LocalDate dob;
	
	public Author() {}

	public Author(int authorId, String authorName) {//, LocalDate dob
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		//this.dob = dob;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

//	public LocalDate getDob() {
//		return dob;
//	}
//
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}
	
	
}
