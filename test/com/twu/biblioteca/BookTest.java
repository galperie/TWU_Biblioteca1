package com.twu.biblioteca;

/**
 * Created by jmann on 6/17/15.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void bookFormatShouldReturnBookNameAndAuthorAndYear(){
        String bookName = "ABC";
        String author = "Person";
        int year = 2000;
        Book book = new Book(bookName, author, year);

        assertEquals(book.printFormat(), bookName + " | " + author + " | " + year);
    }
}
