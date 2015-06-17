package com.twu.biblioteca;

/**
 * Created by jmann on 6/17/15.
 */
public class Book {
    String bookName;
    String author;
    int publishedYear;

    public Book(String bookName, String author, int publishedYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String printFormat() {
        return bookName+" | "+author+" | "+publishedYear;
    }
}
