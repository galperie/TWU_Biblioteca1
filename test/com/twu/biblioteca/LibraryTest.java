package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class LibraryTest {


    PrintStream printStream;
    List<Book> books;
    Library library;

    @Before
    public void setup() {

        printStream = mock(PrintStream.class);
        books = new ArrayList<>();
        library = new Library(printStream, books);

    }

    @Test
    public void shouldListNoBooksWhenThereIsNoBook(){
        library.listBooks();

        verify(printStream, never()).println(anyString());
    }

    @Test
    public void shouldListTheBookNameWhenThereIsOneBook(){
        Book book = mock(Book.class);
        when(book.printFormat()).thenReturn("Book name & detail");
        books.add(book);

        library.listBooks();

        verify(printStream).println("Book name & detail");
    }

    @Test
    public void shouldListAllBooksNamesWhenThereAreMultipleBooks() {
        Book book = mock(Book.class);
        when(book.printFormat()).thenReturn("Book1 name & detail");
        books.add(book);
        book = mock(Book.class);
        when(book.printFormat()).thenReturn("Book2 name & detail");
        books.add(book);


        library.listBooks();

        verify(printStream).println("Book1 name & detail");
        verify(printStream).println("Book2 name & detail");
    }
}
