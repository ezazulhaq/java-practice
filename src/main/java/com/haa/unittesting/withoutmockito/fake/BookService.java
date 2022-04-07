package com.haa.unittesting.withoutmockito.fake;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public int findNoOfBooks() {
        return bookRepository.findAll().size();
    }
}
