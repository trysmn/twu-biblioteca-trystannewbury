package com.twu.biblioteca;

import java.util.HashMap;

public class Menu {

    HashMap<Integer, String> menu;

    public Menu(HashMap<Integer, String> optionsHash) {

        menu = optionsHash;

    }

    public String showAllOptions() {

        String emptyString;
        emptyString = "";

        for (Integer option : menu.keySet()) {

            Printer options = new Printer(menu.get(option));
            emptyString += options.shouldWelcome();

        }

        return emptyString;

    }

}
