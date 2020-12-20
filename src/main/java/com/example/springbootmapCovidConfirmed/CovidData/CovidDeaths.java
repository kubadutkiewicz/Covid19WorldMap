package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Date;
import com.example.springbootmapCovidConfirmed.Points.PointDeath;
import com.example.springbootmapCovidConfirmed.UrlReader.UrlDeathsReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CovidDeaths {

    private UrlDeathsReader urlDeathsReader;
    private Date date;

    public CovidDeaths(UrlDeathsReader urlDeathsReader, Date date) {
        this.urlDeathsReader = urlDeathsReader;
        this.date = date;
    }

    public List<PointDeath> getCovidDeathsData() throws IOException {

        List<PointDeath> points = new ArrayList<>();

        CSVParser parse = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(urlDeathsReader.getValuesCovidDeaths());

        for (CSVRecord strings : parse) {
            double lat = NumberUtils.toDouble(strings.get("Lat"));
            double lng = NumberUtils.toDouble(strings.get("Long"));
            try {
                String covidDeaths = strings.get(date.getDate());
                points.add(new PointDeath(lat, lng, covidDeaths));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex);
                break;
            }
        }
        return points;
    }
}
