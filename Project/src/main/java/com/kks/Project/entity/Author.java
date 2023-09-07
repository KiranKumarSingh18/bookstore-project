package com.kks.Project.entity;

import java.sql.Date;

import org.hibernate.annotations.GeneratorType;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id")
    private int authorID;
	
    @Column(name="author_name")
    private String authorName;
    

    //private Date dob;
    public Author() {}
	public Author(int authorID, String authorName) {//, Date dob
		super();
		this.authorID = authorID;
		this.authorName = authorName;
		//this.dob = dob;
	}
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//    

}
