package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;
    private MainMenu menu;

    public BibliotecaApp(Biblioteca biblioteca, MainMenu menu) {
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Cat in the Hat", "Dr. Seuss", "1957"));
        books.add(new Book("The Green Egg and Ham", "Dr. Seuss", "1960"));
        Biblioteca biblioteca = new Biblioteca(System.out, books);
        MainMenu menu = new MainMenu(System.out);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca, menu);
        bibliotecaApp.start();
    }

    public void start() {
        biblioteca.printWelcomeMessage();
        menu.printMenuOptions();
    }

    public void listBookOption() {
        biblioteca.printColumnHeaders();
        biblioteca.listBooks();
    }

}
