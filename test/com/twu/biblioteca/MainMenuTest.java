package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by egalperi on 6/17/15.
 */
public class MainMenuTest {

    @Test
    public void shouldPrintAllMenuOptions() {
        PrintStream printStream = mock(PrintStream.class);
        MainMenu menu = new MainMenu(printStream);

        menu.printMenuOptions();

        verify(printStream).println("1. List Books");
    }
}