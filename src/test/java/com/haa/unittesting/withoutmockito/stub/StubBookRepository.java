package com.haa.unittesting.withoutmockito.stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StubBookRepository implements BookRepository {

    @Override
    public List<Book> findNewBooks(int days) {
        List<Book> newBook = new ArrayList<>();
        newBook.add(new Book("1234", "Mockito In Action", 500, LocalDate.now()));
        newBook.add(new Book("1235", "Junit4 In Action", 450, LocalDate.now()));
        return newBook;
    }

}
