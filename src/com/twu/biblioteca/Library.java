package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by jmann on 6/16/15.
 */
public class Library {
    PrintStream printStream;

    public Library(PrintStream printStream, List<String> books){
        this.printStream = printStream;
    }

    public void listBooks() {
        printStream.println("");
    }


}
