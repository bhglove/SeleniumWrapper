package main.com.github.bhglove.Selenium.java;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Benjamin on 7/12/19.
 */
public class Worker {
    protected Driver driver;
    protected ArrayList<WebPage> webPages;

    /**
     *
     * @param url
     */
    public Worker(String url) {
        this.driver = new Driver(url);
    }

    public void addPage(WebPage page) {

    }

    public void execute() {

    }

    public void retry() {

    }
}
