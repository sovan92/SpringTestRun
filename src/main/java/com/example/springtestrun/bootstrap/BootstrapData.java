package com.example.springtestrun.bootstrap;

import com.example.springtestrun.domain.Author;
import com.example.springtestrun.domain.Book;
import com.example.springtestrun.domain.Publisher;
import com.example.springtestrun.repository.AuthorRepository;
import com.example.springtestrun.repository.BookRepository;
import com.example.springtestrun.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    BookRepository bookRepository;
    AuthorRepository authorRepository;
    PublisherRepository publisherRepository;
    public void run(String... args) throws Exception {

        Book book1 = createBook("Alpha", "1234");
        book1 = bookRepository.save(book1);

        Book book2 = createBook("Beta", "891011");
        book2 = bookRepository.save(book2);

        Publisher p1 = createPublisher("Alpha" , "7890 Brunswick street","95111", "CA");
        p1 = publisherRepository.save(p1);

        p1.getBooks().add(book1);
        p1.getBooks().add(book2);

        book1.setPublisher(p1);
        book2.setPublisher(p1);

        bookRepository.save(book1);
        bookRepository.save(book2);

        publisherRepository.save(p1);

        Author author1 = createAuthor("auth1", "auth1");
        author1 = authorRepository.save(author1);
        Author author2 = createAuthor("auth2", "auth2");
        author2 = authorRepository.save(author2);



        book1.getAuthors().add(author1);
        book1.getAuthors().add(author2);
        bookRepository.save(book1);



        book2.getAuthors().add(author2);
        bookRepository.save(book2);

        author1.getBooks().add(book1);
        author2.getBooks().add(book1);

        author2.getBooks().add(book2);

        authorRepository.save(author1);
        authorRepository.save(author2);




    }

    private Book createBook(String name, String isbn){
        Book b = new Book();
        b.setName(name);
        b.setIsbn(isbn);
        return b;
    }

    private Author createAuthor(String firstName, String lastName){

        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return author;
    }

    private Publisher createPublisher(String name, String address, String zip, String state){
        Publisher publisher = new Publisher();
        publisher.setName(name);
        publisher.setAddress(address);
        publisher.setState(state);
        publisher.setZip(zip);

        return publisher;
    }

}
