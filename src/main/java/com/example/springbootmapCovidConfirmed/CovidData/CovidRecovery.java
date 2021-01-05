package com.example.springbootmapCovidConfirmed.CovidData;

import com.example.springbootmapCovidConfirmed.Point;
import com.example.springbootmapCovidConfirmed.UrlData.RecoveryData;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CovidRecovery {

    private RecoveryData recoveryData;
    private CovidDataParser covidDataParser;

    public CovidRecovery(RecoveryData recoveryData, CovidDataParser covidDataParser) {
        this.recoveryData = recoveryData;
        this.covidDataParser = covidDataParser;
    }

    public List<Point> getCovidRecoveryData() throws IOException {
        List<Point> points = covidDataParser.getCovidDataParser(recoveryData);
        return points;
    }
}
