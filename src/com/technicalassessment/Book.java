package com.technicalassessment;

import java.util.HashMap;

public class Book extends BookShelfItem {
    private final String title;
    private final String author;

    Book(String title, String author, HashMap pageAndText) {
        super(pageAndText);
        this.title = title;
        this.author = author;
    }
}
