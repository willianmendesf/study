package com.willianmendesf.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianmendesf.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
