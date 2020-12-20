package com.example.springbootmapCovidConfirmed.UrlReader;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;

@Service
public class UrlDeathsReader {

    private static final String urlCovidDeaths = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";

    public StringReader getValuesCovidDeaths() {
        RestTemplate restTemplate = new RestTemplate();
        String values = restTemplate.getForObject(urlCovidDeaths,String.class);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
