package com.twu.biblioteca;

import java.util.HashMap;

public class BibliotecaApp {

    public static void main(String[] args) {

        Printer newPrinter = new Printer("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println(newPrinter.shouldWelcome());

        HashMap<Integer, String> hash;
        hash = new HashMap<Integer, String>();

        hash.put(1, "View all books");
        hash.put(2, "Checkout a book");
        hash.put(3, "Return a book");
        hash.put(4, "Quit application");
        Menu newMenu = new Menu(hash);

        System.out.println(newMenu.showAllOptions());

    }
}


