package main.com.github.bhglove.Selenium.java.database.model;

import main.com.github.bhglove.Selenium.java.library.sales.base.Rating;

/**
 * Created by Benjamin on 8/24/19.
 */
public class Car implements Vehicle {

    @Override
    public Rating getRating() {
        return null;
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public void vroom() {
        System.out.println("Car: Vroom!");
    }
}
