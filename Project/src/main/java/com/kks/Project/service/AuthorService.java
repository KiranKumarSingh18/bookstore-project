package com.kks.Project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kks.Project.entity.Author;
import com.kks.Project.repository.AuthorRepo;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepo authorRepo;

	@Transactional(readOnly=true)
	public List<Author> getAllAuthors()
	{
		return authorRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Author getAuthorByAuthorId(int authorId)
	{
		Optional<Author> ot = authorRepo.findById(authorId);
		if(ot.isPresent())
			return ot.get();
		return new Author();
	}
	
	@Transactional
	public boolean insertOrModifyAuthor(Author author)
	{
		if(authorRepo.save(author) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteAuthorByAuthorId(int authorId)
	{
		long count = authorRepo.count();
		authorRepo.deleteById(authorId);
		if(count > authorRepo.count())
			return true;
		return false;
	}

}
