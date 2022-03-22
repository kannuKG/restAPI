package com.nagarro.appRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.appRest.model.Author;

public interface AuthorRepository extends JpaRepository<Author ,Integer> {
	
	public Author findByName(String Name);
	
}
