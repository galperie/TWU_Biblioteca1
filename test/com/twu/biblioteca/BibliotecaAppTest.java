package com.twu.biblioteca;


import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
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