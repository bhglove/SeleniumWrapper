package main.com.github.bhglove.Selenium.java;

/**
 * Created by Benjamin on 7/12/19.
 */
public abstract class WebPage {
    protected Driver driver;

    public abstract boolean isPageLoaded();
    public abstract void execute();
    public abstract void setDriver(Driver driver);

    public WebPage() {

    }

}