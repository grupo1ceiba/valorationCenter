package com.valoracion.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DTOValue {

    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("currency")
    @Expose
    private String currency;

    public DTOValue() {
    }

    public DTOValue(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "DTOValue{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
