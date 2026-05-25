package com.senior.engineer.course.readinglistservice.util;

import java.util.Collection;
import java.util.function.Predicate;

public final class CollectionUtils {

  private CollectionUtils() {
    // empty constructor
  }

  public static <T> long countIf(Collection<? extends T> collection, Predicate<? super T> predicate) {
    long count = 0;
    for (T element : collection) {
      if (predicate.test(element)) {
        count++;
      }
    }
    return count;
  }
}
