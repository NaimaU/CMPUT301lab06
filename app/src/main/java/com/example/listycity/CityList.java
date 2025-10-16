package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * When given a city, return whether or not it belongs in the list.
     * @param city
     *      This is a candidate city
     * @return
     *      Return whether or not the given city belongs in the list
     */
    public Boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Checks if a city is present in the list. If it is, then remove it from the list.
     * If not, then throw an exception.
     * @param city
     *      This is a candidate city to delete
     */
    public void delete(City city) {
        if (!(cities.remove(city))) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts number of cities in cityList.
     * @return
     *      Return count of cities in cityList.
     */
    public int countCities() {
        return cities.size();
    }

}
