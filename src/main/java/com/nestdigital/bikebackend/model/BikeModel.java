package com.nestdigital.bikebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bikes")
public class BikeModel {

    @Id
    @GeneratedValue

    private int id;
    private String bikename;
    private String bikecompany;
    private int bikeprice;

    public BikeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBikename() {
        return bikename;
    }

    public void setBikename(String bikename) {
        this.bikename = bikename;
    }

    public String getBikecompany() {
        return bikecompany;
    }

    public void setBikecompany(String bikecompany) {
        this.bikecompany = bikecompany;
    }

    public int getBikeprice() {
        return bikeprice;
    }

    public void setBikeprice(int bikeprice) {
        this.bikeprice = bikeprice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public BikeModel(int id, String bikename, String bikecompany, int bikeprice, String colour) {
        this.id = id;
        this.bikename = bikename;
        this.bikecompany = bikecompany;
        this.bikeprice = bikeprice;
        this.colour = colour;
    }

    private String colour;
}
