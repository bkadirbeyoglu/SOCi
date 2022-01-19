package com.technicalassessment;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BookShelf {

    private static final int CAPACITY = 100;
    private List<BookShelfItem> bookShelfItems;
    private int numberOfBookShelfItems = 0;

    public BookShelf() {
        bookShelfItems = new ArrayList<BookShelfItem>(CAPACITY);

        seed();
    }

    public int getAvailableCapacity() {
        return CAPACITY - getNumberOfBookShelfItems();
    }

    public int getNumberOfBookShelfItems() {
        return bookShelfItems.size();
    }

    public void storeBookShelfItem(BookShelfItem bookShelfItem) {
        if (!bookShelfItems.contains(bookShelfItem)) {
            bookShelfItems.add(bookShelfItem);
        }
    }

    public int retrieveBookShelfItem(BookShelfItem bookShelfItem) {
        if (bookShelfItems.contains(bookShelfItem)) {
            return bookShelfItems.indexOf(bookShelfItem);
        }
        return -1;
    }

    public void seed() {
        Book book1 = new Book("Book1Title", "Book1Author", new HashMap<Integer, String>() {{
            put(1, "book1Page1Text");
            put(2, "book1Page2Text");
            put(3, "book1Page3Text");
        }});
        Book book2 = new Book("Book2Title", "Book2Author", new HashMap<Integer, String>() {{
            put(1, "book2Page1Text");
            put(2, "book2Page2Text");
            put(3, "book2Page3Text");
            put(4, "book2Page4Text");
            put(5, "book2Page5Text");
        }});
        Book book3 = new Book("Book3Title", "Book3Author", new HashMap<Integer, String>() {{
            put(1, "book3Page1Text");
            put(2, "book3Page2Text");
        }});
        bookShelfItems.add(book1);
        bookShelfItems.add(book2);
        bookShelfItems.add(book3);

        Magazine magazine1 = new Magazine("Magazine1Name", new Date(), new HashMap<Integer, String>() {{
            put(1, "magazine1Page1Text");
            put(2, "magazine1Page2Text");
            put(3, "magazine1Page3Text");
            put(4, "magazine1Page4Text");
        }});
        Magazine magazine2 = new Magazine("Magazine2Name", new Date(), new HashMap<Integer, String>() {{
            put(1, "magazine2Page1Text");
            put(2, "magazine2Page2Text");
            put(3, "magazine2Page3Text");
        }});
        bookShelfItems.add(magazine1);
        bookShelfItems.add(magazine2);

        Notebook notebook1 = new Notebook("Burak KADİRBEYOĞLU", new HashMap<Integer, String>() {{
            put(1, "notebook1Page1Text");
            put(2, "notebook1Page2Text");
        }});
        Notebook notebook2 = new Notebook("Ryan MYERS", new HashMap<Integer, String>() {{
            put(1, "notebook2Page1Text");
        }});
        bookShelfItems.add(notebook1);
        bookShelfItems.add(notebook2);
    }
}


