package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.GetValuesFromUrlConfirmedData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidConfirmed {

    private GetValuesFromUrlConfirmedData getValuesFromUrlConfirmedData;
    private CovidDataParser covidDataParser;

    public CovidConfirmed(GetValuesFromUrlConfirmedData getValuesFromUrlConfirmedData, CovidDataParser covidDataParser) {
        this.getValuesFromUrlConfirmedData = getValuesFromUrlConfirmedData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidConfirmedDate() throws IOException {
        List<Point> points = covidDataParser.getCovidDataParser(getValuesFromUrlConfirmedData);
        return points;
    }
}
