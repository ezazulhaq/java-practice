package com.haa.unittesting.withmockito.spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StubTest {

    @Test
    public void stubTestDouble() {

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> books = new ArrayList<>();
        books.add(new Book("1234", "Mockito In Action", 500, LocalDate.now()));
        books.add(new Book("1235", "Junit4 In Action", 450, LocalDate.now()));

        when(bookRepository.findNewBooks(7)).thenReturn(books);

        List<Book> newBookWithDiscount = bookService.getNewBookWithAppliedDiscount(10, 7);

        assertEquals(2, newBookWithDiscount.size());
        assertEquals(450, newBookWithDiscount.get(0).getPrice());
        assertEquals(405, newBookWithDiscount.get(1).getPrice());
    }

}
