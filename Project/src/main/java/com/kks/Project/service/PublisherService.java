package com.kks.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.Project.entity.Author;
import com.kks.Project.entity.Publisher;
import com.kks.Project.repository.AuthorRepo;
import com.kks.Project.repository.PublisherRepo;

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
	public boolean deletePublisherByPublisherId(int authorId)
	{
		long count = publisherRepo.count();
		publisherRepo.deleteById(authorId);
		if(count > publisherRepo.count())
			return true;
		return false;
	}

	
}
