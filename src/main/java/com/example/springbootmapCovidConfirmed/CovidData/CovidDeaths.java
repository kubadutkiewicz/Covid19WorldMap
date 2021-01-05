package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.GetValuesFromUrlDeathsData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidDeaths {

    private GetValuesFromUrlDeathsData getValuesFromUrlDeathsData;
    private CovidDataParser covidDataParser;

    public CovidDeaths(GetValuesFromUrlDeathsData getValuesFromUrlDeathsData, CovidDataParser covidDataParser) {
        this.getValuesFromUrlDeathsData = getValuesFromUrlDeathsData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidDeathsData() throws IOException {

        List<Point> points = covidDataParser.getCovidDataParser(getValuesFromUrlDeathsData);
        return points;
    }

}
