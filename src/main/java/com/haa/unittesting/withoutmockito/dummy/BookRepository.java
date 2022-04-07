package com.haa.unittesting.withoutmockito.dummy;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAll();
}
