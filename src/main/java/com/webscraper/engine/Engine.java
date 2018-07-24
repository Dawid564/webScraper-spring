package com.webscraper.engine;


import com.webscraper.file.FileManager;

public class Engine {

    private String searchEngine;

    public Engine(String[] args){
        String link = args[0];
        initSiteDownload(link);
        saveLink(link);
    }

    private void saveLink(String link){
        FileManager fileManager = new FileManager();
        
    }

    private void initSiteDownload(String link){
        DownloadSite downloadSite = new DownloadSite(link);
    }

}
