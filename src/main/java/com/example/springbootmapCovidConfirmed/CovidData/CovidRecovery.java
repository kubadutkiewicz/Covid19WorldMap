package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Points.PointConfirmed;
import com.example.springbootmapCovidConfirmed.UrlReader.UrlRecoveryReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CovidRecovery {

    private UrlRecoveryReader urlRecoveryReader;

    public CovidRecovery(UrlRecoveryReader urlRecoveryReader) {
        this.urlRecoveryReader = urlRecoveryReader;
    }

    public List<PointConfirmed> getCovidRecoveryData() throws IOException {

        List<PointConfirmed> points = new ArrayList<>();

        CSVParser parse = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(urlRecoveryReader.getValuesCovidRecovery());

        for (CSVRecord strings : parse) {
            double lat = NumberUtils.toDouble(strings.get("Lat"));
            double lng = NumberUtils.toDouble(strings.get("Long"));
            try {
                String covidRecovery = strings.get("12/19/20");
                points.add(new PointConfirmed(lat, lng, covidRecovery));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex);
                break;
            }
        }
        return points;
    }
}
