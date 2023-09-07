package com.kks.Project.entity;

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
    @Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;
	
    
    @ManyToOne()
    @JoinColumn(name="author_id")
    private Author authorId;   

    @ManyToOne()
    @JoinColumn(name="publisher_id")
    private Publisher publisherId;

    private String title;

    private String category;

    private double price;

//    @Column(name="publication_date")
//    private Date publicationDate;

    public Book() {}

	public Book(int bookID, Author authorId, Publisher publisherId, String title, String category, double price
			) {//,Date publicationDate
		super();
		this.bookID = bookID;
		this.authorId = authorId;
		this.publisherId = publisherId;
		this.title = title;
		this.category = category;
		this.price = price;
		//this.publicationDate = publicationDate;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public Author getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Author authorId) {
		this.authorId = authorId;
	}



	public Publisher getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Publisher publisherId) {
		this.publisherId = publisherId;
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

//	public Date getPublicationDate() {
//		return publicationDate;
//	}
//
//	public void setPublicationDate(Date publicationDate) {
//		this.publicationDate = publicationDate;
//	}

}
