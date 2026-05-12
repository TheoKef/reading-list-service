package com.senior.engineer.course.readinglistservice.repository;

import com.senior.engineer.course.readinglistservice.domain.Book;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

  Optional<Book> findByIsbn(String isbn);
}
