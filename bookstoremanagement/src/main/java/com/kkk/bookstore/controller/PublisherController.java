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

import com.kkk.bookstore.entity.Publisher;
import com.kkk.bookstore.service.PublisherService;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	@GetMapping
	public ResponseEntity<List<Publisher>> getAllPublishers()
	{
		List<Publisher> blist = publisherService.getAllPublishers();
		if(blist.size() != 0)
			return new ResponseEntity<List<Publisher>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Publisher>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{publisherId}", produces="application/json")
	public ResponseEntity<Publisher> getTrainByTrainId(@PathVariable int publisherId)
	{
		Publisher a = publisherService.getPublisherByPublisherId(publisherId);
		if(a!=null)
			return new ResponseEntity<Publisher>(a, HttpStatus.OK);
		return new ResponseEntity<Publisher>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertPublisher(@RequestBody Publisher publisher)
	{
		publisherService.insertOrModifyPublisher(publisher);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyPublisher(@RequestBody Publisher publisher)
	{
		publisherService.insertOrModifyPublisher(publisher);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{publisherId}")
	public HttpStatus deletepublisher(@PathVariable int publisherId)
	{
		if(publisherService.deletePublisherByPublisherId(publisherId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
