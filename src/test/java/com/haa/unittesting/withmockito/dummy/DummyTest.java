package com.haa.unittesting.withmockito.dummy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DummyTest {

    @Test
    public void dummyTestDouble() {

        BookRepository bookRepository = mock(BookRepository.class);
        EmailRepository emailRepository = mock(EmailRepository.class);

        BookService bookService = new BookService(bookRepository, emailRepository);

        List<Book> books = new ArrayList<>();
        books.add(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
        books.add(new Book("1235", "Junit4 In Action", 200, LocalDate.now()));

        when(bookRepository.findAll()).thenReturn(books);

        assertEquals(2, bookService.findNoOfBooks());
    }

}