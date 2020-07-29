package main.pruefungsvorbereitung.aufgabe3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class DownloadJob extends Thread {
    private URL url; //= new URL("keine");
    private byte[] file;
    private String jobId;

    public DownloadJob(URL url) throws MalformedURLException {
        this.url = url;
    }

    @Override
    public void run(){
        this.file=DownloadManager.downloadFromURL(this.url);
        this.jobId = UUID.randomUUID().toString();
    }

    public byte[] getFile() {
        return file;
    }

    public String getJobId() {
        return jobId;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }
}
