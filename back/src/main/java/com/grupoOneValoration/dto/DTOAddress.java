package com.grupoOneValoration.dto;

public class DTOAddress {

    private String street;
    private String streetValue;
    private String cardinal;
    private String avenueValue;
    private String ordinal;
    private String pointValue;

    public DTOAddress() {
    }

    public DTOAddress(String street, String streetValue, String cardinal, String avenueValue, String ordinal, String pointValue) {
        this.street = street;
        this.streetValue = streetValue;
        this.cardinal = cardinal;
        this.avenueValue = avenueValue;
        this.ordinal = ordinal;
        this.pointValue = pointValue;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetValue() {
        return streetValue;
    }

    public void setStreetValue(String streetValue) {
        this.streetValue = streetValue;
    }

    public String getCardinal() {
        return cardinal;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public String getAvenueValue() {
        return avenueValue;
    }

    public void setAvenueValue(String avenueValue) {
        this.avenueValue = avenueValue;
    }

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public String getPointValue() {
        return pointValue;
    }

    public void setPointValue(String pointValue) {
        this.pointValue = pointValue;
    }

    @Override
    public String toString() {
        return "DTOAddress{" +
                "street='" + street + '\'' +
                ", streetValue='" + streetValue + '\'' +
                ", cardinal='" + cardinal + '\'' +
                ", avenueValue='" + avenueValue + '\'' +
                ", ordinal='" + ordinal + '\'' +
                ", pointValue='" + pointValue + '\'' +
                '}';
    }
}
