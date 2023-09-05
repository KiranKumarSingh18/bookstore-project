package com.kkk.bookstore.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="publisher_id")
	private Publisher publisher;
	
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String category;
	
	@Column(nullable=false)
	private double price;
	
//	@Column(name="publication_date",nullable=false)
//	private Date publicationDate;
		
	
	public Book() {}


	public Book(int bookId, Author author, Publisher publisher, String title, String category, double price
			) {//Date publicationDate
		super();
		this.bookId = bookId;
		this.author = author;
		this.publisher = publisher;
		this.title = title;
		this.category = category;
		this.price = price;
	//	this.publicationDate = publicationDate;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public Publisher getPublisher() {
		return publisher;
	}


	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

//
//	public Date getPublicationDate() {
//		return publicationDate;
//	}
//
//
//	public void setPublicationDate(Date publicationDate) {
//		this.publicationDate = publicationDate;
//	}

	
}
