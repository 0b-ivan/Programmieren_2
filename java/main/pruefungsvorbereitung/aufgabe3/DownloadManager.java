package main.pruefungsvorbereitung.aufgabe3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DownloadManager {
    private URL url;
    Map<DownloadJob,String> downloadJobStringHashMaps;
    private int maxTreads;
    private long timeOut;

    public DownloadManager configure(int maxThreads, long timeOut){
        return this;
    }
    public DownloadManager specifyDownloadLocation (URL url){
     //   this.url = url;
        return this;
    }

    public String startDownload() throws MalformedURLException {
        DownloadJob downloadJob = new DownloadJob(this.url);
        try {

            downloadJob.run();
            return downloadJob.getJobId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return downloadJob.getJobId();
    }

    public void cancelDownload(String jobID){

    }

    public static byte [] downloadFromURL ( URL url ) {
        byte[] file = new byte[]{1,2,3,4,5,6,7,8,9,0};
        return file; }



}
