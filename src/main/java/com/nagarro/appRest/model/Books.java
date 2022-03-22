package com.nagarro.appRest.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int book_code;
	private String book_name;
	@OneToOne(cascade=CascadeType.ALL)
	private Author Author;
	private String Date_added;
	public int getBook_code() {
		return book_code;
	}
	public void setBook_code(int book_code) {
		this.book_code = book_code;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	public String getDate_added() {
		return Date_added;
	}
	public void setDate_added(String date_added) {
		Date_added = date_added;
	}
}
