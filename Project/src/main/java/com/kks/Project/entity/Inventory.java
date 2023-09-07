package com.kks.Project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inventory_id")
	private int inventoryID;

    
	@OneToOne()
    @JoinColumn(name="book_id")
    private Book bookId;

	private int quantity;

    

    public Inventory() {}



	public Inventory(int inventoryID, Book bookId, int quantity) {
		super();
		this.inventoryID = inventoryID;
		this.bookId = bookId;
		this.quantity = quantity;
	}



	public int getInventoryID() {
		return inventoryID;
	}



	public void setInventoryID(int inventoryID) {
		this.inventoryID = inventoryID;
	}



	public Book getBookId() {
		return bookId;
	}



	public void setBookId(Book bookId) {
		this.bookId = bookId;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    
}
