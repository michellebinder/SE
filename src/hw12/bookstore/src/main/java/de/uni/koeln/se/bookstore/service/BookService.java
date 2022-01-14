package de.uni.koeln.se.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Service;

import de.uni.koeln.se.bookstore.datamodel.Book;
import de.uni.koeln.se.bookstore.repository.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	// methods for operating with the database
	
	// get a list of all the books available in the database
	public List<Book> findBooks(){
		
		return bookRepo.findAll();
	}
	
	// find a book by its Id
	public Optional<Book> fetchBook(int id){
		
		return bookRepo.findById(id);
	}
	
	// add a new book to the database
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}
	
	// delete a book from the database
	public boolean deleteBook(int id) {
		
		boolean status;
		try {
			bookRepo.deleteById(id);
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}
	
	public Book getOldest() {
		
		List <Book> sortedBooksASC = bookRepo.findAll(JpaSort.by(JpaSort.Direction.ASC,"year"));
	
		return 	sortedBooksASC.get(0);
	}
	
	public Book getMostRecent() {
		
		List <Book> sortedBooksDESC = bookRepo.findAll(JpaSort.by(JpaSort.Direction.DESC,"year"));
		
		return sortedBooksDESC.get(0);
}
}