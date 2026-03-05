package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps track of a list of City objects.
 * It allows adding cities and retrieving them in sorted order.
 */
public class CityList {
    /**
     * Internal list that stores the cities.
     */
    private List<City> cities=new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city This is a candidate city to add
     */
    public void add(City city) {
        if(cities.contains(city)){
            throw new IllegalArgumentException("City already exists");
        }

        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities(){

        List<City> sortedList=new ArrayList<>(cities);
        Collections.sort(sortedList);
        return sortedList;
    }

    /**
     * Checks if a city exists in the list.
     *
     * @param city The city to search for
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     *
     * @param city The city to delete
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException("City not found");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return number of cities
     */
    public int countCities(){
        return cities.size();
    }
}
