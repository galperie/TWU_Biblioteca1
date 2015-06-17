package com.twu.biblioteca;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {


    @Test
    public void shouldPrintWelcomeWhenCalled() {
        Biblioteca biblioteca = mock(Biblioteca.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca);

        bibliotecaApp.start();

        verify(biblioteca).printWelcomeMessage();
    }



}