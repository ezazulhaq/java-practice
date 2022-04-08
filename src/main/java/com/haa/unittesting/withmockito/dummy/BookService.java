package com.haa.unittesting.withmockito.dummy;

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

    public void sendEmail(String message) {
        emailRepository.sendEmail(message);
    }
}
