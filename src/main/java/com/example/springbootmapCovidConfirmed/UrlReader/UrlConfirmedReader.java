package com.example.springbootmapCovidConfirmed.UrlReader;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;

@Service
public class UrlConfirmedReader implements UrlReader{

    private static final String urlCovidConfirmed = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    public StringReader getValues() {
        RestTemplate restTemplate = new RestTemplate();
        String values = restTemplate.getForObject(urlCovidConfirmed,String.class);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
