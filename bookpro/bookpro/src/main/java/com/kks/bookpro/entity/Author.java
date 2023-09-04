package com.kks.bookpro.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Author

{

    @Id

    @Column(name="author_id")

    private int author_ID;

    

    @Column(name="author_name")

    private String author_Name;

    

    @Column(name="dob")

    private Date date_of_birth;
    public Author() {}
    public Author(int author_ID, String author_Name, Date date_of_birth)

    {

        this.author_ID = author_ID;

        this.author_Name = author_Name;

        this.date_of_birth = date_of_birth;

    }

 

    public int getAuthor_ID() {

        return author_ID;

    }
    public void setAuthor_ID(int author_ID) {

        this.author_ID = author_ID;

    }

 

    public String getAuthor_Name() {

        return author_Name;

    }

 

    public void setAuthor_Name(String author_Name) {

        this.author_Name = author_Name;

    }

 

    public Date getDate_of_birth() {

        return date_of_birth;

    }
    public void setDate_of_birth(Date date_of_birth) {

        this.date_of_birth = date_of_birth;

    }

}
