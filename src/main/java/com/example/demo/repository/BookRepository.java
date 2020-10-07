package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book> findByIsbnAndIsActiveTrue(String isbn);
    Optional<Book>findByBookIdAndIsActiveTrue(long bookId);
    Optional<Book> findByAuthorAndIsActiveTrue(String author);


}
