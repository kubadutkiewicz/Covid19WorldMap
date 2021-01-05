package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.DeathsData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidDeaths {

    private DeathsData deathsData;
    private CovidDataParser covidDataParser;

    public CovidDeaths(DeathsData deathsData, CovidDataParser covidDataParser) {
        this.deathsData = deathsData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidDeathsData() throws IOException {

        List<Point> points = covidDataParser.getCovidDataParser(deathsData);
        return points;
    }

}
