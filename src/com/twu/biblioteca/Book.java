package com.twu.biblioteca;

import java.util.HashMap;

public class Book {

    String author;
    String title;
    Integer publicationYear;
    Integer availability;

    public Book(HashMap<String, Integer> intHash,  HashMap<String, String> stringHash) {

        author = stringHash.get("author");
        title = stringHash.get("title");
        publicationYear = intHash.get("publicationYear");
        availability = intHash.get("availability");

    }

}
