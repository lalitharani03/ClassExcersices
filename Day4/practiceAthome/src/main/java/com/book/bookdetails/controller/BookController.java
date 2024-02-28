package com.book.bookdetails.controller;

import org.springframework.web.bind.annotation.RestController;

import com.book.bookdetails.model.Book;
import com.book.bookdetails.service.BookService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class BookController {
    private BookService bookService;
    public BookController(BookService bookService){
        this.bookService=bookService;
    }
    @PostMapping("/api/book")
    public ResponseEntity<Book> postBookDetails(@RequestBody Book book) {
        Book bookDetail=bookService.postBook(book);
        if(bookDetail!=null)
        {
            return new ResponseEntity<>(bookDetail,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(bookDetail,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/book")
    public ResponseEntity<List<Book>> getListOfBooks() {
       List<Book>list=bookService.getBookList();
       if(list!=null)
       {
        return new ResponseEntity<>(list,HttpStatus.OK);
       }
       return new ResponseEntity<>(list,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/book/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable("bookId") int bookId) {
        Book getId=bookService.getBookId(bookId);
        if(getId!=null){
            return new ResponseEntity<>(getId,HttpStatus.OK);
        }
        return new ResponseEntity<>(getId,HttpStatus.NOT_FOUND);
    }
    
    
}
