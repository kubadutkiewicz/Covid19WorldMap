package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Date;
import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.ValuesFromUrl;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CovidDataParser {

    private Date date;

    private CovidDataParser(Date date) {
        this.date = date;
    }

    List<Point> getCovidDataParser(ValuesFromUrl valuesFromUrl) throws IOException {
        List<Point> points = new ArrayList<>();
        CSVParser parse = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(valuesFromUrl.getValuesFromUrlFiles());
        for (CSVRecord strings : parse) {
            try {
                double lat = NumberUtils.toDouble(strings.get("Lat"));
                double lng = NumberUtils.toDouble(strings.get("Long"));
                String text = strings.get(date.getDate());
                points.add(new Point(lat, lng, text));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex);
                break;
            }
        }
        return points;
    }
}
