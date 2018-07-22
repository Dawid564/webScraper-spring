package com.webscraper.engine;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadSite {

    public DownloadSite(String link){
        download(link);
    }

    private void download(String link){
        URL website = null;
        try {
            website = new URL(link);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("info.html");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
