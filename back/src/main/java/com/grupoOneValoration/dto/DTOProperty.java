package com.grupoOneValoration.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DTOProperty {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("stratum")
    @Expose
    private String stratum;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("value")
    @Expose
    private DTOValue value;
    @SerializedName("address")
    @Expose
    private DTOAddress address;
    @SerializedName("location")
    @Expose
    private DTOLocation location;
    @SerializedName("insurance")
    @Expose
    private DTOValue insurance;

    public DTOProperty() {
    }

    public DTOProperty(String id, String area, String stratum, String type, DTOValue value, DTOAddress address,
                       DTOLocation location, DTOValue insurance) {
        this.id = id;
        this.area = area;
        this.stratum = stratum;
        this.type = type;
        this.value = value;
        this.address = address;
        this.location = location;
        this.insurance = insurance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStratum() {
        return stratum;
    }

    public void setStratum(String stratum) {
        this.stratum = stratum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DTOValue getValue() {
        return value;
    }

    public void setValue(DTOValue value) {
        this.value = value;
    }

    public DTOAddress getAddress() {
        return address;
    }

    public void setAddress(DTOAddress address) {
        this.address = address;
    }

    public DTOLocation getLocation() {
        return location;
    }

    public void setLocation(DTOLocation location) {
        this.location = location;
    }

    public DTOValue getInsurance() {
        return insurance;
    }

    public void setInsurance(DTOValue insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "DTOProperty{" +
                "id='" + id + '\'' +
                ", area='" + area + '\'' +
                ", stratum='" + stratum + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                ", address=" + address +
                ", location=" + location +
                ", insurance=" + insurance +
                '}';
    }
}
