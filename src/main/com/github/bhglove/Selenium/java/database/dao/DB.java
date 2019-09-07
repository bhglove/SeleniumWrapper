package main.com.github.bhglove.Selenium.java.database.dao;

import main.com.github.bhglove.Selenium.java.database.model.Vehicle;
import main.com.github.bhglove.Selenium.java.library.database.Serializable;

/**
 * Created by Benjamin on 8/24/19.
 */
public class DB<V> implements Serializable<Vehicle>{
    @Override
    public int create(Vehicle object) {
        object.vroom();
        return 0;
    }

    @Override
    public int createOrFirst(Vehicle object) {
        return 0;
    }

    @Override
    public Vehicle retrieve(String id) {
        return null;
    }

    @Override
    public void update(int id, Vehicle object) {

    }

    @Override
    public void delete(Vehicle object) {

    }
}
