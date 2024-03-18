package com.example.springtestrun.service;

import com.example.springtestrun.domain.Book;
import com.example.springtestrun.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class BookServiceImpl implements ModelService<Book> {

    private BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
