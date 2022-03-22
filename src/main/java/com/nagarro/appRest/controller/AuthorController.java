package com.nagarro.appRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.appRest.model.Author;
import com.nagarro.appRest.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/author")
	public List<Author> showAuthor(){
		return authorService.getAuthors();
	}
	@PostMapping("/author")
	public void add(@RequestBody Author a) {
		authorService.addAuthors(a);
	}
//	@GetMapping("/author/{author_name}")
//	public Author getAuthorByname(@PathVariable("author_name") String name) {
//		return authorService.getAuthorByName(name);
//		
//	}
}
