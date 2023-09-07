package com.kks.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.Project.entity.Author;
import com.kks.Project.entity.Book;
import com.kks.Project.repository.AuthorRepo;
import com.kks.Project.repository.BookRepo;

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
	
	@Transactional
	public Optional<Book> findingByTitle(String title)
	{

		 return bookRepo.findByTitle(title);
	}
	
	
	@Transactional
	public List<Book> searchBooksBy(String name) {
		return bookRepo.searchBook(name+"%");
		
	}
	
}
