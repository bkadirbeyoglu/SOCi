package com.technicalassessment;

import java.util.HashMap;

public class Notebook extends BookShelfItem {
    private final String owner;

    Notebook(String owner, HashMap pageAndText) {
        super(pageAndText);
        this.owner = owner;;
    }
}
