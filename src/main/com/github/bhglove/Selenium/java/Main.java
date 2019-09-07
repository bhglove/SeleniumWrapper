package main.com.github.bhglove.Selenium.java;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // the goal:
        // for a given state, loop through each county
        // in that county, get every car listed under the defined dealerships

        List<County> counties = new State("SC").getCounties();

        for(County county : counties) {

        }
    }
}
