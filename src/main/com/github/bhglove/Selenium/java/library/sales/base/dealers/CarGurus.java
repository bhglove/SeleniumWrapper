package main.com.github.bhglove.Selenium.java.library.sales.base.dealers;

import main.com.github.bhglove.Selenium.java.database.model.Vehicle;
import main.com.github.bhglove.Selenium.java.library.sales.base.VehicleListing;
import main.com.github.bhglove.Selenium.java.library.sales.base.VehicleListingTemplate;

import java.util.List;

/**
 * Created by Benjamin on 8/28/19.
 */
public class CarGurus extends VehicleListingTemplate {
    private VehicleListing listing;

    public CarGurus() {

    }

    @Override
    public List<Vehicle> getVehicles() {
        return listing.vehicles;
    }

    @Override
    public int totalPages() {
        return listing.totalPages;
    }

    @Override
    public int totalListings() {
        return listing.totalListings;
    }

    @Override
    public boolean includeSponsoredAds() {
        return listing.includeSponsoredAds;
    }
}
