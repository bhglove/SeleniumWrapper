package main.com.github.bhglove.Selenium.java.library;

import org.openqa.selenium.WebDriver;

/**
 * Created by Benjamin on 8/22/19.
 */
public class DriverFactory {


    public static WebDriver get(DriverType type) {
        WebDriver driver = null;
        switch(type) {
            case CHROME:
            break;
            case FIREFOX:
            break;
            case IE:
            break;
            case SAFARI:
            break;
            default:

        }

        return driver;
    }
}
