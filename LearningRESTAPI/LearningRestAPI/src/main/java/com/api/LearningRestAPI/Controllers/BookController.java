package com.api.LearningRestAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.LearningRestAPI.Entity.Book;
import com.api.LearningRestAPI.Services.BookService;

import org.springframework.web.bind.annotation.RequestMethod;



//@Controller

@RestController
public class BookController {
	
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	//@ResponseBody
	/*@GetMapping("/books")
	public Book getBooks()
	{
		//return "This is testing book first";
		Book book=new Book(1, "The Adventures", "XYZ");
		return book;
		
		
	}*/
	
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getAllBooks();
	}
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return this.bookService.getBookById(id);
	}
	
    @PostMapping("/books")
    public boolean addBook(@RequestBody Book book)
    {
    	this.bookService.addBook(book);
    	return true;
    }
    
    @DeleteMapping("/books")
    public boolean deleteBooks()
    {
    	 this.bookService.deleteAllBooks();
    	 return true;
    		
    }
    @DeleteMapping("/book/{id}")
    public boolean deleteBook(@PathVariable("id") int id)
    {
    	this.bookService.deleteById(id);
    	return true;
    }
    
    //@PutMapping("/book/{id}")
    /*public Book updateBook(@RequestBody Book book,@PathVariable("id") int id)
    {
    	return this.bookService.updateBook(book,id);
    	
    }*/
    @PutMapping("/book/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable("id") int id)
	{
    	
		return this.bookService.updateBook(book,id);
	}
	

}
