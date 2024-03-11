package com.example.springtestrun.repository;

import com.example.springtestrun.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
