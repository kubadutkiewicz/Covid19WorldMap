package com.example.springbootmapCovidConfirmed.Points;

import org.springframework.stereotype.Service;

@Service
public abstract class Point {

    private double lat;
    private double lng;
    private String covidData;

    public Point(double lat, double lng, String covidData) {
        this.lat = lat;
        this.lng = lng;
        this.covidData = covidData;
    }

    public Point() {
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getCovidData() {
        return covidData;
    }

    public void setCovidData(String covidData) {
        this.covidData = covidData;
    }
}
