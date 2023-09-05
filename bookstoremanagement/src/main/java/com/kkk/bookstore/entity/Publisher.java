package com.kkk.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="publisher_id")
	private int publisherId;
	
	@Column(name="publisher_name",nullable=false)
	private String publisherName;
	
	private String country;
	
	public Publisher() {}

	public Publisher(int publisherId, String publisherName, String country) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.country = country;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
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
