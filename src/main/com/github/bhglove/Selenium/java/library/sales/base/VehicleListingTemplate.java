package main.com.github.bhglove.Selenium.java.library.sales.base;

import main.com.github.bhglove.Selenium.java.database.model.Vehicle;

import java.util.List;

/**
 * Created by Benjamin on 8/28/19.
 */
public abstract class VehicleListingTemplate {
    public abstract List<Vehicle> getVehicles();

    public abstract int totalPages();
    public abstract int totalListings();

    public abstract boolean includeSponsoredAds();

}
