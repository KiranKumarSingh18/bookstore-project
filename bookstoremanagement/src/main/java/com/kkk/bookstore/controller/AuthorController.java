package com.kkk.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkk.bookstore.entity.Author;
import com.kkk.bookstore.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@GetMapping
	public ResponseEntity<List<Author>> getAllAuthors()
	{
		List<Author> blist = authorService.getAllAuthors();
		if(blist.size() != 0)
			return new ResponseEntity<List<Author>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Author>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{authorId}", produces="application/json")
	public ResponseEntity<Author> getTrainByTrainId(@PathVariable int authorId)
	{
		Author a = authorService.getAuthorByAuthorId(authorId);
		if(a!=null)
			return new ResponseEntity<Author>(a, HttpStatus.OK);
		return new ResponseEntity<Author>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertAuthor(@RequestBody Author author)
	{
		authorService.insertOrModifyAuthor(author);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyAuthor(@RequestBody Author author)
	{
		authorService.insertOrModifyAuthor(author);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{authorId}")
	public HttpStatus deleteauthor(@PathVariable int authorId)
	{
		if(authorService.deleteAuthorByAuthorId(authorId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
}
