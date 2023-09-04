package com.kks.bookpro.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Book 
{
	@Id

    @Column(name="book_id")

    private int book_ID;

    

    @Column(name="author_id")

    private int author_id;

    

    @Column(name="publisher_id")

    private int publisher_id;

    

    @Column(name="title")

    private String title_Name;

    

    @Column(name="category")

    private String category;

    

    @Column(name="price")

    private double price;

    

    @Column(name="publication_date")

    private Date publication_Date;

    

    public Book() {}

 

    public Book(int book_ID, int author_id, int publisher_id, String title_Name, String category, double price, Date publication_Date)

    {

        this.book_ID = book_ID;

        this.author_id = author_id;

        this.publisher_id = publisher_id;

        this.title_Name = title_Name;

        this.category = category;

        this.price = price;

        this.publication_Date = publication_Date;

    }

 

    public int getBook_ID() {

        return book_ID;

    }

 

    public void setBook_ID(int book_ID) {

        this.book_ID = book_ID;

    }

 

    public int getAuthor_id() {

        return author_id;

    }

 

    public void setAuthor_id(int author_id) {

        this.author_id = author_id;

    }

 

    public int getPublisher_id() {

        return publisher_id;

    }

 

    public void setPublisher_id(int publisher_id) {

        this.publisher_id = publisher_id;

    }

 

    public String getTitle_Name() {

        return title_Name;

    }

 

    public void setTitle_Name(String title_Name) {

        this.title_Name = title_Name;

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

 

    public Date getPublication_Date() {

        return publication_Date;

    }

 

    public void setPublication_Date(Date publication_Date) {

        this.publication_Date = publication_Date;

    }

    

}


