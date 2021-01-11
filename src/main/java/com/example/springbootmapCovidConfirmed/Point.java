package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Service;

@Service
public class Point {

    public double lat;
    public double lng;
    public String covidData;

    public Point(double lat, double lng, String covidData) {
        this.lat = lat;
        this.lng = lng;
        this.covidData = covidData;
    }

    public Point() {
    }

    private double getLat() {
        return lat;
    }

    private void setLat(double lat) {
        this.lat = lat;
    }

    private double getLng() {
        return lng;
    }

    private void setLng(double lng) {
        this.lng = lng;
    }

    private String getCovidData() {
        return covidData;
    }

    private void setCovidData(String covidData) {
        this.covidData = covidData;
    }
}
