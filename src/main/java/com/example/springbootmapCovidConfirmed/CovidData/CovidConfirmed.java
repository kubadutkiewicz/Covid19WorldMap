package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.ConfirmedData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidConfirmed {

    private ConfirmedData confirmedData;
    private CovidDataParser covidDataParser;

    public CovidConfirmed(ConfirmedData confirmedData, CovidDataParser covidDataParser) {
        this.confirmedData = confirmedData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidConfirmedDate() throws IOException {
        List<Point> points = covidDataParser.getCovidDataParser(confirmedData);
        return points;
    }
}
