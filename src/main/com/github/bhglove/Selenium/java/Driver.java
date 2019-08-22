package main.com.github.bhglove.Selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Benjamin on 7/12/19.
 */

public class Driver {
    protected String url;
    protected WebDriver driver;
    protected By by;
    protected WebElement element;

    public Driver(String url)
    {
        this.url = url;

        // todo: create a new driver via factory
    }

    public Driver (String url, WebDriver driver, By by, WebElement element) {
        this.url = url;
        this.driver = driver;
        this.by = by;
        this.element = element;
    }

    private WebElement find(String selector) {
        WebElement element = null;

        try {
            this.by = By.cssSelector(selector);
            List<WebElement> elements = this.driver.findElements(this.by);
            for(WebElement e : elements) {
                if(e.isDisplayed()) {
                    element = e;
                    break;
                }
            }
        } catch (NoSuchElementException exception) {

        }


        return element;
    }

    public Driver url(String url) {
        this.driver.get(url);
        return this;
    }



}