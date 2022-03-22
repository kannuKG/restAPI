package com.nagarro.appRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.appRest.model.Books;
import com.nagarro.appRest.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository repo;
	
	public List<Books> getBooks() {
		return repo.findAll();
	}

	public void addBook(Books b) {
		repo.save(b);
	}

	public void updateBook(Books b) {
		repo.save(b);
	}
	public void deleteBook(int b_id) {
		Books b=repo.getById(b_id);
		repo.delete(b);
	}
	public Books getBookById(int id){
		return repo.getById(id);
		
	}

}
