package com.willianmendesf.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.willianmendesf.bookstoremanager.dto.BookDTO;
import com.willianmendesf.bookstoremanager.entity.Book;

@Mapper
public interface BookMapper {

	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	Book toModel(BookDTO bookDTO);

	BookDTO toDTO(Book book);

}
