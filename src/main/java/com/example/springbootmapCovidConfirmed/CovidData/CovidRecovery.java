package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.GetValuesFromUrlRecoveryData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidRecovery {

    private GetValuesFromUrlRecoveryData getValuesFromUrlRecoveryData;
    private CovidDataParser covidDataParser;

    public CovidRecovery(GetValuesFromUrlRecoveryData getValuesFromUrlRecoveryData, CovidDataParser covidDataParser) {
        this.getValuesFromUrlRecoveryData = getValuesFromUrlRecoveryData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidRecoveryData() throws IOException {
        List<Point> points = covidDataParser.getCovidDataParser(getValuesFromUrlRecoveryData);
        return points;
    }
}
