package com.tutong.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutong.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
