package com.haa.unittesting.withoutmockito.stub;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getNewBookWithAppliedDiscount(int discountRate, int days) {
        return bookRepository.findNewBooks(days)
                .stream()
                .map(book -> {
                    int price = book.getPrice();
                    int newPrice = price - (discountRate * price / 100);
                    book.setPrice(newPrice);

                    return book;
                })
                .collect(Collectors.toList());
    }
}
