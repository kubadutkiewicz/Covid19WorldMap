package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Date;
import com.example.springbootmapCovidConfirmed.Points.PointConfirmed;
import com.example.springbootmapCovidConfirmed.UrlData.GetValuesFromUrlConfirmedData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CovidConfirmed {

    private GetValuesFromUrlConfirmedData urlConfirmedData;
    private Date date;

    public CovidConfirmed(GetValuesFromUrlConfirmedData urlConfirmedData, Date date) {
        this.urlConfirmedData = urlConfirmedData;
        this.date = date;
    }

    public List<PointConfirmed> getCovidDate() throws IOException {

        List<PointConfirmed> points = new ArrayList<>();

        CSVParser parse = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(urlConfirmedData.getValuesFromUrlFiles());

        for (CSVRecord strings : parse) {
            double lat = NumberUtils.toDouble(strings.get("Lat"));
            double lng = NumberUtils.toDouble(strings.get("Long"));
            try {
                String text = strings.get(date.getDate());
                points.add(new PointConfirmed(lat, lng, text));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex);
                break;
            }
        }
        return points;
    }
}
