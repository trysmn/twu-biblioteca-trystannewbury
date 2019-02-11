package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

  @Test
  public void getString() {
    String welcomeMessage;

    welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    Printer printerWelcome = new Printer(welcomeMessage);

    assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", printerWelcome.getString());
  }
}
