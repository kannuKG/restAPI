package com.nagarro.appRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.appRest.model.Author;
import com.nagarro.appRest.repository.AuthorRepository;

@Service
public class AuthorService {
	@Autowired
	AuthorRepository repo;
	
	public List<Author> getAuthors(){
		return repo.findAll();
	}

	public void addAuthors(Author a) {
		repo.save(a);
		
	}

	public Author getAuthorByName(String name) {
		Author a=this.repo.findByName(name);
		return a;
	}
}
