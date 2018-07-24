package com.webscraper.engine;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadSite {

    private String web = null;

    public DownloadSite(String link){
        download(link);
    }

    private void download(String link){
        URL website = null;
        try {
            website = new URL(link);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            ByteBuffer bb = ByteBuffer.allocate(10);

            System.out.println(rbc.read(ByteBuffer.allocate(10)));
            int n;
            String msg = "";
            while((n=rbc.read(bb)) > -1){
                bb.rewind();

                for(int i=0; i<n; i++){
                    msg = msg + (char) bb.get();
                }

            }
            //System.out.println(msg);
            web = msg;
            //FileOutputStream fos = new FileOutputStream("info.html");
            //fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getWebsite(){
        return this.web;
    }
}
