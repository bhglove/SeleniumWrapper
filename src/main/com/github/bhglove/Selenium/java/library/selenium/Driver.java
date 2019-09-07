package main.com.github.bhglove.Selenium.java.library;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

/**
 * Created by Benjamin on 7/12/19.
 */

public class Driver {


    protected String url;
    protected WebDriver driver;
    protected By by;
    protected WebElement element;
    private int count = 0;

    public Driver(String url)
    {   this.url = url;
        this.driver = DriverFactory.get(DriverType.get(System.getenv("WEB_DRIVER_BROWSER")));
        this.driver.get(url);
    }

    public Driver (String url, WebDriver driver, By by, WebElement element) {
        this.url = url;
        this.driver = driver;
        this.by = by;
        this.element = element;
    }

    private WebElement find(String selector) throws SeleniumException, RetryException {
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
            throw new SeleniumException("Element is not found!");
        } catch (InvalidSelectorException exception) {
            retry("find", null);
        }

        if(element == null) {
            retry("find", null);
        }

        return element;
    }

    public Driver url(String url) {
        this.driver.get(url);
        return this;
    }

    public boolean has(String selector) throws SeleniumException, RetryException {
        WebElement element = find(selector);
        return element != null;
    }

    public Driver click() {
        //TODO: finish this
        return this;
    }

    public Driver click(String selector) throws SeleniumException, RetryException {
        if(selector == null || selector.length() == 0) {
            throw new SeleniumException("Selector is invalid.");
        }

        try {
            find(selector).click();
        } catch (Exception exception) {
            wait(selector);
        }

        return this;
    }

    public Driver fill(String string) throws RetryException {
        try {
            //TODO: finish
            WebElement element = find("");
            this.element.clear();
            this.element.sendKeys(string);

        } catch (RetryException | SeleniumException exception) {
            retry("fill", null);
        }

        return this;
    }

    public Driver toggle() {
        //TODO: finish
        return this;
    }

    public Driver upload(String selector, File file) throws FileNotFoundException, RetryException {

        try{
            if(!file.exists()) {
                throw new FileNotFoundException("Unable to locate file!");
            }

            select(selector);
            fill(file.getAbsolutePath());
        } catch(Exception exception) {
            this.driver.navigate().refresh();
            retry("selector", null);
        }
        return this;
    }

    public Driver simulate(Keys key) {
        this.element.sendKeys(key.toString());
        return this;
    }

    public void close() {
        this.driver.close();
    }


    // TODO: Look up the command pattern
    private void retry(String method, Object object) throws RetryException {
        if(this.count == 3) {
            throw new RetryException("Unable to retry ");
        }

        //TODO: finish this
    }


    private void wait(String selector) {
        WebDriverWait wait = new WebDriverWait(this.driver, Long.valueOf(System.getenv("DRIVER_TIMEOUT")));
        wait.until(null);
    }

    public void waitUntilValidated() {
        //TODO: finish this
    }

    public Driver select(String selector) {
        //TODO: finish this
        return this;
    }


}