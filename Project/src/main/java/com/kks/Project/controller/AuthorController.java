package com.kks.Project.controller;

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

import com.kks.Project.entity.Author;
import com.kks.Project.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping
	public ResponseEntity<List<Author>> getAllAuthors()
	{
		List<Author> alist = authorService.getAllAuthors();
		if(alist.size() != 0)
			return new ResponseEntity<List<Author>>(alist,HttpStatus.OK);
		return new ResponseEntity<List<Author>>(alist,HttpStatus.NOT_FOUND);
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
	public HttpStatus insertTrain(@RequestBody Author author)
	{
		authorService.insertOrModifyAuthor(author);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyTrain(@RequestBody Author author)
	{
		authorService.insertOrModifyAuthor(author);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{authorId}")
	public HttpStatus deleteTrain(@PathVariable int authorId)
	{
		if(authorService.deleteAuthorByAuthorId(authorId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
//	@ExceptionHandler(ResourceNotModifiedException.class)
//	public HttpStatus notModifiedExceptionHandler()
//	{
//		return HttpStatus.NOT_MODIFIED;
//	}

}
