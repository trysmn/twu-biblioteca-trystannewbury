package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

  @Test
  public void shouldWelcome() {
    String welcomeMessage;

    welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    Printer printerWelcome = new Printer(welcomeMessage);

    assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", printerWelcome.shouldWelcome());

  }

//  @Test
//  public void menuOptions() {
//    String mainMenuTitle;
//    HashMap<Integer, String> menu;
////    String optionOne;
////    String optionTwo;
////    String optionThree;
////    String optionFour;
//
//    menu = new HashMap<Integer, String>();
//    mainMenuTitle = "Main menu: Please choose one of the following options by typing its number:";
//    menu.put(1, "View all books");
//    menu.put(2, "Checkout a book");
//    menu.put(3, "Return a book");
//    menu.put(4, "Quit application");
////    optionOne = "1. View all books";
////    optionTwo = "2. Checkout a book";
////    optionThree = "3. Return a book";
////    optionFour = "4. Quit application";
//
//    Printer printerMenuTitle = new Printer(mainMenuTitle);
//    Printer printerMenuOptionOne = new Printer(menu.get(1));
//    Printer printerMenuOptionTwo = new Printer(menu.get(2));
//    Printer printerMenuOptionThree = new Printer(menu.get(3));
//    Printer printerMenuOptionFour = new Printer(menu.get(4));
//
//    assertEquals("Main menu: Please choose one of the following options by typing its number:", printerMenuTitle.menuOptions());
//    assertEquals("View all books", printerMenuOptionOne.menuOptions());
//    assertEquals("Checkout a book", printerMenuOptionTwo.menuOptions());
//    assertEquals("Return a book", printerMenuOptionThree.menuOptions());
//    assertEquals("Quit application", printerMenuOptionFour.menuOptions());
//
//  }
}
