package com.example.springtestrun.repository;

import com.example.springtestrun.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
