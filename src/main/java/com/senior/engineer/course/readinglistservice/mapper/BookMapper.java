package com.senior.engineer.course.readinglistservice.mapper;

import com.senior.engineer.course.readinglistservice.domain.Book;
import com.senior.engineer.course.readinglistservice.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

  BookDto toDto(Book book);

  Book toEntity(BookDto bookDto);
}
