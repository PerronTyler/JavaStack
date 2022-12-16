package com.tyler.bookclub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyler.bookclub.models.Book;
import com.tyler.bookclub.models.User;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	Optional<Book> findByUser(User user);
	List<Book> findAll();
}
