package de.uni.koeln.se.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.uni.koeln.se.bookstore.datamodel.Book;
import de.uni.koeln.se.bookstore.service.BookService;

@RequestMapping("/bookStore")
@RestController
public class BookController {

	@Autowired
	BookService bookSer;
	
	
	// methods
	
	// a HTTP GET request to fetch all the books
	@GetMapping
	public ResponseEntity<List<Book>> getAllbooks(){
		
		List <Book> books = new ArrayList<Book> ();
		books = bookSer.findBooks();
		
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	// a HTTP GET request to fetch a particular book given its Id
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id){
		
		return new ResponseEntity<>(bookSer.fetchBook(id).get(), HttpStatus.OK);
	}
	
	// a HTTP POST request to add a new book
	@PostMapping
	public ResponseEntity<Book> addBookt (@RequestBody Book book){
		
		bookSer.addBook(book);
		
		return new ResponseEntity<>(book, HttpStatus.CREATED);
	}
	
	// a HTTP DELETE request to remove a particular book from the database
	@DeleteMapping("/{id}")
	public ResponseEntity<Book> removeBookById(@PathVariable int id){
		
		Book book = bookSer.fetchBook(id).get();
		
		if(bookSer.deleteBook(id)) {
			return new ResponseEntity<>(book, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(book, HttpStatus.BAD_REQUEST);
		}
	}
	
	// a HTTP GET request to get the oldest book
		@GetMapping("/oldest")
		public ResponseEntity<Book> getOldest(){
			
			Book books = bookSer.getOldest();
			
			return new ResponseEntity<>(books, HttpStatus.OK);
		}
		
		// a HTTP GET request to get the most recent book
		@GetMapping("/newest")
		public ResponseEntity<Book> getMostRecent(){
			
			Book books = bookSer.getMostRecent();
			
			return new ResponseEntity<>(books, HttpStatus.OK);
		}
}
