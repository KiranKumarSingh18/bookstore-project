package com.kks.bookpro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory 
{
	@Id

    @Column(name="inventory_id")

    private int inventory_ID;

    

    @Column(name="book_id")

    private int book_id;

    

    @Column(name="quantity")

    private int quantity;

    

    public Inventory() {}

 

    public Inventory(int inventory_ID, int book_id, int quantity) {

        super();

        this.inventory_ID = inventory_ID;

        this.book_id = book_id;

        this.quantity = quantity;

    }

 

    public int getInventory_ID() {

        return inventory_ID;

    }

 

    public void setInventory_ID(int inventory_ID) {

        this.inventory_ID = inventory_ID;

    }

 

    public int getBook_id() {

        return book_id;

    }

 

    public void setBook_id(int book_id) {

        this.book_id = book_id;

    }

 

    public int getQuantity() {

        return quantity;

    }

 

    public void setQuantity(int quantity) {

        this.quantity = quantity;

    }

}

 


