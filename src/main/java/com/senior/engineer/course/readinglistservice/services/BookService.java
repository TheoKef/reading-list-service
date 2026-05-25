package com.senior.engineer.course.readinglistservice.services;

import com.senior.engineer.course.readinglistservice.domain.model.Book;
import com.senior.engineer.course.readinglistservice.dto.BookDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookService {

  //private final BookRepository bookRepository;

  public BookDto getBookByIsbn(String isbn) {
    return null;
//    return bookRepository.findByIsbn(isbn)
//               .map(this::toDto)
//               .orElseThrow(() -> new BookNotFoundException("Book with: " + isbn + " not found"));
  }

  public BookDto toDto(Book book) {
    return new BookDto(book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublicationYear());
  }
}
