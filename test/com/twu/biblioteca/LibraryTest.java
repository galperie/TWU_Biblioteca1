package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class LibraryTest {


    PrintStream printStream;
    List<String> books;
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
        books.add("Harry Potter");

        library.listBooks();

        verify(printStream).println("Harry Potter");
    }

    @Test
    public void shouldListAllBooksNamesWhenThereAreMultipleBooks() {
        books.add("Oh, The Places You'll Go!");
        books.add("Cat In The Hat");
        books.add("Green Eggs and Ham");

        library.listBooks();

        verify(printStream).println("Oh, The Places You'll Go!");
        verify(printStream).println("Cat In The Hat");
        verify(printStream).println("Green Eggs and Ham");

    }
}
