package com.edureka.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edureka.books.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{
    
}
