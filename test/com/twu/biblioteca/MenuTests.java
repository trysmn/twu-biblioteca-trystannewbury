package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MenuTests {

    @Test
    public void showAllOptions() {

        HashMap<Integer, String> hash;
        hash = new HashMap<Integer, String>();

        hash.put(1, "View all books");
        hash.put(2, "Checkout a book");
        hash.put(3, "Return a book");
        hash.put(4, "Quit application");

        Menu newMenu = new Menu(hash);

        String result = newMenu.showAllOptions();

        assertEquals("View all booksCheckout a bookReturn a bookQuit application", result);

    }

}
