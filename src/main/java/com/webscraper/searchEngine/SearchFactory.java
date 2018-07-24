package com.webscraper.searchEngine;

public class SearchFactory {

    public enum search{LINKS, COMMENT}

    public void getSearchEngine(search type){
        switch (type){
            case LINKS:
                System.out.println("links");
                break;
            case COMMENT:
                System.out.println("comment");
                break;
        }
    }
}
