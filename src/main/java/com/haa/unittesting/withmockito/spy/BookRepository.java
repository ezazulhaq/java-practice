package com.haa.unittesting.withmockito.spy;

import java.util.List;

public interface BookRepository {

    List<Book> findNewBooks(int days);
}
