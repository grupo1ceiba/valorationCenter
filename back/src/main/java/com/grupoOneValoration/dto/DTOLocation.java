package com.grupoOneValoration.dto;

public class DTOLocation {

    private String country;
    private String city;

    public DTOLocation() {
    }

    public DTOLocation(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DTOLocation{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
