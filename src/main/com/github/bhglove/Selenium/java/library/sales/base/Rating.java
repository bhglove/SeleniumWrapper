package main.com.github.bhglove.Selenium.java.library.sales.base;

/**
 * Created by Benjamin on 8/28/19.
 */
public class Rating {
    private double score;
    private double total;

    public Rating(double score, double total) throws Exception {
        this.score = score;
        this.total = total;

        if(this.total == 0) {
            throw new Exception("Total can not be zero!");
        }
    }

    public double getScore() {
        return score / total;
    }
}
