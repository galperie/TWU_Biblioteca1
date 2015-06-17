package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by egalperi on 6/17/15.
 */
public class MainMenu {

    private PrintStream printStream;

    public MainMenu(PrintStream printStream) {

        this.printStream = printStream;
    }


    public void printMenuOptions() {
        printStream.println("1. List Books");
    }
}
