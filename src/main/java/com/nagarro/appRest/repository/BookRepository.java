package com.nagarro.appRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.appRest.model.Books;

public interface BookRepository extends JpaRepository<Books,Integer>{

}
