package com.tyler.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tyler.bookclub.models.Book;
import com.tyler.bookclub.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepo;
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> getAll(){
		return bookRepo.findAll();
	}
	public Book create(Book book) {
		return bookRepo.save(book);
	}
	public Book getBook(Long id) {
		Optional<Book> potentialBook = bookRepo.findById(id);
		return potentialBook.isPresent() ? potentialBook.get() : null;
	}
	public Book update(Long id, String title, String author, String thoughts) {
		Book bookToBeUpdated = new Book(title,author, thoughts);
		return bookRepo.save(bookToBeUpdated);
	}
	public Book update(Book book) {
		return bookRepo.save(book);
	}
	public String deleteById(Long id) {
		bookRepo.deleteById(id);
		return "You have deleted the record with the id of: " + id;
	}

}
