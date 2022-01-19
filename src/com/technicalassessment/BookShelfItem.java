package com.technicalassessment;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class BookShelfItem {
    private HashMap<Integer, String> pageAndTexts;

    BookShelfItem(HashMap pageAndText) {
        this.pageAndTexts = pageAndText;
    }

    public String readPage(int pageNumber) {
        if (pageNumber <= pageAndTexts.size()) {
            return pageAndTexts.get(pageNumber);
        }
        return "Not Available";
    }

    public ArrayList<Integer> search(String searchString) {
        ArrayList<Integer> results = new ArrayList();
        for (int i = 1; i <= pageAndTexts.size(); i++) {
            if (pageAndTexts.containsKey(i)) {
                if (pageAndTexts.get(i).contains(searchString)) {
                    results.add(i);
                }
            }
        }
        return results;
    }
}
