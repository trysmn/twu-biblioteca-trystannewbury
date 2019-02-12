package com.twu.biblioteca;

public class Printer {

  String printedString;

  public Printer(String stringToBePrinted) {

    printedString = stringToBePrinted;

  }

  public String shouldWelcome() {

    return printedString;

  }

}
