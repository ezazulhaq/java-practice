package com.haa.unittesting.withoutmockito.dummy;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class DummyTest {

    @Test
    public void dummyTestDouble() {

        BookRepository bookRepository = new DummyBookRepository();
        EmailRepository emailRepository = new DummyEmailRepository();

        BookService bookService = new BookService(bookRepository, emailRepository);

        bookService.addBook(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("1235", "Junit4 In Action", 200, LocalDate.now()));

        assertEquals(2, bookService.findNoOfBooks());
    }

}