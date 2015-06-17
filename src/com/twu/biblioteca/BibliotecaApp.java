package com.twu.biblioteca;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private Biblioteca biblioteca;

    public BibliotecaApp(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Cat in the Hat", "Dr. Seuss", "1957"));
        books.add(new Book("The Green Egg and Ham", "Dr. Seuss", "1960"));
        Biblioteca biblioteca = new Biblioteca(System.out, books);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca);
        bibliotecaApp.start();
    }

    public void start() {
        biblioteca.printWelcomeMessage();
//        printBookList();
    }

}
