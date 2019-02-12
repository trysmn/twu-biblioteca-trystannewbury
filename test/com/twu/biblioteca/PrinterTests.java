package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {

  @Test
  public void shouldWelcome() {
    String welcomeMessage;

    welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    Printer printerWelcome = new Printer(welcomeMessage);

    assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", printerWelcome.shouldWelcome());

  }

}
