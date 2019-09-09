package com.webscraper.engine;


import com.webscraper.file.FileManager;
import com.webscraper.searchEngine.SearchFactory;

public class Engine {

    private String searchEngine;
    private FileManager fileManager = null;


    public Engine(String[] args){
        String link = args[0];
        saveLink(link);
        initSiteDownload(link);
    }

    //TODO save website adress into file
    private void saveLink(String link){
        this.fileManager = new FileManager();

    }

    private void initSiteDownload(String link){
        DownloadSite downloadSite = new DownloadSite(link);
        parseSite(downloadSite.getWebsite());
    }

    private void parseSite(String data){
        SearchFactory searchFactory = new SearchFactory();
        //searchFactory se
    }

}
