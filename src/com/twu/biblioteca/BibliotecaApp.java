package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private PrintStream printStream;

    public BibliotecaApp(PrintStream printStream) {

        this.printStream = printStream;
    }

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(System.out);
        bibliotecaApp.printWelcomeMessage();
        printBookList();
    }

    private static void printBookList() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Cat in the Hat", "Dr. Seuss", 1957));
        books.add(new Book("The Green Egg and Ham", "Dr. Seuss", 1960));
        Biblioteca biblioteca = new Biblioteca(System.out, books);
        biblioteca.listBooks();
    }


    public void printWelcomeMessage() {
        printStream.println("Welcome to the Biblioteca!");
    }
}
