package com.valoracion.dto;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DTOAddress {

    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("streetValue")
    @Expose
    private Integer streetValue;
    @SerializedName("cardinal")
    @Expose
    private String cardinal;
    @SerializedName("avenueValue")
    @Expose
    private Integer avenueValue;
    @SerializedName("ordinal")
    @Expose
    private String ordinal;
    @SerializedName("pointValue")
    @Expose
    private Integer pointValue;

    public DTOAddress() {
    }

    public DTOAddress(String street, Integer streetValue, String cardinal, Integer avenueValue, String ordinal, Integer pointValue) {
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

    public Integer getStreetValue() {
        return streetValue;
    }

    public void setStreetValue(Integer streetValue) {
        this.streetValue = streetValue;
    }

    public String getCardinal() {
        return cardinal;
    }

    public void setCardinal(String cardinal) {
        this.cardinal = cardinal;
    }

    public Integer getAvenueValue() {
        return avenueValue;
    }

    public void setAvenueValue(Integer avenueValue) {
        this.avenueValue = avenueValue;
    }

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
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
