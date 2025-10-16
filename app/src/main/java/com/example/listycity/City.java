package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Getter method for cityName
     * @return
     *      Return the cityName
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Getter method for provinceName
     * @return
     *      Return the provinceName
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares the current city name with the name of the other city. Overridden from Comparable interface.
     * @param o the object (city) to be compared.
     * @return
     *      Returns 0 if the two city names are equal.
     */
    @Override
    public int compareTo(City o) {
        City city = o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}
