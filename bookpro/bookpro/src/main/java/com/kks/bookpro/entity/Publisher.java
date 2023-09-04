package com.kks.bookpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Publisher
{
	@Id

    @Column(name="publisher_id")

    private int publisher_ID;

    

    @Column(name="publisher_name")

    private String publisher_Name;

    

    @Column(name="country")

    private String country;

    

    public Publisher() {}

 

    public Publisher(int publisher_ID, String publisher_Name, String country)

    {

        this.publisher_ID = publisher_ID;

        this.publisher_Name = publisher_Name;

        this.country = country;

    }

 

    public int getPublisher_ID() {

        return publisher_ID;

    }

 

    public void setPublisher_ID(int publisher_ID) {

        this.publisher_ID = publisher_ID;

    }

 

    public String getPublisher_Name() {

        return publisher_Name;

    }

 

    public void setPublisher_Name(String publisher_Name) {

        this.publisher_Name = publisher_Name;

    }

 

    public String getCountry() {

        return country;

    }

 

    public void setCountry(String country) {

        this.country = country;

    }

}
