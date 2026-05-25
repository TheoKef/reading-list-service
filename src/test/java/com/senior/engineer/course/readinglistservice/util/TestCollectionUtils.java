package com.senior.engineer.course.readinglistservice.util;

import com.senior.engineer.course.readinglistservice.domain.model.Book;
import java.util.List;
import java.util.function.Predicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCollectionUtils {

  @Test
  public void test_countIf() {
    Predicate<? super Book> bookPredicate = book -> book.getPages() > 300;
    List<Book> books = createBooks();
    long booksWithThreeHundredPagesAndMore = CollectionUtils.countIf(books, bookPredicate);
    Assertions.assertEquals(2, booksWithThreeHundredPagesAndMore);
  }

  @Test
  public void test_countIf_paperBackBook() {
    Predicate<? super Book> bookPredicate = book -> book.getPages() > 300;
    List<Book> books = createBooks();
    long booksWithThreeHundredPagesAndMore = CollectionUtils.countIf(books, bookPredicate);
    Assertions.assertEquals(2, booksWithThreeHundredPagesAndMore);
  }

  private List<Book> createBooks() {
    Book firstBook = new Book(1L, "title", "author", "isbn", 2020, 3500);
    Book secondBook = new Book(2L, "title2", "author2", "isbn2", 2021, 150);
    Book thirdBook = new Book(3L, "title3", "author3", "isbn3", 2022, 1000);
    return List.of(firstBook, secondBook, thirdBook);
  }
}
