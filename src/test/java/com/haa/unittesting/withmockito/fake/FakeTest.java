package com.haa.unittesting.withmockito.fake;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class FakeTest {

    @Test
    public void fakeTestWithMockito() {

        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> books = new ArrayList<>();
        books.add(new Book("1234", "Mockito In Action", 250, LocalDate.now()));
        books.add(new Book("1235", "Junit4 In Action", 200, LocalDate.now()));

        Mockito.when(bookRepository.findAll()).thenReturn(books);

        assertEquals(2, bookService.findNoOfBooks());

    }
}
