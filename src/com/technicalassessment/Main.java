package com.technicalassessment;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        System.out.println(bookShelf.getNumberOfBookShelfItems());
        System.out.println(bookShelf.getAvailableCapacity());

        Book book = new Book("BurakBook", "Burak KADİRBEYOĞLU",  new HashMap<Integer, String>() {{
            put(1, "BurakBookPage1Text who?");
            put(2, "BurakBookPage2Text did what");
            put(3, "BurakBookPage3Text what is this");
            put(4, "BurakBookPage4Text");
        }});

        System.out.println(book.readPage(3));

        System.out.println(book.search("what"));

        bookShelf.storeBookShelfItem(book);

        System.out.println(bookShelf.getNumberOfBookShelfItems());
        System.out.println(bookShelf.getAvailableCapacity());
    }
}


