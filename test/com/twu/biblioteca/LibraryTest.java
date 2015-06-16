package com.twu.biblioteca;


import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldListNoBooksWhenThereIsNoBook(){
        PrintStream printStream = mock(PrintStream.class);
        List<String> books = new ArrayList<>();

        Library library = new Library(printStream, books);

        library.listBooks();

        verify(printStream).println("");
    }

    @Test
    public void shouldListTheBookNameWhenThereIsOneBook(){
        PrintStream printStream = mock(PrintStream.class);
        List<String> books = new ArrayList<>();
        books.add("Harry Potter");
        Library library = new Library(printStream, books);
        library.listBooks();

        verify(printStream).println("Harry Potter");

    }
}
