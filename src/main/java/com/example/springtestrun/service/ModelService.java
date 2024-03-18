package com.example.springtestrun.service;

import com.example.springtestrun.domain.Book;
import com.example.springtestrun.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



public interface ModelService<T> {
    Iterable<T> findAll();
}
