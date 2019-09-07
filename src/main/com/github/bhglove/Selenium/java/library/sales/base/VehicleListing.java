package main.com.github.bhglove.Selenium.java.library.sales.base;

import main.com.github.bhglove.Selenium.java.database.model.Vehicle;

import java.util.List;

/**
 * Created by Benjamin on 8/28/19.
 */
public class VehicleListing {
    public List<Vehicle> vehicles;

    public int totalPages;
    public int totalListings;

    public boolean includeSponsoredAds;
}
