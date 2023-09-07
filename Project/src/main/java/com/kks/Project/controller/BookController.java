package com.kks.Project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kks.Project.entity.Author;
import com.kks.Project.entity.Book;
import com.kks.Project.entity.Customer;
import com.kks.Project.service.AuthorService;
import com.kks.Project.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = {"http://localhost:4200"})
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> blist = bookService.getAllBooks();
		if(blist.size() != 0)
			return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Book>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{bookId}", produces="application/json")
	public ResponseEntity<Book> getBookByBookId(@PathVariable int bookId)
	{
		Book a = bookService.getBookByBookId(bookId);
		if(a!=null)
			return new ResponseEntity<Book>(a, HttpStatus.OK);
		return new ResponseEntity<Book>(a,HttpStatus.NOT_FOUND);
	}
	
//	@GetMapping(value="/title/{title}", produces="application/json")
//	public ResponseEntity<Book> getBookByTitle(@PathVariable String title)
//	{
//		Book a = bookService.findingByTitle(title);
//		if(a!=null)
//			return new ResponseEntity<Book>(a, HttpStatus.OK);
//		return new ResponseEntity<Book>(a,HttpStatus.NOT_FOUND);
//	}
//	
	
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertBook(@RequestBody Book book)
	{
		bookService.insertOrModifyBook(book);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyBook(@RequestBody Book book)
	{
		bookService.insertOrModifyBook(book);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{bookId}")
	public HttpStatus deletebook(@PathVariable int bookId)
	{
		if(bookService.deleteBookByBookId(bookId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@GetMapping(value="/search/{name}")
	public List<Book> searchingBooks(@PathVariable String name) {

		return  bookService.searchBooksBy(name);
	}
}
