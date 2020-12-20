package com.example.springbootmapCovidConfirmed.UrlReader;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;

@Service
public class UrlDeathsReader implements UrlReader {

    private static final String urlDeathsReader = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";

    @Override
    public StringReader getValues() {
        RestTemplate restTemplate = new RestTemplate();
        String values = restTemplate.getForObject(urlDeathsReader,String.class);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
