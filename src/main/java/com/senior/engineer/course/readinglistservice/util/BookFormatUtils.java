package com.senior.engineer.course.readinglistservice.util;

import com.senior.engineer.course.readinglistservice.domain.model.Audiobook;
import com.senior.engineer.course.readinglistservice.domain.model.BookFormat;
import com.senior.engineer.course.readinglistservice.domain.model.Ebook;
import com.senior.engineer.course.readinglistservice.domain.model.Hardcover;
import com.senior.engineer.course.readinglistservice.domain.model.Paperback;

public final class BookFormatUtils {

  private BookFormatUtils() {
    // empty constructor
  }

  /**
   * Returns the description of the book format.
   * @param format - Book format
   * @return The format of the book
   */
  public static String getFormatDescription(BookFormat format) {

    return switch (format) {
      case Paperback(int pageCount) -> "Paperback: " + pageCount + " pages";
      case Hardcover(int pageCount) -> "Hardcover: " + pageCount + " pages";
      case Ebook(int fileSizeKB) -> "Ebook: " + fileSizeKB + " KB";
      case Audiobook(int durationInMinutes) -> {
        int hours = durationInMinutes / 60;
        yield "Audiobook: " + hours + " hours";
      }
    };
  }
}
