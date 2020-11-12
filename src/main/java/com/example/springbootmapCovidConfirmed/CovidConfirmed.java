package com.example.springbootmapCovidConfirmed;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CovidConfirmed {


    public List<Point> getCovidDate() throws IOException {
        List<Point> points = new ArrayList<>();

        CSVParser parse = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(new UrlReader().getValues());

        for (CSVRecord strings : parse) {
            double lat = Double.parseDouble(strings.get("Lat"));
            double lon = Double.parseDouble(strings.get("Long"));
            try {
            String text = strings.get(new Point().getDateCovid());
                points.add(new Point(lat, lon, text));
            } catch (IllegalArgumentException ex) {
                System.out.println("Nie posiadamy informacji na temat tej daty.");
                break;
            }
        }
        return points;
    }
}
