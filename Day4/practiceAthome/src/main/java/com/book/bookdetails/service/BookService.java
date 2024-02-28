package com.book.bookdetails.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.book.bookdetails.model.Book;
import com.book.bookdetails.repository.BookRepo;

@Service
public class BookService {
    private BookRepo bookRepo;
    public BookService(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }
    public Book postBook(Book book){
        return bookRepo.save(book);
    }
    public List<Book> getBookList(){
        return bookRepo.findAll();
    }
    public Book getBookId(int bookId){
        return bookRepo.findById(bookId).orElse(null);
    }
}
