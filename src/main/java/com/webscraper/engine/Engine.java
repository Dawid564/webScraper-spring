package com.webscraper.engine;


public class Engine {

    private String searchEngine;

    public Engine(String[] args){
        String link = args[0];
        DownloadSite downloadSite = new DownloadSite(link);

    }

}
