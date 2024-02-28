package com.book.bookdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.bookdetails.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{

    
    
}
