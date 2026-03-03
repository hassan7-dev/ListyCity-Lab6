package com.example.listycity;

/**
 * This class represents a City.
 * It stores the name of the city and the province it belongs to.
 */
public class City implements Comparable{
    /**
     * Name of the city
     */
    private String city;

    /**
     * Name of the province
     */
    private String province;

    /**
     * Constructor to create a City object.
     *
     * @param city Name of the city
     * @param province Name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     *
     * @return city name
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Returns the province name.
     *
     * @return province name
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * Compares this city with another city
     * based on the city name.
     *
     * @param o The object to compare with
     * @return negative, zero, or positive integer
     */
    @Override
    public int compareTo(Object o) {
        City city=(City) o;
        return this.city.compareTo(city.getCity());
    }
}
