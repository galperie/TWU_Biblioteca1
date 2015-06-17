package com.twu.biblioteca;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {


    @Test
    public void shouldPrintWelcomeWhenCalled() {
        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printStream);

        bibliotecaApp.printWelcomeMessage();

        verify(printStream).println("Welcome to the Library!");

    }
}