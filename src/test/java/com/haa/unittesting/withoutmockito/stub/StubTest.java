package com.haa.unittesting.withoutmockito.stub;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class StubTest {

    @Test
    public void stubTestDouble() {

        BookRepository bookRepository = new StubBookRepository();
        BookService bookService = new BookService(bookRepository);

        List<Book> newBookWithDiscount = bookService.getNewBookWithAppliedDiscount(10, 7);

        assertEquals(2, newBookWithDiscount.size());
        assertEquals(450, newBookWithDiscount.get(0).getPrice());
        assertEquals(405, newBookWithDiscount.get(1).getPrice());
    }

}
