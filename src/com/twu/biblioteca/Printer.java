package com.twu.biblioteca;

public class Printer {

  String printedString;

  public Printer(String stringToBePrinted) {

    printedString = stringToBePrinted;

  }

  public String shouldWelcome() {

    return printedString;

  }

//  public HashMap<Integer, String> menuOptions() {
//
//    HashMap<Integer, String> menu;
//
//    menu = new HashMap<Integer, String>();
//
//    menu.put(1, "View all books");
//    menu.put(2, "Checkout a book");
//    menu.put(3, "Return a book");
//    menu.put(4, "Quit application");
//
//    return menu;
//
//  }

}
