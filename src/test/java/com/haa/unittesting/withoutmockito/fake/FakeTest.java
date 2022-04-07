package com.haa.unittesting.withoutmockito.fake;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class FakeTest {

    @Test
    public void fakeTestDouble() {

        BookRepository bookRepository = new FakeBookRepository();

        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("1235", "Junit4 In Action", 200, LocalDate.now()));

        assertEquals(2, bookService.findNoOfBooks());
    }

}
