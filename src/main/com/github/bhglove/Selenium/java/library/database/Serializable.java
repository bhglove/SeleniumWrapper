package main.com.github.bhglove.Selenium.java.library.database;

/**
 * Created by Benjamin on 8/24/19.
 */
public interface Serializable<T> {

    public int create(T object);
    public int createOrFirst(T object);
    public T retrieve(String id);
    public void update(int id, T object);
    public void delete(T object);

}
