package com.haa.unittesting.withoutmockito.dummy;

public class BookService {

    private BookRepository bookRepository;
    private EmailRepository emailRepository;

    public BookService(BookRepository bookRepository, EmailRepository emailRepository) {
        this.bookRepository = bookRepository;
        this.emailRepository = emailRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public int findNoOfBooks() {
        return bookRepository.findAll().size();
    }
}
