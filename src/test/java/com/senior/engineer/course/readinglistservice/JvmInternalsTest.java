package com.senior.engineer.course.readinglistservice;

import com.senior.engineer.course.readinglistservice.domain.Book;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.DriverManager;
import java.util.ArrayList;
public class JvmInternalsTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(JvmInternalsTest.class);

  @Test
  void demonstrateClassLoaders() {
    LOGGER.info("ClassLoader for Book.class: {}", Book.class.getClassLoader());
    LOGGER.info("ClassLoader for DriverManager.class: {}", DriverManager.class.getClassLoader());
    LOGGER.info("ClassLoader for ArrayList.class: {}", ArrayList.class.getClassLoader());
  }
}
