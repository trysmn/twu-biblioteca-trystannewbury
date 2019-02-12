package com.twu.biblioteca;

import org.junit.Test;

import java.awt.print.Book;
import java.util.HashMap;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BookTests {

    @Test
    public void shouldViewAll() {

        Book book1;
        Book book2;
        Book book3;
        ArrayList<Book> arrayOfBooks;
        HashMap<String, Integer> intHash;
        HashMap<String, String> stringHash;

        intHash = new HashMap<String, Integer>;
        stringHash = new HashMap<String, String>;

        stringHash.put("title", "The Firm");
        stringHash.put("author", "John Grisham");
        intHash.put("publicationYear", 1991);
        intHash.put("availability", 0);
        book1 = new Book(intHash, stringHash);

        stringHash.put("title", "1984");
        stringHash.put("author", "George Orwell");
        intHash.put("publicationYear", 1949);
        intHash.put("availability", 1);
        book2 = new Book(intHash, stringHash);

        stringHash.put("title", "Frankenstein");
        stringHash.put("author", "Mary Shelley");
        intHash.put("publicationYear", 1823);
        intHash.put("availability", 0);
        book3 = new Book(intHash, stringHash);

        arrayOfBooks = new ArrayList<Book>;

        for (Book book : arrayOfBooks) {

        }

        assertEquals(,result);

    }

    @Test
    public void shouldViewAuthorAndPubYear() {

    }

}