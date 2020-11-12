package com.example.springbootmapCovidConfirmed;


public class Point {

    private double lat;
    private double lon;
    private String dateCovid = "11/11/20";


    public Point(double lat, double lon, String dateCovid) {
        this.lat = lat;
        this.lon = lon;
        this.dateCovid = dateCovid;
    }

    public Point() {
    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getDateCovid() {
        return dateCovid;
    }

    public void setDateCovid(String dataCovid) {
        this.dateCovid = dataCovid;
    }

}
