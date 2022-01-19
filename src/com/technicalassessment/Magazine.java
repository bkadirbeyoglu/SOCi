package com.technicalassessment;

import java.util.Date;
import java.util.HashMap;

public class Magazine extends BookShelfItem {
    private final String name;
    private final Date publicationDate;

    Magazine(String name, Date publicationDate, HashMap pageAndText) {
        super(pageAndText);
        this.name = name;
        this.publicationDate = publicationDate;
    }
}
