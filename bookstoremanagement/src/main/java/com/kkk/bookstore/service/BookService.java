package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.BookRepo;
import com.kkk.bookstore.entity.Book;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;

	@Transactional(readOnly=true)
	public List<Book> getAllBooks()
	{
		return bookRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Book getBookByBookId(int bookId)
	{
		Optional<Book> ot = bookRepo.findById(bookId);
		if(ot.isPresent())
			return ot.get();
		return new Book();
	}
	
	@Transactional
	public boolean insertOrModifyBook(Book book)
	{
		if(bookRepo.save(book) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteBookByBookId(int bookId)
	{
		long count = bookRepo.count();
		bookRepo.deleteById(bookId);
		if(count > bookRepo.count())
			return true;
		return false;
	}
}
