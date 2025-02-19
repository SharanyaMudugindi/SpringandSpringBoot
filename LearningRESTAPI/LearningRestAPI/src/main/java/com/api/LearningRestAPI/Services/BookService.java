
package com.api.LearningRestAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.LearningRestAPI.Entity.Book;

@Component
public class BookService {
	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(2,"Bla","Bla"));
		list.add(new Book(3,"Blazzer","ABC"));
		list.add(new Book(4,"Cinderella","DEF"));
		list.add(new Book(5,"Game of thrones","GHI"));
		}
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	//get single book by id
	public Book getBookById(int id)
	{
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	//POST
	public boolean addBook(Book book)
	{
		 list.add(book);
		 return true;
	}
	//DELETE
	//Delete All
	public boolean deleteAllBooks()
	{
		list.removeAll(list);
		return true;
	}
	//Delete by id
	public boolean deleteById(int id)
	{
		list.removeIf(book->book.getId()==id);
		return true;
	}
	//UPDATE
	/*public Book updateBook(Book book,int id)
	{
		book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		
		return book;
	}*/
	public Book updateBook(Book book, int bookId) {
	   
	    for (Book b : list) {
	        if (b.getId() == bookId) {
	            b.setTitle(book.getTitle());  // Update the title
	            b.setAuthor(book.getAuthor());  // Update the author
	            return b;  // Return the updated book
	        }
	    }
	    return null;  // Return null if no book was found with the given ID
	}


	
	
}
