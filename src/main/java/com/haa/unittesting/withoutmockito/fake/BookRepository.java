package com.haa.unittesting.withoutmockito.fake;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAll();
}
