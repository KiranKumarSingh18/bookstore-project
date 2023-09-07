package com.kks.Project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Publisher {
	@Id
	@Column(name="publisher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisherID;

    

    @Column(name="publisher_name")

    private String publisherName;

    

  
    private String country;

    

    public Publisher() {}



	public Publisher(int publisherID, String publisherName, String country) {
		super();
		this.publisherID = publisherID;
		this.publisherName = publisherName;
		this.country = country;
	}



	public int getPublisherID() {
		return publisherID;
	}



	public void setPublisherID(int publisherID) {
		this.publisherID = publisherID;
	}



	public String getPublisherName() {
		return publisherName;
	}



	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

 

}
