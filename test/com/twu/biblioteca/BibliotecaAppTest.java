package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private Biblioteca biblioteca;

    @Before
    public void setup() {
        biblioteca = mock(Biblioteca.class);
        bibliotecaApp = new BibliotecaApp(biblioteca);
    }


    @Test
    public void shouldPrintWelcomeWhenCalled() {
        bibliotecaApp.start();

        verify(biblioteca).printWelcomeMessage();
    }

    @Test
    public void shouldListBooksWhenAppStarts() {
        bibliotecaApp.start();

        verify(biblioteca).listBooks();
    }

    @Test
    public void shouldPrintColumnHeaders(){
        bibliotecaApp.start();

        verify(biblioteca).printColumnHeaders();
    }

}