package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.PublisherRepo;
import com.kkk.bookstore.entity.Publisher;

@Service
public class PublisherService {
	@Autowired
	private PublisherRepo publisherRepo;

	@Transactional(readOnly=true)
	public List<Publisher> getAllPublishers()
	{
		return publisherRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Publisher getPublisherByPublisherId(int publisherId)
	{
		Optional<Publisher> ot = publisherRepo.findById(publisherId);
		if(ot.isPresent())
			return ot.get();
		return new Publisher();
	}
	
	@Transactional
	public boolean insertOrModifyPublisher(Publisher publisher)
	{
		if(publisherRepo.save(publisher) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deletePublisherByPublisherId(int publisherId)
	{
		long count = publisherRepo.count();
		publisherRepo.deleteById(publisherId);
		if(count > publisherRepo.count())
			return true;
		return false;
	}
}
