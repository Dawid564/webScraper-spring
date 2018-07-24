package com.webscraper.engine;


import com.webscraper.file.FileManager;
import com.webscraper.searchEngine.SearchFactory;

public class Engine {

    private String searchEngine;

    public Engine(String[] args){
        String link = args[0];
        initSiteDownload(link);
        saveLink(link);
    }

    //TODO save website adress into file
    private void saveLink(String link){
        FileManager fileManager = new FileManager();

    }

    private void initSiteDownload(String link){
        DownloadSite downloadSite = new DownloadSite(link);

    }

    private void parseSite(String data){
        SearchFactory searchFactory = new SearchFactory();
        //searchFactory se
    }

}
