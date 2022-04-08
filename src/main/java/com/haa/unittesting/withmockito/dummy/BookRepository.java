package com.haa.unittesting.withmockito.dummy;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAll();
}
