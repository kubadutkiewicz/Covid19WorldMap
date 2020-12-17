package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Service;

@Service
public class Point {

    private double lat;
    private double lng;
    private String text;


    public Point(double lat, double lng, String text) {
        this.lat = lat;
        this.lng = lng;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
