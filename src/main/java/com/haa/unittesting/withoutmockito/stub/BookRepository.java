package com.haa.unittesting.withoutmockito.stub;

import java.util.List;

public interface BookRepository {

    List<Book> findNewBooks(int days);
}
