package com.senior.engineer.course.readinglistservice.domain.model;

public sealed interface BookFormat permits Paperback, Hardcover, Ebook, Audiobook{
}

