package com.nagarro.appRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.appRest.model.Books;
import com.nagarro.appRest.service.BookService;

@RestController
public class LibraryController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Books> show(){
		return bookService.getBooks();
	}
	@GetMapping("/books/{id}")
	public ResponseEntity<Books> getById(@PathVariable("id") int id){
		Books book=bookService.getBookById(id);
		System.out.print("book");
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
	@PostMapping("/books")
	public void add(@RequestBody Books b) {
		bookService.addBook(b);
		System.out.println("Book Added");
	}
	@PutMapping("/books")
	public void update(@RequestBody Books b) {
		bookService.updateBook(b);
		System.out.println("Book Updated");
	}
	@DeleteMapping("/books/{book_id}")
	public void delete(@PathVariable("book_id") String book_id) {
		bookService.deleteBook(Integer.parseInt(book_id));
		System.out.println("Book Deleted");
	}
}
